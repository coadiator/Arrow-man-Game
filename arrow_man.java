import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class arrow_man implements ActionListener
{
	JFrame fr;
	JPanel p1,p2,p3;
	JButton b1,b2;
	int i=100;
	JLabel lb1,lb2;
	

	public arrow_man()
	{
		fr=new JFrame("Arrow man");
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		b1=new JButton("Shoot");
		b2=new JButton("Exit");
		lb1=new JLabel("moving text");
		lb2=new JLabel("moving text");
		b1=new JButton("Shoot");
		b2=new JButton("Exit");
		
		lb1.setBounds(100,50,110,20);

		//lb1.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		fr.setLayout(new GridLayout(3,100));
		
		p1.add(lb1);
		p2.add(b1);
		p2.add(b2);
		fr.add(p1);
		p2.setBounds(100,100,400,50);

		
		//fr.setLayout(new FlowLayout());
		fr.add(p1);
		fr.add(p2);

		fr.setSize(500,500);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public void actionPerformed(ActionEvent act)
	{
		
		//for(i=20;i<600;i++)
		//{lb1.setBounds(i,150,1000,100);}
		
	}


	public static void main(String[] args)
	{
		arrow_man x=new arrow_man();
	}
}










  