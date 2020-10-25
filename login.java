import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class login extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2;
	ImageIcon ii1;
	JButton b1;
	public login()
	{
		setVisible(true);
		setTitle("Login Window");
		setSize(500,300);
		setLayout(null);
		l1=new JLabel("User Name");
		l2=new JLabel("Password");
		l3=new JLabel("Registration");
		l3.setFont(new Font("Arial",Font.BOLD,25));
		t1=new JTextField();
		t2=new JPasswordField();
		b1=new JButton("login");
		//Jbg=new JLabel(new ImageIcon("seat.jpg"));
		//setContentPane(new JLabel(new ImageIcon("seat.jpg")));
		l3.setBounds(105,75,400,40);
		ii1=new ImageIcon("seat.jpg");
		l4=new JLabel(ii1);
		l1.setBounds(110,125,150,20);
		t1.setBounds(210,125,200,20);
		l2.setBounds(110,155,150,20);
		t2.setBounds(210,155,200,20);
		b1.setBounds(230,200,80,55);
		l4.setBounds(0,0,520,380);
		add(l3);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l4);
		//add(bg);
		setBackground(Color.yellow);	
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String un,pw;
				un=t1.getText();
				pw=t2.getText();
				if(un.equals(" ") || pw.equals(" ")){
					showMessage("Please Input User Name or Password");}
				else{
				 if(un.equals("siddharth") && pw.equals("12345")){
					showMessage("Welcome");
					new booking();
				}
				else{
					showMessage("you have entered wrong User Name or Password");}}
					
				
				
			}
		});
		
	}
	public void showMessage(String s)
	{
		JOptionPane.showMessageDialog(null,s);
	}
	public static void main(String args[])
	{
		new login();
	}
}