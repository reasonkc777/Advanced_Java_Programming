import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
            String query = "INSERT INTO qno6 (id, name) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Enter ID:");
                int id = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.println("Enter Name:");
                String name = sc.nextLine();

                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.executeUpdate();

                System.out.println("Do you want to add another record? (yes/no)");
                if (!sc.nextLine().equalsIgnoreCase("yes")) {
                    break;
                }
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
