import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class frame1 extends JFrame implements ActionListener
{
	JLabel l2,l3,l4;
	ImageIcon ii1,ii2,ii3;
	JButton b2,b4;
	public frame1()
	{
		setSize(900,900);
		setLayout(null);
		
		
		
		 ii1=new ImageIcon("bharat1.jpg");
		l2=new JLabel(ii1);
		ii2=new ImageIcon("aladin.png");
		l3=new JLabel(ii2);
		ii3=new ImageIcon("cinema.png");
		l4=new JLabel(ii3);
		b2=new JButton("BOOK TICKET");
		b2.setBackground(Color.yellow);
		b4=new JButton("BOOK TICKET");
		b4.setBackground(Color.yellow);
		
		l2.setBounds(150,300,200,300);
		b2.setBounds(150,800,150,40);
		l3.setBounds(500,300,200,300);
		l4.setBounds(80,5,700,300);
		b4.setBounds(500,800,150,40);
		add(b2);
		
		add(l2);
		add(l3);
		add(b4);
		add(l4);
		b2.addActionListener(this);
		b4.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
{ if(e.getSource()==b2)
	new login();
}	
}

class ugi2
	{
		public static void main(String args[])
		{
		frame1 obj=new frame1();	
		}
	}
	