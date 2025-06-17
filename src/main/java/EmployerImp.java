import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployerImp {
    private Statement stmt;
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement pst;
    public EmployerImp() {
        conn=DatabaseConnection.getInstance().getConnection();
    }
    public void createEmployer(){

    }
}
