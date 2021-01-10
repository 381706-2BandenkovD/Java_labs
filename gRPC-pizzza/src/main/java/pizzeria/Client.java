package pizzeria;

import grpc.*;
import grpc.EchoServiceGrpc;
import io.grpc.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        EchoServiceGrpc.EchoServiceBlockingStub client = createClient("localhost",8080);
        System.out.println("welcome pizzeria");
        System.out.println("USE: menu, order, status ");
        Scanner console = new Scanner(System.in);
        String message;
        while((message = console.nextLine())!=null){
            requestForm(client, message, console);
        }
        console.close();
    }

    private static int requestForm(EchoServiceGrpc.EchoServiceBlockingStub client, String message, Scanner console) {
        String[] req = message.trim().split(" ");
        if (req[0].equals("menu")){
            pizzaRequest request = pizzaRequest.newBuilder().build();
            pizzaResponse response = client.pilist(request);
            int size = response.getNameCount();
            for(int i = 0; i < size; ++i){
                System.out.println("Id: " + response.getId(i) + " PIIZZA" + response.getName(i));
            }

        } else if (req[0].equals("order")) {
            System.out.print("Input index: ");
            int index = console.nextInt();
            System.out.print("Input num: ");
            int num = console.nextInt();
            orderRequest newrequest = orderRequest.newBuilder()
                    .setIndex(index)
                    .setNumm(num)
                    .build();
            orderResponse respon = client.orderpizaa(newrequest);
            System.out.println("response="+respon.getAnsver());
        } else if (req[0].equals("status")) {
            System.out.print("Input number: ");
            int number = console.nextInt();
            numRequest numrequest = numRequest.newBuilder().setNumber(number).build();
            numResponse nresponse = client.numclient(numrequest);
            System.out.println("response="+nresponse.getStatus());
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
