import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();  // Consume newline
            System.out.println("Enter Name:");
            String name = sc.nextLine();

            String query = "INSERT INTO qno3 (id, name) VALUES (" + id + ", '" + name + "')";
            stmt.executeUpdate(query);

            System.out.println("Row inserted successfully.");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
