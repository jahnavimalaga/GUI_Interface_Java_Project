//package JProject; 
//import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

class MainFrame extends Frame implements ActionListener
{ 
public static int count = 0;
public static String t = "Anonymous User";
public static String s = "Anonymous user";
 private BufferedImage img,img1,img2;
 public MainFrame()
 {   //private BufferedImage img;
	 //setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
	 setExtendedState(Frame.MAXIMIZED_BOTH);
	 setLayout(null);
	 //creation of Labels and font objects
	 Font f2 = new Font("Serif",Font.ITALIC,24);
    Font f4 = new Font("Serif",Font.BOLD,40);
     Label l4 = new Label("MEC",Label.CENTER);
	 l4.setFont(f4);
	 l4.setBounds(200,50,400,50);
	 l4.setBackground(Color.lightGray);
	 //creation of buttons
	 Button b1 = new Button("User Login");
	 Button b2 = new Button("About Us");
	 //Button b3 = new Button("Alumini Directory");
	 Button b4 = new Button("News and Updates");
	 Button b5 = new Button("Discussion Forum");
	 Button b6 = new Button("Contact Us");
	 //setting bounds to buttons and adding actionlistener
	  b1.setBounds(150,125,200,50);
	  b2.setBounds(150,225,200,50);
	 //b3.setBounds(150,325,200,50);
	  b4.setBounds(150,325,200,50);
	  b5.setBounds(150,425,200,50);
	  b6.setBounds(150,525,200,50);
	  b1.setFont(f2);
	  b2.setFont(f2);
	  //b3.setFont(f2);
	  b4.setFont(f2);
	  b5.setFont(f2);
	  b6.setFont(f2);
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  //b3.addActionListener(this);
	  b4.addActionListener(this);
	  b5.addActionListener(this);
	  b6.addActionListener(this);
	  //adding components to the frame
	  add(l4);
	  add(b1);
	  add(b2);
	  //this.add(b3);
	  add(b4);
	  add(b5);
	  add(b6); 
	 //setting framesize and name
	 setTitle("ALUMINI DATABASE");
     setSize(1000,700);
	 setVisible(true);
	 //insertion of images
	  try{
		  img = ImageIO.read(new File("1.jpg"));
		  img1 = ImageIO.read(new File("2.jpg"));
		  img2 = ImageIO.read(new File("3.jpg"));
	  }
	  catch(Exception e){
		  
	  }
	 
	  
	 
 }
  //a method to display drawing,text or images in the frame
 public void paint(Graphics g)
 { 
	  //g.setColor(Color.white);
	  g.setFont(new Font("Comic Sans MS",Font.BOLD,32));
	  
	 g.drawImage(img,500,100,300,300,null);
	 g.drawImage(img1,750,450,300,300,null);
	 g.drawImage(img2,950,50,300,300,null);
	  //g.drawImage(img,500,500,900,900,null);
	 setBackground(Color.lightGray);
 }
//providing action to the buttons b1,b2,b4,b5,b6
 public void actionPerformed(ActionEvent e)
 {
	 String str=e.getActionCommand();
	 if(str.equals("User Login"))
	 {
		 new UserLogin();
	 }
	 else if(str.equals("About Us"))
	 {
		 new AboutUs();
	 }
	 /*else if(str.equals("Alumini Directory"))
	 {
		 new AluminiDirectory();
	 }*/
	 else if(str.equals("News and Updates"))
	 {
	
	new NewsandUpdates();
	 }
	 else if(str.equals("Discussion Forum"))
	 {
		 new Discussion();
	 }
	 else if(str.equals("Contact Us"))
	 {
		 new ContactUs();
	 }
 }
 
 public static void main(String[] args)
 {
 MainFrame mf=new MainFrame();
  //MainFrame mf1=new MainFrame();
 
 //UserLogin1 ul=new UserLogin1();
 mf.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
 } 
}

