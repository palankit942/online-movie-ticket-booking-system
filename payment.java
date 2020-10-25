import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class payment extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JComboBox c1;
	JTextField t1,t2,t3;
	JButton b1,b2;
	public payment()
	{
		setTitle("PAYMENT WINDOW");
		setSize(700,500);
		setBackground(Color.pink);
   		setLayout(null);
		String choice[]={"DEBIT CARD","CREDIT CARD"};
		JComboBox c1=new JComboBox(choice);
		l1=new JLabel("Total Amount:");
		l2=new JLabel("Payment method");
		l3=new JLabel("BANK DETAILS");
		l3.setFont(new Font("Arial",Font.BOLD,17));
		l4=new JLabel("CARD NUMBER");
		l5=new JLabel("ACCOUNT HOLDER NAME");
		l6=new JLabel("AMOUNT PAID");
		l7=new JLabel("PAYMENT DETAILS");
		l7.setFont(new Font("Arial",Font.BOLD,30));
		b1=new JButton("OK");
		b2=new JButton("RECEIPT");
		t1=new JTextField(40);
		t2=new JTextField(40);
		t3=new JTextField(40);
		l1.setBounds(90,100,100,30);
		l2.setBounds(90,120,100,50);
		l3.setBounds(160,150,200,70);
		l4.setBounds(80,180,100,90);
		l5.setBounds(80,240,150,50);
		l6.setBounds(80,280,100,60);
		l7.setBounds(150,20,300,80);
		t1.setBounds(250,220,80,20);
		t2.setBounds(250,260,80,20);
		t3.setBounds(250,300,80,20);
		c1.setBounds(200,128,110,25);
		b1.setBounds(210,350,70,30);
		b2.setBounds(500,400,100,30);
b1.addActionListener(this);

b2.addActionListener(this);
		add (l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(t1);
		add(t2);
		add(t3);
		add(c1);
		add(b1);
		add(b2);
setVisible(true);
		
}

	
public void actionPerformed(ActionEvent e){
if(e.getSource()==b2)
			new receipt();
/*if(e.getSource()==b1)
		showMessage("payment successful");*/

}




	public static void main(String args[])
	{
		new payment();
	}
}


