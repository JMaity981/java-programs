import java.applet.*;
import java.awt.*;
public class tri extends Applet
{
public void paint(Graphics g)
{
int x1=20,x2=220,x3=120;
int y1=20,y2=20,y3=120;
int m[]={120,20,220};
int n[]={120,200,200};
int x[]={x1,x2,x3};
int y[]={y1,y2,y3};
g.setColor(Color.pink);
g.fillPolygon(m,n,3);
g.setColor(Color.green);
g.fillPolygon(x,y,3);

}
}
