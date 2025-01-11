import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
            Statement stmt = conn.createStatement();

            String query = "INSERT INTO qno2 (id, name) VALUES (1, 'Airbus')";
            stmt.executeUpdate(query);

            System.out.println("Row inserted successfully.");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
