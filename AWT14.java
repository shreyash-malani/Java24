import java.awt.*;
import java.awt.event.*;
public class AWT14 extends Frame implements WindowListener,MouseListener
{
    
    int x1,x2,y1,y2,flag;
    Color cr;
    AWT14()
    {
        super("Mouse");
        flag=0;
        cr=new Color(0,0,0);
        addWindowListener(this);
        addMouseListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}

    public void mousePressed(MouseEvent e)
    {
        // x=e.getX();
        // y=e.getY();
        // draw();
    }
    public void mouseReleased(MouseEvent e)
    {
    }
    public void mouseClicked(MouseEvent e)
    {
        if(flag==0)
        {
            x1=e.getX();
            y1=e.getY();
            flag=1;
        }
        else
        {
            x2=e.getX()-x1;
            y2=e.getY()-y1;
            cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
            draw();
            flag=0;
        }
    }
    public void mouseEntered(MouseEvent e)
    {
    }public void mouseExited(MouseEvent e)
    {
    }
    void draw()
    {
        Graphics g= getGraphics();
        g.setColor(cr);
        //g.drawRect(x1,y1,x2,y2);
         g.fillRect(x1,x2,y1,y2);
    }
    public static void main(String [] args)
    {
        AWT14 a=new AWT14();
    } 
}
