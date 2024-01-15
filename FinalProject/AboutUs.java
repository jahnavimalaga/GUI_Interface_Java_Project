//package JProject; 
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;



public class AboutUs extends Frame implements ActionListener
{   Label l1,l2;
    Button b11 ;
	private BufferedImage img5;
	public AboutUs()
	{   //setExtendedState(Frame.MAXIMIZED_BOTH);
		setLayout(null);		
		setSize(1000,700);
		setTitle("About Us");
		//creation of labels and object to font
		Font f1 = new Font("Serif",Font.PLAIN,34);
	    l1 = new Label("About us");
        l1.setBounds(50,50,200,50);
		l1.setFont(f1);
		l1.setBackground(Color.lightGray);
		
		l2 = new Label(MainFrame.t);
        l2.setBounds(1000,30,200,50);
		l2.setFont(new Font("Arial",Font.BOLD,22));
		l2.setBackground(Color.lightGray);
		//creation of button and adding actonlistener to it
		b11 = new Button("Back");
		b11.setBounds(1250,650,75,30);
		b11.setFont(new Font("Arial",Font.BOLD,24));
		b11.addActionListener(this);
		add(l1);
		add(b11);
		add(l2);
		//b8.setBounds(100,100,50,50);
		
		setVisible(true);
		//insertion of images
		try
		{
		  img5 = ImageIO.read(new File("6.jpg"));
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
	//adding actions to the bttons created above i.e,b8
	public void actionPerformed(ActionEvent e)
 {
	  String str=e.getActionCommand();
	 if(str.equals("Back"))
		 
	 {
		 //a method used to colse the current frame
		 dispose();
	 }
	 
	 
 }	 
 //a method to display drawing,text or images in the frame
 public void paint(Graphics g)
 {
	 setBackground(Color.lightGray);
	 g.setFont(new Font("Serif",Font.BOLD,24));
	 g.drawLine(50,100,175,100);
	g.drawLine(50,102,175,102);
	//g.drawLine(100,100,200,200);
	g.drawString("Established by the Mahindra Group, in collaboration with Ecole Central Paris (now CentraleSupeleclec) - a 180 year ",100,200);
	g.drawString("old leading French institution, and JNTU Hyderabad, a premier technological university, MEC is an international ",100,235);
	g.drawString("quality, technology school with assured career progression for engineering aspirants. ",100,260);
	g.drawString(" This college of engineering in Hyderabad creates three-dimensional engineers: ",100,285);
	g.drawString("-> high level scientific and technical generalists",100,310);
	g.drawString("-> experts in initiating and piloting innovative projects",100,335);
  	g.drawString("->well-rounded experts with a strong international culture",100,360);	
	g.drawString("Key aspects of education at MEC engineering college in Hyderabad are the focus on multi-disciplinary knowledge,",150,385);
	g.drawString("personality development, and critical-creative thinking. ",100,410);
	g.drawImage(img5,200,500,900,200,null);
	g.drawRect(50,150,1300,300);
 }
}