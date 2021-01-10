import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.*;


public class Client {
    private JFrame frame = new JFrame("Gomoky");
    private JLabel messageLabel = new JLabel("");

    private Color myColor;
    private Color opponentColor;

    private Square[][] board = new Square[15][15];
    private Square currentSquare;

    private Socket socket;
    private int PORT = 8080;
    private BufferedReader in;
    private PrintWriter out;

    static class Square extends JPanel {
        JLabel label = new JLabel((Icon)null);
        Square() {
            setBackground(Color.white);
            add(label);
        }
    }

    private Client(String serverAddress) throws Exception {
        socket = new Socket(serverAddress, PORT);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        messageLabel.setBackground(Color.lightGray);
        frame.getContentPane().add(messageLabel, "South");
        JPanel boardPanel = new JPanel();
        boardPanel.setBackground(Color.black);
        boardPanel.setLayout(new GridLayout(15, 15, 1, 1));
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                final int x = i;
                final int y = j;
                board[i][j] = new Square();
                board[i][j].addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        currentSquare = board[x][y];
                        out.println("MOVE (" + x + ',' + y + ")");}});
                boardPanel.add(board[i][j]);
            }
        }
        frame.getContentPane().add(boardPanel, "Center");
    }

    private void play() throws Exception {
        String response;
        try {
            response = in.readLine();
            if (response.startsWith("WELCOME")) {
                char mark = response.charAt(8);
                myColor = ((mark == 'X') ? Color.red : Color.black);
                opponentColor = (mark == 'X' ? Color.black : Color.red);
                frame.setTitle("Gomoky");
            }
            while (true) {
                response = in.readLine();
                if (response.startsWith("VALID_MOVE")) {
                    messageLabel.setText("Valid move, please wait");
                    //currentSquare.setIcon(icon);
                    currentSquare.setBackground(myColor);
                    currentSquare.repaint();
                } else if (response.startsWith("OPPONENT_MOVED")) {
                    int bracketOpen = response.indexOf('(');
                    int bracketClose = response.indexOf(')');
                    int comma = response.indexOf(',');
                    int locationX = Integer.parseInt(response.substring(bracketOpen+1,comma));
                    int locationY = Integer.parseInt(response.substring(comma+1,bracketClose));

                    board[locationX][locationY].setBackground(opponentColor);
                    board[locationX][locationY].repaint();
                    messageLabel.setText("Opponent moved, your turn");
                } else if (response.startsWith("VICTORY")) {
                    messageLabel.setText("You won");
                    break;
                } else if (response.startsWith("DEFEAT")) {
                    messageLabel.setText("You lost");
                    break;
                } else if (response.startsWith("TIE")) {
                    messageLabel.setText("You tied");
                    break;
                } else if (response.startsWith("MESSAGE")) {
                    messageLabel.setText(response.substring(8));
                } else if (response.startsWith("ERROR")) {
                    messageLabel.setText(response.substring(6));
                    break;
                }
            }
            out.println("QUIT");
        } finally {
            socket.close();
        }
    }

    public static void main(String[] args) {
        try {
            String hostname = InetAddress.getLocalHost().getHostName();
            Client client = new Client(hostname);
            client.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            client.frame.setSize(500, 500);
            client.frame.setVisible(true);
            client.frame.setResizable(true);
            client.play();
        }  catch (Exception e) {
            System.out.println("Connection LOST!");
            System.exit(1);
        }
    }
}