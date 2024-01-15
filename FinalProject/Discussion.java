//package JProject; 
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;



public class Discussion extends Frame implements ActionListener
{  //setExtendedState(Frame.MAXIMIZED_BOTH);
  Button b1,b11;
    Label l1,l2,l3;
	TextArea area; //int count = 0;
    private BufferedImage img1,img2;
	public Discussion()
	{
		
		//Frame f=new Frame("Discussion Forum");
		setLayout(null);
		Font f1 = new Font("Serif",Font.PLAIN,34);
		//creation of textarea usuing TextArea class
		area=new TextArea();  
        area.setBounds(50,300,500,200); 
		area.setFont(new Font("Arial",Font.PLAIN,24));
	   
		//creation of label
		
		l1 = new Label("Discussions");
        l1.setBounds(50,50,200,50);
		l1.setFont(f1);
		l1.setBackground(Color.lightGray);
		
		l2 = new Label("Posted Queries");
        l2.setBounds(900,360,210,35);
		l2.setFont(f1);
		l2.setBackground(Color.gray);
		
		l3 = new Label(MainFrame.t);
        l3.setBounds(1000,30,200,50);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		l3.setBackground(Color.lightGray);
	   
    	b11 = new Button("Back");
		b11.setBounds(1250,650,75,30);
		b11.setFont(new Font("Arial",Font.BOLD,24));
		b11.addActionListener(this);
		
		//creation of button
        b1 = new Button("Post");
        b1.setBounds(200,550,100,50);
        b1.addActionListener(this);		
		//adding components to the frame
		add(l1);
        add(area);  
		add(b1);
		add(l2);
		add(l3);
		add(b11);
		 
        //setLayout(null); 
        setTitle("Discussions");
        setSize(1000,700); 		
        setVisible(true); 
        //insertion of images		
		try{
			img1 = ImageIO.read(new File("20.jpg"));
			img2 = ImageIO.read(new File("21.jpg"));
		}catch(Exception e){
			
		}		
			
		
		/*this.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});*/
	}
	// adding action to the button created i.e, b1
    public void actionPerformed(ActionEvent ae)
        {  
		    if(ae.getSource()==b1)
			{ 
		      MainFrame.count = MainFrame.count+1;
              Graphics g=this.getGraphics();
			  g.setFont(new Font("Arial",Font.BOLD,16));
			  //System.out.println("hia");
			 g.drawString(" "+MainFrame.s,880,420);
			  //System.out.println("hib");
			  if(MainFrame.count==1)
                  g.drawString("Q1):"+area.getText(),880,440);
			      //new Dialog4();
              if(MainFrame.count==2)
				  g.drawString("Q2): "+area.getText(),880,460);
			      //new Dialog4();
			  if(MainFrame.count==3)
                  g.drawString("Q3): "+area.getText(),880,480);
                   new Dialog4();
			  //if(MainFrame.count==4)	   
				  // new Dialog5();
			       //Dialog4.d4.setVisible(false);
              				  
              //g.drawString("pass word:"+pass.getText(),10,240);	      
		//p.setBounds(875,375,425,175);
			    //new Dialog4();
		    }
			if(ae.getSource()==b11)
			{dispose();}
			
		}
	 //a method to display drawing,text or images in the frame
	public void paint(Graphics g){
		g.setFont(new Font("Serif",Font.BOLD,24));
		setBackground(Color.lightGray);
		//g.drawString("the query is:"+area.getText(),875,350);
		g.drawImage(img1,800,100,500,200,null);
		g.drawString("Please post your queries in the section below you will be responded",50,200);		
		g.drawString("shortly by our experts.This portal is open for all the users.",50,225);
		g.drawLine(50,102,225,102);
	    g.drawLine(50,104,225,104);
		g.setColor(Color.white);
		g.fillRect(875,400,425,175);
		g.setColor(Color.black);
		g.drawRect(875,400,425,175);
		g.drawRect(874,399,426,176);
		g.drawImage(img2,625,325,200,200,null);
        //g.setFont("Serif",Font.PLAIN,24);
        
		//g.drawString("",100,250);
	} 
	
}

// a dialogue box to show when the query is posted succesfully
 class Dialog4{
	private static Dialog d4;
	Dialog4(){
		Frame f2 = new Frame();
		d4 = new Dialog(f2,"Successfull",true);
	    d4.setLayout(null); 
		Label l9 = new Label("Thank you,your queries has been posted.",Label.CENTER);
		l9.setBounds(50,50,250,100);
		l9.setBackground(Color.lightGray);
		Button bb = new Button("Ok");
		bb.setBounds(150,170,50,50);
		//TextField tf4 = new TextField(1);
		//tf4.setBounds(75,125,150,25);
		 
		
		 bb.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Dialog4.d4.setVisible(false);  
            }  
        });
	    d4.add(l9);
        //d2.add(tf4);		
        d4.add(bb);   
        d4.setSize(350,350);    
        d4.setVisible(true); 
	}
}


class Dialog5{
	private static Dialog d5;
	Dialog5(){
		Frame f3 = new Frame();
		d5 = new Dialog(f3,"Alert!!",true);
	    d5.setLayout(null); 
		Label l7 = new Label("You have crossed your limit of posting queries",Label.CENTER);
		l7.setBounds(50,50,250,100);
		l7.setBackground(Color.lightGray);
		Button bd = new Button("Ok");
		bd.setBounds(150,170,50,50);
		//TextField tf4 = new TextField(1);
		//tf4.setBounds(75,125,150,25);
		 
		
		 bd.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Dialog5.d5.setVisible(false);  
            }  
        });
	    d5.add(l7);
        //d2.add(tf4);		
        d5.add(bd);   
        d5.setSize(350,350);    
        d5.setVisible(true); 
	}
}