import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class xo extends Base {
	private static final long serialVersionUID = 20L;	
	public static String test() {
		String a = p1.getText();
		String b = p2.getText();
		String c = p3.getText();
		String d = p4.getText();
		String e = p5.getText();
		String f = p6.getText();
		String g = p7.getText();
		String h = p8.getText();
		String i = p9.getText();
		
		if(a.equals(b) && b.equals(c)) { 	
			return a;
		}
		if(d.equals(e) && e.equals(f)) { 	
			return f;
		}
		if(g.equals(h) && h.equals(i)) { 	
			return g;
		}
		if(a.equals(d) && d.equals(g)) { 	
			return a;
		}
		if(b.equals(e) && e.equals(h)) { 	
			return b;
		}
		if(c.equals(f) && f.equals(i)) { 	
			return c;
		}
		if(a.equals(e) && e.equals(i)) { 	
			return a;
		}
		if(c.equals(e) && e.equals(g)) { 	
			return c;
		}
		return null;
	}
	public static void getOff() {
		p1.setEnabled(false);
		p2.setEnabled(false);
		p3.setEnabled(false);
		p4.setEnabled(false);
		p5.setEnabled(false);
		p6.setEnabled(false);
		p7.setEnabled(false);
		p8.setEnabled(false);
		p9.setEnabled(false);	
	}
	
	


	public static void main(String[] args)
	{
		xo x = new xo();

		x.p1.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p1.setBackground(Color.BLUE);
					x.p1.setText("O");
					x.p1.setEnabled(false);
					x.sign = 'X';
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p1.setBackground(Color.RED);
					x.p1.setText("X");
					x.p1.setEnabled(false);
					x.sign = 'O';
					x.txt1.setText("Obecnie wybiera O");
					
				}
					
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}});		
		
		x.p2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p2.setBackground(Color.BLUE);
					x.p2.setText("O");
					x.sign = 'X';
					x.p2.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p2.setBackground(Color.RED);
					x.p2.setText("X");
					x.sign = 'O';
					x.p2.setEnabled(false);
					x.txt1.setText("Obecnie wybiera O");
					
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		x.p3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p3.setBackground(Color.BLUE);
					x.p3.setText("O");
					x.sign = 'X';
					x.p3.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p3.setBackground(Color.RED);
					x.p3.setText("X");
					x.sign = 'O';
					x.p3.setEnabled(false);
					x.txt1.setText("Obecnie wybiera O");
					
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		x.p4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p4.setBackground(Color.BLUE);
					x.p4.setText("O");
					x.sign = 'X';
					x.p4.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p4.setBackground(Color.RED);
					x.p4.setText("X");
					x.sign = 'O';
					x.txt1.setText("Obecnie wybiera O");
					x.p4.setEnabled(false);
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		x.p5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p5.setBackground(Color.BLUE);
					x.p5.setText("O");
					x.sign = 'X';
					x.p5.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p5.setBackground(Color.RED);
					x.p5.setText("X");
					x.sign = 'O';
					x.p5.setEnabled(false);
					x.txt1.setText("Obecnie wybiera O");
					
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		x.p6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p6.setBackground(Color.BLUE);
					x.p6.setText("O");
					x.sign = 'X';
					x.p6.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p6.setBackground(Color.RED);
					x.p6.setText("X");
					x.sign = 'O';
					x.p6.setEnabled(false);
					x.txt1.setText("Obecnie wybiera O");
					
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		x.p7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p7.setBackground(Color.BLUE);
					x.p7.setText("O");
					x.sign = 'X';
					x.p7.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p7.setBackground(Color.RED);
					x.p7.setText("X");
					x.sign = 'O';
					x.p7.setEnabled(false);
					x.txt1.setText("Obecnie wybiera O");
					
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		x.p8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p8.setBackground(Color.BLUE);
					x.p8.setText("O");
					x.sign = 'X';
					x.p8.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p8.setBackground(Color.RED);
					x.p8.setText("X");
					x.sign = 'O';
					x.p8.setEnabled(false);
					x.txt1.setText("Obecnie wybiera O");
					
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		x.p9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(x.sign == 'O') {
					x.p9.setBackground(Color.BLUE);
					x.p9.setText("O");
					x.sign = 'X';
					x.p9.setEnabled(false);
					x.txt1.setText("Obecnie wybiera X");
				}
				else {
					x.p9.setBackground(Color.RED);
					x.p9.setText("X");
					x.sign = 'O';
					x.p9.setEnabled(false);
					x.txt1.setText("Obecnie wybiera O");
					
				}
				if(test()!=null) {
					x.txt1.setText("WYGRAL "+test());
					getOff();
				}
			}		
		});
		
		
		
		
		
		
		
	}
	
	
}