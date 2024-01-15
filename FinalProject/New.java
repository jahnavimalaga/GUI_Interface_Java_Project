import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class New extends Frame
{
	public New()
	{
		Button b1 = new Button();
		b1.setBounds(100,100,25.87);
		add(b1);
		setSize(500,500);
		setVisible(true);
		/*f.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});*/
	}
}