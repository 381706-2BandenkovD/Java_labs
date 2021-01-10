package pizzeria;

import descpizza.PizzaInf;
import descpizza.PizzaOrder;
import grpc.EchoServiceGrpc;
import io.grpc.*;
import grpc.*;
import java.util.*;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;


public class PizzaServer extends EchoServiceGrpc.EchoServiceImplBase {
    Integer pizzaID = 1012;
    Integer numberOreder = 0;
    String stat ="accepted";
    HashMap<Integer, PizzaInf> hash;
    HashMap<Integer, PizzaOrder> order;
    HashMap<Integer, Integer> mapSumm;

    PizzaServer(){
        hash = new HashMap<Integer, PizzaInf>();
        order = new HashMap<Integer, PizzaOrder>();
        mapSumm = new HashMap<Integer,Integer>();
        PizzaInf pizza1 = new PizzaInf(1010, "Margarita", "o4en vkusnaya", 300);
        PizzaInf pizza2 = new PizzaInf(1011, "homeMade", "klass", 550);
        PizzaInf pizza3 = new PizzaInf(1012, "gusi.", "ogurchiki i pomidorki", 780);
        addPizzaInf(pizza1);
        addPizzaInf(pizza2);
        addPizzaInf(pizza3);
        addMapSumm(pizza1);
        addMapSumm(pizza2);
        addMapSumm(pizza3);
    }

    public void addPizzaInf(PizzaInf pizza) {
        hash.put(pizza.id, pizza);
    }
    public void addPizzaOrder(PizzaOrder ord) {
        order.put(ord.number, ord);
    }
    public void addMapSumm(PizzaInf inf) { mapSumm.put(inf.id, inf.cost); }

    @Override
    public void pilist(grpc.pizzaRequest request,
                       io.grpc.stub.StreamObserver<grpc.pizzaResponse> responseObserver) {
        pizzaResponse.Builder pizzaresponse = pizzaResponse.newBuilder();
        hash.forEach((k,v)->{
            pizzaresponse.addId(k);
            pizzaresponse.addName(v.toString());
        });
        pizzaResponse response = pizzaresponse.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void pizadd(grpc.newPizzaRequest request,
                       io.grpc.stub.StreamObserver<grpc.newPizzaResponse> responseObserver) {
        newPizzaResponse.Builder newpizzaresponse = newPizzaResponse.newBuilder();
        pizzaID++;
        PizzaInf pizzad = new PizzaInf(pizzaID, request.getNamepiz(), request.getDescr(), request.getCost());
        addPizzaInf(pizzad);
        addMapSumm(pizzad);
        newPizzaResponse addresponse = newpizzaresponse.setIdent(pizzaID).build();
        responseObserver.onNext(addresponse);
        responseObserver.onCompleted();
    }
    @Override
    public void pidel(grpc.delRequest request,
                      io.grpc.stub.StreamObserver<grpc.delResponse> responseObserver) {
        delResponse.Builder dellpizresponse = delResponse.newBuilder();
        Integer key = request.getId();
        hash.remove(key);
        delResponse dellresponse = dellpizresponse.setAns("success").build();
        responseObserver.onNext(dellresponse);
        responseObserver.onCompleted();
    }
    @Override
    public void orderpizaa(grpc.orderRequest request,
                           io.grpc.stub.StreamObserver<grpc.orderResponse> responseObserver) {
        orderResponse.Builder ordresponse = orderResponse.newBuilder();
        numberOreder++;
        int summa = mapSumm.get(request.getIndex());
        int k = request.getNumm();
        PizzaOrder neworder = new PizzaOrder(numberOreder, (k * summa), stat);
        addPizzaOrder(neworder);
        orderResponse oresponse = ordresponse.setAnsver(neworder.toString()).build();
        responseObserver.onNext(oresponse);
        responseObserver.onCompleted();
    }
    @Override
    public void numclient(grpc.numRequest request,
                          io.grpc.stub.StreamObserver<grpc.numResponse> responseObserver) {
        numResponse.Builder numresponse = numResponse.newBuilder();
        int num = request.getNumber();
        PizzaOrder stat = order.get(num);
        numResponse nresponse = numresponse.setStatus(stat.toStatus()).build();
        responseObserver.onNext(nresponse);
        responseObserver.onCompleted();
    }
    @Override
    public void numemployee(grpc.numEmplRequest request,
                            io.grpc.stub.StreamObserver<grpc.numEmplResponse> responseObserver) {
        numEmplResponse.Builder nemplresponse = numEmplResponse.newBuilder();
        int number = request.getNum();
        String modif = request.getStat();
        PizzaOrder statu = order.get(number);
        statu.status = modif;
        addPizzaOrder(statu);
        numEmplResponse numemplres = nemplresponse.setChange("changed").build();
        responseObserver.onNext(numemplres);
        responseObserver.onCompleted();
    }

    public static void main(String[] args) throws Exception{
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new PizzaServer()).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
