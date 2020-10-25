import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class booking extends JFrame 
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	//JButton b1,b2,b3;
	JRadioButton b1,b2,b3;
	ButtonGroup rbg;
	//JPanel p1;
	JTextField t1,t2,t3;
	JComboBox c1,c2;
	JButton b5;
	public booking()
	{
		
		
		setTitle("SEAT BOOKING");
		String date[]={"June 10,2019","June 11,2019"};
		JComboBox c1=new JComboBox(date);
		String timing[]={"9:00 AM-11:AM","2:00 PM-4:PM"};
		JComboBox c2=new JComboBox(timing);
		setSize(800,800);

		
		setLayout(null);
		
		
		l1=new JLabel("DIAMOND");
		l1.setFont(new Font("Arial",Font.BOLD,15));
		l2=new JLabel("GOLD");
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l3=new JLabel("SILVER");
		l3.setFont(new Font("Arial",Font.BOLD,15));
		l4=new JLabel("PRICE");
		l4.setFont(new Font("Arial",Font.BOLD,15));
		l5=new JLabel("250");
		l5.setFont(new Font("Arial",Font.BOLD,15));
		l6=new JLabel("200");
		l6.setFont(new Font("Arial",Font.BOLD,15));
		l7=new JLabel("150");
		l7.setFont(new Font("Arial",Font.BOLD,15));
		l8=new JLabel("PRICE PER SEAT");
		l8.setFont(new Font("Arial",Font.BOLD,35));
		l9=new JLabel("Type");
		l9.setFont(new Font("Arial",Font.BOLD,18));
		l10=new JLabel("SEAT TYPE");
		l10.setFont(new Font("Arial",Font.BOLD,23));
		l11=new JLabel("NO.OF SEAT");
		l11.setFont(new Font("Arial",Font.BOLD,23));
		l12=new JLabel("DATE");
		l12.setFont(new Font("Arial",Font.BOLD,23));
		l13=new JLabel("TIMING");
		l13.setFont(new Font("Arial",Font.BOLD,23));
		l14=new JLabel("TOTAL PRICE");
		l14.setFont(new Font("Arial",Font.BOLD,23));
		t2=new JTextField(20);
		t1=new JTextField(20);
		b5=new JButton("NEXT");
		b1=new JRadioButton("DIAMOND");
		b2=new JRadioButton("GOLD");
		b3=new JRadioButton("SILVER");
		rbg=new ButtonGroup();
		rbg.add(b1);
		rbg.add(b2);
		rbg.add(b3);
		l1.setBounds(150,70,100,40);
		l2.setBounds(400,70,100,40);
		l3.setBounds(600,70,100,40);
		l4.setBounds(40,120,100,45);
		l5.setBounds(160,120,100,40);
		l6.setBounds(410,120,100,40);
		l7.setBounds(610,120,100,40);
		l8.setBounds(250,20,900,40);
		l9.setBounds(40,70,100,45);
		l10.setBounds(65,210,200,50);
		b1.setBounds(300,170,100,50);
		b2.setBounds(300,210,100,50);
		b3.setBounds(300,250,100,50);
		l11.setBounds(60,500,250,50);
		l12.setBounds(60,330,250,50);
		l13.setBounds(60,410,250,50);
		l14.setBounds(60,580,250,50);
		t2.setBounds(300,580,250,50);
		t1.setBounds(300,500,250,50);
		c1.setBounds(300,330,250,50);
		c2.setBounds(300,410,250,50);
		b5.setBounds(650,650,100,40);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l14);
		add(b1);
		add(b2);
		add(b3);
		add(t1);
		add(t2);
		add(c1);
		add(c2);
		add(b5);
		getContentPane().setBackground(Color.yellow);	
				
		setVisible(true);
		b5.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
			{
				new payment();
			}
			});
setVisible(true);

}
	
		public static void main(String args[])
		{
			new booking();
		}
	}
