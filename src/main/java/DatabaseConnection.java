import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private String user = "bdr1";
    private String password = "bdr1";
    private DatabaseConnection() {
            try {
                System.out.println("loading ...");
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("connection established");
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public Connection getConnection() {
        return connection;
    }
}
