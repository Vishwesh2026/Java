
/*
        throws 
        Is used with a method to transfer exception  withot handling it method1() throws Exception

        If m1() throws an Exception and m2() calls m1(). m2() should provide the handling code for the exception being thrown from m1().

 */
/**
 * Author: omteja04
 * Description: ThrowsExample
 */

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 
 import javax.swing.JOptionPane;
 
 public class exampleofThrows {
     static Connection connection;
 
     static void connect(String url, String username, String password, String database) throws SQLException {
         connection = DriverManager.getConnection(url + database, username, password);
     }
 
     public static void main(String[] args) {
         try {
             connect("jdbc:mysql://localhost:3306/", "root", "Vishwesh@666", "JDB");
             if (connection != null) {
                 JOptionPane.showMessageDialog(null, "Successfully Connected", "Success", JOptionPane.INFORMATION_MESSAGE);
             }
         } catch (SQLException e) {
 
             JOptionPane.showMessageDialog(null, e.getMessage(), "Arere!!!", JOptionPane.ERROR_MESSAGE);
         }
 
     }
 }
 