import java.awt.*;
import java.awt.event.*;

public class AWT10 extends Frame implements WindowListener,MouseListener,MouseMotionListener
{
    int x,y;
    String str;
    AWT10()
    {
        super("Mouse");
        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
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
        x=e.getX();
        y=e.getY();
        str="Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="Released";
        repaint();
    }
    public void mouseClicked(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="Clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        x=100;
        y=100;
        str="Entered";
        repaint();
    }public void mouseExited(MouseEvent e)
    {
        x=100;
        y=100;
        str="Exited";
        repaint();
    }
    public void mouseMoved(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="Moved";
        repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        str="Dragged";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(str,x,y);
    }
    public static void main(String [] args)
    {
        AWT10 a=new AWT10();
    } 

}
