import java.awt.*;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class taskCombo {
    public static void main(String[] args) {
        // 1. Create a new ComboBox and add items to it.
        JFrame frame = new JFrame("Text Area Example");
        frame.setSize(1000,600);
        frame.setResizable(false);
        frame.setLayout(null);
        JScrollPane pane = new JScrollPane();
         pane.setBounds(50,50,600,1000);
          
        JTextArea area = new JTextArea();
        area.setBounds(50,50,1000,1000);
        area.setFont(new Font("Cascadia code",Font.BOLD,20));
        area.setText("this is bluelock\n".repeat(50));
        pane.setViewportView(area);

        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        //String[] boxItems = {"employee table"," department table "," campus table"};
        // JComboBox<String> comboBox = new JComboBox<>(boxItems);
       
        // comboBox.setBounds(100,100,150,150);


        // frame.add(comboBox);
        
    }
}
