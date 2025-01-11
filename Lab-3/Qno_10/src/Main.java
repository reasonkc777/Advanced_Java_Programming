import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO qno10 (id, name) VALUES (1, 'Iowa')");
            stmt.executeUpdate("INSERT INTO qno10 (id, name) VALUES (2, 'Dakota')");

            // Uncomment below to rollback
            // conn.rollback();

            conn.commit();
            System.out.println("Transaction committed.");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
