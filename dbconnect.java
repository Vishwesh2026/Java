// import java.sql.*;
// import java.util.Scanner;

// import javax.swing.JOptionPane;
// public class dbconnect {
//     public static void main(String[] args) {
//         //1.Connecting to the data base
//         //URL,name,password
//         try{
//             String url = "jdbc:mysql://localhost:3306/JDB";
//             String user = "root";
//             String pass = "Vishwesh@666";
//              Connection con = DriverManager.getConnection(url, user, pass);
//              if(con != null){
//                  System.out.println("Database connected successfully");
//              }
//              Statement st = con.createStatement() ; 
//              Scanner sc = new Scanner(System.in);
//              System.out.println("How many insertions: ");
//              int n =sc.nextInt() ;
//              for (int i=1;i<=n;i++) {
//                 String id = JOptionPane.showInputDialog("Enter id of employee"+ i);
//                 String  name = JOptionPane.showInputDialog("Enter Name of Employee "+i+":");
//                 String salary = JOptionPane.showInputDialog("Enter Address of Salary "+i + ":");
//                 String query =  "insert into emp values('" +id+"','"+name+"','"+salary+"') ";
//                 st.executeUpdate(query);
//              }
             
             
//              //st.executeQuery("insert into employee values(5785, "John", "SALEMAN",0,"02-12-91",1234,0,10)");  
//         }
//         catch(SQLException e){
//             System.out.println("Error in connection : "+e);
//         }
       
//     }
//     //java -classpath ";C:\Users\vishu\Documents\connector\mysqlconnector.jar" dbconnect
//     // copy paste and execute the above code in the terminal 
// }
import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class dbconnect {
    public static void main(String[] args) {
        //1.Connecting to the data base
        //URL,name,password
        try{
            String url = "jdbc:mysql://localhost:3306/JDB";
            String user = "root";
            String pass = "Vishwesh@666";
             Connection con = DriverManager.getConnection(url, user, pass);
             if(con != null){
                 System.out.println("Database connected successfully");
             }
              
            }
             catch(SQLException e){
            System.out.println("Error in connection : "+e);
        }
             
    }
}