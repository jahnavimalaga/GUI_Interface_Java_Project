//package Mypack;
//package JProject; 
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class UserLogin extends Frame implements ActionListener
{
	Button b7,b8,b12,b11;
	Label l1,l2,l3;
	TextField tf1,tf2;
	private BufferedImage img3;
	public UserLogin()
	{   //setExtendedState(Frame.MAXIMIZED_BOTH);
		//Frame f=new Frame("User Login");
		//settinf frame size and title
		setSize(1000,700);
		setTitle("User Login");
		setLayout(null);
		//creation of objects to Font,panel and labels
		Font f1 = new Font("Serif",Font.ITALIC,30);
		Font f2 = new Font("Serif",Font.ITALIC,30);
		Font f3 = new Font("Serif",Font.ITALIC,30);
		Font f9 = new Font("Arial",Font.PLAIN,30);
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,2));
		p.setBounds(50,550,500,50);
	     p.setVisible(true);
		//labels
		l1 = new Label("User Login",Label.LEFT);
		l1.setBounds(50,50,200,50);
		l1.setFont(f1);
		l1.setBackground(Color.lightGray);
		l2 = new Label("Username",Label.LEFT);
		l2.setBounds(100,150,200,50);
		l2.setFont(f2);
		l2.setBackground(Color.lightGray);
		l3 = new Label("Password",Label.LEFT);
		l3.setBounds(100,350,200,50);
		l3.setFont(f3);
		l3.setBackground(Color.lightGray);
		//creation of two text fields for entering username and password
		tf1 = new TextField(30);
		tf1.setBounds(100,250,300,50);
		tf1.setFont(f9);
		tf2 = new TextField(30);
		tf2.setBounds(100,450,300,50);
		tf2.setEchoChar('*');
		tf2.setFont(f9);
		//creation of buttons and adding actionlistener to it
		b7 = new Button("Login");
		b7.setFont(f1);
		b7.setBounds(50,450,200,50);
		b7.addActionListener(this);
		
		b8 = new Button("Forgot Password");
		b8.setFont(f1);
		b8.setBounds(250,550,200,50);
        b8.addActionListener(this);		
		
		b12=new Button("Logout");
		b12.setFont(f1);
		b12.setBounds(200,610,200,50);
		b12.addActionListener(this);
		
		b11 = new Button("Back");
		b11.setBounds(1250,650,75,30);
		b11.setFont(new Font("Arial",Font.BOLD,24));
		b11.addActionListener(this);
		
		//adding the created componets panel,label,buttons to the frame to be displayed
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		p.add(b7);
		p.add(b8);
		add(b12);
		add(b11);
		add(p);
		setVisible(true);
		//insertion of images
		try{
		  img3 = ImageIO.read(new File("4.jpg"));
	  }
	  catch(Exception e){
		  
	  }
	  	/*this.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});*/
	 
	}
	//providing action to the buttons b7,b8 vreated above		
	public void actionPerformed(ActionEvent ae)
    {   
	    String s1 = tf1.getText();
		String s2 = tf2.getText();
		//System.out.println("hi3");
        if(ae.getSource()==b7) 
		{    
		   //System.out.println("hi2");
		   
		  if(s2.equals("12345") && s1.equals("Student"))
		    {
             			
			//new New11();
            MainFrame.t = "Student";			
            MainFrame.s = "Student";			
             new Dialog3();			 
			}
		  else{
			  //
			 new Dialog1();	
			}
		}
		//System.out.println("hi1");
		if(ae.getSource()==b8){
			//System.out.println("hi");
			new Dialog2();
		}
		if(ae.getSource()==b11)
		{dispose();}
		if(ae.getSource()==b12){
		   MainFrame.t = "Anonymous User";			
            MainFrame.s = "Anonymous user";	
		   new Dialog4();
		}
    }

	 //a method to display drawing,text or images in the frame
	public void paint(Graphics g)
    {
	    g.drawImage(img3,700,100,350,350,null);
	    g.drawLine(50,100,205,100);
		g.drawLine(50,102,205,102);
	    setBackground(Color.lightGray);
    }
}

//a dialog box to show when the username and password entered by the user are incorrect
class Dialog1 {  
    private static Dialog d;  
    Dialog1() {  
        Frame f= new Frame();  
        d = new Dialog(f , "ALERT!!", true);  
		
        d.setLayout( new FlowLayout() ); 
        Button b = new Button ("OK");  
		b.setBounds(110,120,50,50);
		Label l23 = new Label("Please check your username and password.",Label.CENTER);
		l23.setBounds(50,50,200,50);
		l23.setBackground(Color.lightGray);
		
        b.addActionListener ( new ActionListener()  
        {
            public void actionPerformed( ActionEvent e )  
            {  
                Dialog1.d.setVisible(false);  
            }  
        }); 
             		
        d.add(l23);  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
		
    } 
}

//a dialog box to show when the user forgets the password and wants to reset it
class Dialog2{
	private static Dialog d1;
	Dialog2(){
		Frame f1 = new Frame();
		d1 = new Dialog(f1,"Recovery Box",true);
	    d1.setLayout(null); 
		Label l7 = new Label("enter your recovery mail",Label.CENTER);
		l7.setBounds(50,50,200,50);
		l7.setBackground(Color.lightGray);
		Button ba = new Button("Ok");
		ba.setBounds(110,160,25,25);
		TextField tf4 = new TextField(1);
		tf4.setBounds(75,125,150,25);
		 
		
		 ba.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Dialog2.d1.setVisible(false);  
            }  
        });
	    d1.add( l7);
        d1.add(tf4);		
        d1.add(ba);   
        d1.setSize(300,300);    
        d1.setVisible(true); 
	}
}


//a dialog box to show when there is succesfull login
class Dialog3{
	private static Dialog d2;
	Dialog3(){
		Frame f2 = new Frame();
		d2 = new Dialog(f2,"Recovery Box",true);
	    d2.setLayout(null); 
		Label l9 = new Label("Your login is successfull",Label.CENTER);
		l9.setBounds(50,50,200,50);
		l9.setBackground(Color.lightGray);
		Button bb = new Button("Ok");
		bb.setBounds(110,120,50,50);
		//TextField tf4 = new TextField(1);
		//tf4.setBounds(75,125,150,25);
		 
		
		 bb.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Dialog3.d2.setVisible(false);  
            }  
        });
	    d2.add(l9);
        //d2.add(tf4);		
        d2.add(bb);   
        d2.setSize(300,300);    
        d2.setVisible(true); 
	}
}

class Dialog4{
	private static Dialog d3;
	Dialog4(){
		Frame f3 = new Frame();
		d3 = new Dialog(f3,"Recovery Box",true);
	    d3.setLayout(null); 
		Label l8 = new Label("Logout succesfull",Label.CENTER);
		l8.setBounds(50,50,200,50);
		l8.setBackground(Color.lightGray);
		Button bc = new Button("Ok");
		bc.setBounds(110,120,50,50);
		//TextField tf4 = new TextField(1);
		//tf4.setBounds(75,125,150,25);
		 
		
		 bc.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Dialog4.d3.setVisible(false);  
            }  
        });
	    d3.add(l8);
        //d2.add(tf4);		
        d3.add(bc);   
        d3.setSize(300,300);    
        d3.setVisible(true); 
	}
}

		
