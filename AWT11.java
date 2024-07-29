import java.awt.*;
import java.awt.event.*;
public class AWT11 extends Frame implements WindowListener,MouseListener,MouseMotionListener
{
    
    int x,y;
    AWT11()
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
    }
    public void mouseReleased(MouseEvent e)
    {
    }
    public void mouseClicked(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
    }public void mouseExited(MouseEvent e)
    {
    }
    public void mouseMoved(MouseEvent e)
    {
    }
    public void mouseDragged(MouseEvent e)
    {
    }
    public void paint(Graphics g)
    {
        g.drawRect(x, y, 20, 20);
    }
    public static void main(String [] args)
    {
        AWT11 a=new AWT11();
    } 
}
