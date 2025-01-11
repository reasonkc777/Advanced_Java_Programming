import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter roll number:");
            int roll_no = sc.nextInt();

            String query = "SELECT * FROM qno4 WHERE roll_no = " + roll_no;
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("course_name") + ": " + rs.getInt("marks_obtained"));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
