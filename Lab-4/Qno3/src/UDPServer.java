import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(8080);
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("Server is listening...");
            serverSocket.receive(packet);

            String clientMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Client says: " + clientMessage);

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
