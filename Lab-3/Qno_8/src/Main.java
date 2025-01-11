import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM qno8");

            // Scrollable ResultSet
            rs.last();
            System.out.println("Last Record: " + rs.getString("name"));
            rs.first();
            System.out.println("First Record: " + rs.getString("name"));

            // Updatable ResultSet
            rs.absolute(1); // Move to first row
            rs.updateString("name", "Updated Name");
            rs.updateRow();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
