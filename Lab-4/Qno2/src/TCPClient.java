import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Hello, Server!");
            String serverMessage = in.readLine();
            System.out.println("Server says: " + serverMessage);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
