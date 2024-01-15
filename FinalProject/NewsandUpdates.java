//spackage Mypack;
//package JProject; 
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class NewsandUpdates extends Frame  implements ActionListener
{  
    Label l,l2;
	Button b11;
	private BufferedImage img6,img7;
	public NewsandUpdates()
	{ // setExtendedState(Frame.MAXIMIZED_BOTH); 
	setLayout(null);
		setTitle("News and Updates");
		setSize(1000,700);
		//creation of label
		l=new Label("News and Updates",Label.LEFT);
		l.setBounds(40,40,300,50);
		l.setFont(new Font("Serif",Font.PLAIN,34));
		l.setBackground(Color.lightGray);
		
		l2 = new Label(MainFrame.t);
        l2.setBounds(1000,30,200,50);
		l2.setFont(new Font("Arial",Font.BOLD,22));
		l2.setBackground(Color.lightGray);
		
		b11 = new Button("Back");
		b11.setBounds(1250,650,75,30);
		b11.setFont(new Font("Arial",Font.BOLD,24));
		b11.addActionListener(this);
		//adding label to the frame
		add(l);
		add(l2);
		add(b11);
		setBackground(Color.lightGray);
		setVisible(true);
		//insertion of images
		try{
			img6=ImageIO.read(new File("13.jpg"));
			img7=ImageIO.read(new File("17.png"));
		}
		catch(Exception e){}
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
	public void paint(Graphics g)
	{   
	    g.setFont(new Font("Arial",Font.BOLD,25));
		g.drawString("AIRO - The MEC Sports Fest March 16-18, 2018",40,190);
        g.setFont(new Font("Serif",Font.PLAIN,24));
	    g.drawString("Bonjour! Mahindra Ecole Centrale is hosting a three day sports",50,230);
	    g.drawString("extravaganza - the perfect platform for sports enthusiasts to",40,260);
		g.drawString("showcase their skills and talents. Be there!",40,290);
	    g.drawString("Welcome to AIRO - the MEC Sports Fest.",40,320);
	    g.setFont(new Font("Arial",Font.BOLD,25));
	    g.drawString("Centrale Connect Conclave, March 2018",40,350);
		g.setFont(new Font("Serif",Font.PLAIN,24));
		g.drawString("An industry-academia event with the theme",50,390);
        g.drawString("'Towards Infinite Possibilities',and features",40,420);
		g.drawString("the following list of eminent guests and panelists.",40,450);
		g.drawImage(img6,750,150,600,400,null);
		g.drawLine(40,92,300,92);
		g.drawLine(40,94,300,94);
		g.drawImage(img7,500,900,200,300,null);
		g.drawRect(30,130,650,340);
	}
}


