import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EnterpriseImp {
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;
    private Connection connection;
    public EnterpriseImp(){
        connection=DatabaseConnection.getInstance().getConnection();
    }
    public void create(){
        String sql="insert into Enterprise(id_e,name) values(?,?)";
        Scanner sc=new Scanner(System.in);

        try {
            pst= connection.prepareStatement(sql);
            pst.setString(1, sc.nextLine());
            pst.setString(2, sc.nextLine());
            pst.executeUpdate();
            System.out.println("Enterprise inserted");
        } catch (SQLException x) {
            System.err.println("la requête est incorrecte : "+x.getMessage());
        }
    }
    public void insertEnterprise(Enterprise e){
        String sql="insert into Enterprise(id_e,name) values(?,?)";

        try {
            pst= connection.prepareStatement(sql);
            pst.setString(1, e.getId_enter());
            pst.setString(2, e.getName());
            pst.executeUpdate();
            System.out.println("Enterprise inserted");
        } catch (SQLException x) {
            System.err.println("la requête est incorrecte : "+x.getMessage());
        }
    }
    public List<Enterprise> getAll(){
        List<Enterprise> list=new ArrayList<>();
        String sql="select * from Enterprise";
        try{
            st=connection.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                Enterprise ent=new Enterprise();
                ent.setId_enter(rs.getString("id_e"));
                ent.setName(rs.getString("name"));
                list.add(ent);
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return list;
    }
    public void deleteEnterprise(Enterprise e){
        String sql="delete from Enterprise where id_e=?";
        try{
            pst=connection.prepareStatement(sql);
            pst.setString(1,e.getId_enter());
            pst.executeUpdate();
            System.out.println("Enterprise "+e.getName()+ " deleted");
        }catch(SQLException x){
            System.err.println(x.getMessage());
        }
    }
    public Optional<Enterprise> getE(Enterprise e){
        String sql="select * from Enterprise where id_e=?";

        try{
            pst=connection.prepareStatement(sql);
            pst.setString(1,e.getId_enter());
            rs=pst.executeQuery();
            while(rs.next()){
                Enterprise ent=new Enterprise();
                ent.setId_enter(rs.getString("id_e"));
                ent.setName(rs.getString("name"));
                return Optional.of(ent);
            }
        }catch(SQLException x){
            System.err.println(x.getMessage());
        }
        return Optional.empty();



    }
}
