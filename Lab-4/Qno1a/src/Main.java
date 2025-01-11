import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com:8080/test?query=java");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
