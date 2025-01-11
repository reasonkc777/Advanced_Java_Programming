import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
            String query = "SELECT * FROM salary WHERE emp_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Employee ID:");
            int emp_id = sc.nextInt();
            pstmt.setInt(1, emp_id);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("emp_name") + ", Salary: " + rs.getDouble("emp_salary"));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
