import java.applet.*;
import java.awt.*;
public class applet_page extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(50,50,100,50);
		g.drawLine(30,100,120,100);
		g.drawLine(50,50,30,100);
		g.drawLine(100,50,120,100);
		g.drawLine(30,120,120,120);
		g.drawLine(70,100,70,120);
		g.drawLine(80,100,80,120);
		
	}
}