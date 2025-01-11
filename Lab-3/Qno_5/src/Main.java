import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");

            // Insert
            String insertQuery = "INSERT INTO qno5 (id, name) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Prem");
            pstmt.executeUpdate();

            // Retrieve and display all entries before the update
            String retrieveQuery = "SELECT * FROM qno5";
            pstmt = conn.prepareStatement(retrieveQuery);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Before Update:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // Retrieve and print the old entry before the update
            String selectOldEntry = "SELECT * FROM qno5 WHERE id = ?";
            pstmt = conn.prepareStatement(selectOldEntry);
            pstmt.setInt(1, 2);
            ResultSet oldResultSet = pstmt.executeQuery();
            if (oldResultSet.next()) {
                System.out.println("Old entry (Before Update): " +
                        "ID: " + oldResultSet.getInt("id") + ", Name: " + oldResultSet.getString("name"));
            }

            // Update
            String updateQuery = "UPDATE qno5 SET name = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, "Govinda");
            pstmt.setInt(2, 2);
            pstmt.executeUpdate();

            // Retrieve and print the new entry after the update
            String selectNewEntry = "SELECT * FROM qno5 WHERE id = ?";
            pstmt = conn.prepareStatement(selectNewEntry);
            pstmt.setInt(1, 2);
            ResultSet newResultSet = pstmt.executeQuery();
            if (newResultSet.next()) {
                System.out.println("New entry (After Update): " +
                        "ID: " + newResultSet.getInt("id") + ", Name: " + newResultSet.getString("name"));
            }

            // Retrieve and display all entries after the update
            System.out.println("\nAfter Update:");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // Delete
            String deleteQuery = "DELETE FROM qno5 WHERE id = ?";
            pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setInt(1, 2);
            pstmt.executeUpdate();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
