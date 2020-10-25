import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class receipt extends JFrame
{
	JLabel l1,l2,l3,l4,l5,l;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	Font f,f1;
	public receipt()
	{
		getContentPane().setBackground(Color.yellow);	
		f=new Font("Arial",Font.PLAIN,20);
		f1=new Font("Arial",Font.PLAIN,35);
		l=new JLabel("TICKET");	
		l1=new JLabel("MOVIE NAME");
		l2=new JLabel("TIMING");
		l3=new JLabel("DATE");
		l4=new JLabel("SEAT NO.");
		l5=new JLabel("TICKET PRICE");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		setLayout(null);
		l.setBounds(215,8,170,60);
		l1.setBounds(100,80,145,50);
		l2.setBounds(100,160,100,30);
		l3.setBounds(100,240,100,30);
		l4.setBounds(100,300,100,30);
		l5.setBounds(100,360,300,30);
		t1.setBounds(300,80,140,31);		
		t2.setBounds(300,160,100,30);
		t3.setBounds(300,240,100,30);
		t4.setBounds(300,300,100,30);
		t5.setBounds(300,360,100,30);
		add(l);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		l.setFont(f1);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		setSize(600,450);
		setTitle("Receipt");
		setVisible(true);
	}
}
class tata
{
	public static void main(String args[])
	{
		receipt obj=new receipt();
	}
}		