import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    private static int[] portList = new int[255];
    private static int[] playerNumber = new int[255];
    private static int listElements = 0;
    private static int roomNumber = 0;
    private static ServerSocket listener = null;
    private static boolean portIsNotBusy = false;

    public Server() {
    }

    private static void displayPlayers(int room) {
        if (portList[room] != 0) {
            System.out.println(room + 1 + ". Room: " + playerNumber[room] + "/2 players.");
            if (playerNumber[room] < 2) {
                playerNumber[room]++;
            }
        }
    }
    private static void setPORT() {
        String portAsString = "8080";
        int portAsInt = Integer.parseInt(portAsString);
        portIsNotBusy = true;
        if (portIsNotBusy) {
            listElements = 0;

            for(int i = 0; i < 255; ++i) {
                if (portList[i] == 0) {
                    portList[i] = portAsInt;

                    for(int j = 0; j < 255; ++j) {
                        if (portList[j] != 0) {
                            ++listElements;
                        }
                    }
                    playerNumber[i] = 0;
                    roomNumber = i;
                    break;
                }
            }
        }
        portIsNotBusy = false;
    }

    public static void main(String[] args) throws Exception {
        Gomoky[] game = new Gomoky[255];
        for(int i = 0; i < 255; ++i) {
            game[i] = new Gomoky();
            playerNumber[i] = 0;
            portList[i] = 0;
        }
        setPORT();
        try {
            listener = new ServerSocket(portList[listElements - 1]);
        } catch (IOException var1) {
            System.out.println("Setting new ServerSocket problem!");
            var1.printStackTrace();
        }
        System.out.println("Server is Running on PORT: " + portList[listElements - 1]);

        displayPlayers(roomNumber);
        Gomoky.Player playerX = game[roomNumber].new Player(listener.accept(), 'X', portList[roomNumber]);
        displayPlayers(roomNumber);
        Gomoky.Player playerO = game[roomNumber].new Player(listener.accept(), 'O', portList[roomNumber]);
        displayPlayers(roomNumber);
        listener.close();

        playerX.setOpponent(playerO);
        playerO.setOpponent(playerX);
        game[roomNumber].currentPlayer = playerX;
        //start threads
        playerX.start();
        playerO.start();
    }
}