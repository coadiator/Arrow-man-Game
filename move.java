import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class move implements ActionListener
{
	JFrame fr;
	JButton b1,b2;
	
	JLabel lb1,lb2,lb3,lb4,lb5,lb6;
	int i=0,j=700,k=800,l=900,m=1000,aa=50,bb,o=100;
	int qq=800,ww=950,ee=1100,rr=1250;
	ImageIcon i1,i2,i3,i4,i5,i6;	
	Timer ti5;
	public move()
	{
		fr=new JFrame("movement");
		fr.setLayout(null);
		i1= new ImageIcon("1.jpg");
		i2=new ImageIcon("2.jpg");
		i3= new ImageIcon("3.jpg");
		i4= new ImageIcon("4.jpg");
		i5= new ImageIcon("5.jpg");
		i6= new ImageIcon("6.jpg");
		lb1=new JLabel(i1);
		lb2=new JLabel(i2);
		lb3=new JLabel(i3);
		lb4=new JLabel(i4);
		lb5=new JLabel(i5);
		lb6=new JLabel(i6);
		b1=new JButton("Shoot");
		b2=new JButton("Exit");
		b1.setBounds(50,300,80,50);
		b2.setBounds(50,400,60,50);

		ActionListener t1 = new ActionListener() {
            	public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
		lb1.setBounds(qq,j,80,200);
			j-=30;
			if(j<0)
			j=700;


			
                //System.out.println("Reading SMTP Info.");
            }
        };

		ActionListener t2 = new ActionListener() {
            	public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
		lb2.setBounds(ww,k,80,200);
			k-=30;
			if(k<0)
			k=800;
                //System.out.println("Reading SMTP Info.");
            }
        };

		ActionListener t3 = new ActionListener() {
            	public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
		lb3.setBounds(ee,l,80,200);
			l-=30;
			if(l<0)
			l=900;
                //System.out.println("Reading SMTP Info.");
            }
        };

		ActionListener t4 = new ActionListener() {
            	public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
		lb4.setBounds(rr,m,80,200);
			m-=30;
			if(m<0)
			m=1000;
                //System.out.println("Reading SMTP Info.");
            }
        };

		
		ActionListener t5 = new ActionListener() {
            	public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
		lb6.setBounds(aa,o,200,30);
			aa+=60;
			if(aa>1350)
			{aa=50; ti5.stop();}	
		//System.out.println("Reading SMTP Info.");
            }
        };
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		//lb1.setBounds(j,50,30,50);
		i=200;	bb=200;
		fr.add(lb1);
		fr.add(lb2);
		fr.add(lb3);
		fr.add(lb4);
		fr.add(lb5);
		fr.add(lb6);
		lb5.setBounds(50,50,150,200);
		fr.add(b1);
		fr.add(b2);
		
		Timer ti1 = new Timer(i,t1);
		Timer ti2 = new Timer(i,t2);
		Timer ti3 = new Timer(i,t3);
		Timer ti4 = new Timer(i,t4);
		ti5 = new Timer(i,t5);
		i+=100;		bb+=200;
        	ti1.setRepeats(true);
		ti2.setRepeats(true);
		ti3.setRepeats(true);
		ti4.setRepeats(true);
		ti5.setRepeats(true);
        	ti1.start();
		ti2.start();
		ti3.start();
		ti4.start();
		
		
		fr.setSize(1350,700);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		public void actionPerformed(ActionEvent act)
		{
			if(act.getSource()==b1)
			{
				ti5.start();
			}			

			if(act.getSource()==b2)
			{
				System.exit(0);
			}			
	
	
		}
	public static void main(String[] args)
	{
		new move();
	}
}

		
		