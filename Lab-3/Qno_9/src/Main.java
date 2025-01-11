import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.CachedRowSet;

public class Main {
    public static void main(String[] args) {
        try {
            // JdbcRowSet
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/java");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("1234567890");
            jdbcRowSet.setCommand("SELECT * FROM qno9");
            jdbcRowSet.execute();
            while (jdbcRowSet.next()) {
                System.out.println("Name: " + jdbcRowSet.getString("name"));
            }

            // CachedRowSet
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl("jdbc:mysql://localhost:3306/java");
            cachedRowSet.setUsername("root");
            cachedRowSet.setPassword("1234567890");
            cachedRowSet.setCommand("SELECT * FROM qno9");
            cachedRowSet.execute();
            while (cachedRowSet.next()) {
                System.out.println("Cached Name: " + cachedRowSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
