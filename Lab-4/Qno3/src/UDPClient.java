import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            String message = "Hello, Server!";
            byte[] buffer = message.getBytes();

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 8080);
            clientSocket.send(packet);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
