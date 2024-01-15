//package JProject; 
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;



public class ContactUs extends Frame implements ActionListener
{ //setExtendedState(MAXIMIZED_BOTH); 
Button b11;
   Label l1,l2;
    private BufferedImage img4,img5;
    public ContactUs()
	{
		setLayout(null);
		setSize(1000,700);
		setTitle("Contact Us");
	
	//creation of object to Font class and a label
		Font f6 = new Font("Arial",Font.PLAIN,34);
		l1 =new Label("Contact Us",Label.LEFT);
		l1.setBounds(50,50,200,75);
		l1.setBackground(Color.lightGray);
		l1.setFont(f6);

	    l2 = new Label(MainFrame.t);
        l2.setBounds(1000,30,200,50);
		l2.setFont(new Font("Arial",Font.BOLD,22));
		l2.setBackground(Color.lightGray);

		b11 = new Button("Back");
		b11.setBounds(1250,650,75,30);
		b11.setFont(new Font("Arial",Font.BOLD,24));
		b11.addActionListener(this);

		//adding the label to the frame
		add(l1);
		add(l2);
		add(b11);
		
		setVisible(true);

		//insertion of image
		try
		{
		  img4 = ImageIO.read(new File("5.jpg"));
		  img5 = ImageIO.read(new File("9.jpg"));
	    }
	  catch(Exception e)
	    {
		  
	    }
	 
		
	
		/*this.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});*/
	}
	 public void actionPerformed(ActionEvent ae)
	 {
		 if(ae.getSource()==b11)
			{dispose();}
	 }
	 //a method to display drawing,text or images in the frame
	public void paint (Graphics g)
		{
			//g.drawString("Contact Us",100,100);
            g.setColor(Color.black);
            g.setFont(new Font("Comic Sans MS",Font.PLAIN,24));
			setBackground(Color.lightGray);
			//g.drawLine(100,100,200,200);
	        //g.drawString("Contact Us",100,100);
			//g.drawLine(50,115,250,115);
			//g.drawLine(50,117,250,117);
	        g.drawString("->For queries:contact 1234567890",100,200);
		    g.drawString("->for general inquiries: xxx@gmail.com",100,250);
			g.drawString("->For career related inquiries: career@gmail.com",100,300);
			g.drawString("->For admission related inquiries: adm@gmail.com",100,350);
			g.drawString("->Address:",100,400);
			g.drawString("Mahindra Ecole Centrale",200,450);
			g.drawString("Survey No: 62/1A, Bahadurpally Jeedimetla,",200,500);
			g.drawString("Hyderabad - 500043 - Telangana, INDIA.",200,550);
			g.drawRect(90,150,620,470);
	        g.drawImage(img4,800,100,500,200,null);
		    g.drawImage(img5,900,350,348,143,null);
		}
}
 