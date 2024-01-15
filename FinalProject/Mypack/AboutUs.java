package Mypack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AboutUs
{
	public AboutUs()
	{
		Frame f=new Frame("About Us");
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
	}
}