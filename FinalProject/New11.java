import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class New11 extends Frame implements ActionListener
{
	Button b1;
	public New11()
	{   

		b1 = new Button("back");
		setLayout(null);
		b1.setBounds(100,100,250,170);
		add(b1);
		b1.addActionListener(this);
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
	public void actionPerformed(ActionEvent ar)
	{
		if(ar.getSource()==b1)
			dispose();
	}
}