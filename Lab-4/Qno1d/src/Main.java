import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        try {
            // Pass only the domain name (without the protocol 'https://')
            InetAddress address = InetAddress.getByName("achsnepal.edu.np");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
