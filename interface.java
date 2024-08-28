import javax.swing.*;
import java.awt.event.ActionListener; // Interface
import java.awt.event.ActionEvent;
class MyFrame implements ActionListener {
	JFrame f;
	JButton b1, b2;
	public MyFrame() {
		f = new JFrame();
		b1 = new JButton("Button1");
		b1.setBounds(50, 50, 300, 100);
		b1.addActionListener(this);
		b2 = new JButton("Button2");
		b2.setBounds(50, 170, 300, 100);
		b2.addActionListener(this);
		f.add(b1);
		f.add(b2);
		f.setTitle("Example");
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "You Clicked Button1");
		}
		if (e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "You Clicked Button2");
		}
	}
	
}
 
public class Interface{
	public static void main(String[] args) {
		new MyFrame();
	}
}
 