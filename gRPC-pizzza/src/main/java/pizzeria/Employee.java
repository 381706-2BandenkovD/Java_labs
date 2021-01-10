package pizzeria;

import grpc.*;
import grpc.EchoServiceGrpc;
import io.grpc.*;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        EchoServiceGrpc.EchoServiceBlockingStub employee = createClient("localhost",8080);
        System.out.println("Connected to employee server ");
        System.out.println("USE: menu, add, dell, change ");
        Scanner console = new Scanner(System.in);
        String message;
        while((message = console.nextLine())!=null){
            requestFormEmployee(employee, message, console);
        }
        console.close();

    }

    private static int requestFormEmployee(EchoServiceGrpc.EchoServiceBlockingStub employee, String message, Scanner console) {
        String[] req = message.trim().split(" ");
        if (req[0].equals("menu")){
            pizzaRequest request = pizzaRequest.newBuilder().build();
            pizzaResponse response = employee.pilist(request);
            int size = response.getNameCount();
            for(int i = 0; i < size; ++i){
                System.out.println("Id: " + response.getId(i) + " PIIZZA " + response.getName(i));
            }
        } else if (req[0].equals("add")){
            System.out.print("Input name: ");
            String namer = console.nextLine();
            System.out.print("Input description: ");
            String descrp = console.nextLine();
            System.out.print("Input cost: ");
            int costs = console.nextInt();
            newPizzaRequest newrequest = newPizzaRequest.newBuilder()
                    .setNamepiz(namer)
                    .setDescr(descrp)
                    .setCost(costs)
                    .build();
            newPizzaResponse responser = employee.pizadd(newrequest);
            System.out.println("response="+responser.getIdent());
        } else if (req[0].equals("dell")){
            System.out.print("Input id: ");
            int identif = console.nextInt();
            delRequest delrequest = delRequest.newBuilder().setId(identif).build();
            delResponse respons = employee.pidel(delrequest);
            System.out.println("response="+respons.getAns());
        } else if (req[0].equals("change")){
            System.out.print("Input order number: ");
            String ord = console.nextLine();
            int num = Integer.parseInt(ord);
            System.out.print("Input description: ");
            String change = console.nextLine();

            numEmplRequest numrequest = numEmplRequest.newBuilder()
                    .setNum(num)
                    .setStat(change)
                    .build();
            numEmplResponse numrespon = employee.numemployee(numrequest);
            System.out.println("response="+numrespon.getChange());
        }

        return 0;
    }

    private static EchoServiceGrpc.EchoServiceBlockingStub createClient(String host, int port){
        Channel channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext()
                .build();
        return EchoServiceGrpc.newBlockingStub(channel);
    }
}
