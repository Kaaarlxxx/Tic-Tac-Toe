import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Base extends JFrame {
	 static final long serialVersionUID=0;
	 static JButton p1,p2,p3,p4,p5,p6,p7,p8,p9;
	 char sign = 'O';
	 JLabel txt1;
	 public Base(){
		 super( "Tic Tac Toe");
		 Font fnt=new Font("Serif", Font.BOLD, 20);
		 p1 = new JButton("");
		 p1.setBounds(0,0,100,100);
		 p1.setFont(fnt);
		 p2 = new JButton(" ");
		 p2.setBounds(100,0,100,100);
		 p2.setFont(fnt);
		 p3 = new JButton("  ");
		 p3.setBounds(200,0,100,100);
		 p3.setFont(fnt);
		 p4 = new JButton("   ");
		 p4.setBounds(0,100,100,100);
		 p4.setFont(fnt);
		 p5 = new JButton("    ");
		 p5.setBounds(100,100,100,100);
		 p5.setFont(fnt);
		 p6 = new JButton("     ");
		 p6.setBounds(200,100,100,100);
		 p6.setFont(fnt);
		 p7 = new JButton("      ");
		 p7.setBounds(0,200,100,100);
		 p7.setFont(fnt);
		 p8 = new JButton("       ");
		 p8.setBounds(100,200,100,100);
		 p8.setFont(fnt);
		 p9 = new JButton("        ");
		 p9.setBounds(200,200,100,100);
		 p9.setFont(fnt);
		 
		 txt1 = new JLabel("Obecnie wybiera O");
		 txt1.setBounds(70,320,300,100);
		 txt1.setFont(fnt);
		 add(p1);
		 add(p2);
		 add(p3);
		 add(p4);
		 add(p5);
		 add(p6);
		 add(p7);
		 add(p8);
		 add(p9);
		 add(txt1);
		 
	 	this.setSize(315,500);
		this.setLayout(null);
		this.setVisible(true);	
		 
	 }
	
}
