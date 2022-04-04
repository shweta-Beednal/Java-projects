import java.sql.*;
import javax.swing.*;
public class connect{
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Airline_db?zeroDateTimeBehavior=convertToNull","root","");
//            JOptionPane.showMessageDialog(null,"connected to database");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
        public static void main(String[] args){
            ConnectDB();
        }
}