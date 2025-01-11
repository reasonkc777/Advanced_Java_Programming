import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            // Create the URL object
            URL url = new URL("https://achsnepal.edu.np");

            // Open a connection and cast it to HttpURLConnection for advanced handling
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method (GET by default) and User-Agent to simulate a browser
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Get the response code to handle any redirects or errors
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Check if the request was successful (HTTP 200 OK)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("Error: " + connection.getResponseMessage());
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
