// import java.awt.BorderLayout;
// import java.sql.*;
// import java.util.Scanner;

// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javaz.swing.JComboBox;
// public class taskDataBase  {
//     public static void main(String[] args) {
//         //1.Connecting to the data base
//         //URL,name,password
//         JFrame frame = new JFrame("Text Area Example");

//         JComboBox<String> comboBox= new JComboBox<>();
//         add(comboBox,BorderLayout.NORTH);

//         frame.setSize(800 , 500);
//         frame.setResizable(true);
//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//         try{
//             String url = "jdbc:mysql://localhost:3306/JDB";
//             String user = "root";
//             String pass = "Vishwesh@666";
//              Connection con = DriverManager.getConnection(url, user, pass);
//              if(con != null){
//                  System.out.println("Database connected successfully");
//              }

//              Statement  stmt = con.createStatement();
//              ResultSet rs =stmt.executeQuery("select author from value");

//              while(rs.next()){
//                 String item =  rs.getString("author");
//                 comboBox.addItem(item);
//              }
//              Button button = new Button("Show Data",frame);
//              button.addActionListener((e)->{
//                    int index = comboBox.getSelectedIndex();
//                    String selectedAuthor = (String) comboBox.getItemAt(index);
//                    showData(selectedAuthor,frame);
//              });
//              TextArea textArea =new TextArea(24,70);
//              add(textArea, BorderLayout.CENTER);
//              setTitle("Task Database");
//              pack();

//              rs.close();
//              stmt.close();
//              con.close();
            
//             }

          
        
//         catch(SQLException e){
//             System.out.println("Error in connection : "+e);
//         }
       
//     }
//     //java -classpath ";C:\Users\vishu\Documents\connector\mysqlconnector.jar" dbconnect
//     // copy paste and execute the above code in the terminal 
// }


import java.awt.BorderLayout;
import java.awt.TextArea;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class taskDataBase {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Database Example");
        JComboBox<String> comboBox = new JComboBox<>();

        frame.setSize(800, 500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            String url = "jdbc:mysql://localhost:3306/JDB";
            String user = "root";
            String pass = "Vishwesh@666";
            Connection con = DriverManager.getConnection(url, user, pass);

            if (con != null) {
                System.out.println("Database connected successfully");
            }

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT author FROM value");

            while (rs.next()) {
                String item = rs.getString("author");
                comboBox.addItem(item);
            }

            JButton button = new JButton("Show Data");
            button.addActionListener((e) -> {
                int index = comboBox.getSelectedIndex();
                String selectedAuthor = (String) comboBox.getItemAt(index);
                showData(selectedAuthor);
            });

            frame.getContentPane().setLayout(new BorderLayout());
            frame.getContentPane().add(comboBox, BorderLayout.NORTH);
            frame.getContentPane().add(button, BorderLayout.SOUTH);
            frame.getContentPane().add(new TextArea(24, 70), BorderLayout.CENTER);
            frame. setTitle("Task Database");
            frame.pack();

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error in connection: " + e);
        }
        frame.setVisible(true);
    }

    private static void showData(String author) {
        // Here you can implement the logic to display data based on the selected author
        // For example, you could query the database for data related to the selected author
        // and display it in the TextArea.
        System.out.println("Selected author: " + author);
    }
}
