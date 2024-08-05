import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class AWT20 extends Frame
{
    Image img;
    int x,y;
    AWT20()
    {
        super("Draw Image");
        // x=20;y=20;
        File f=new File("D:\\Window Programming Java\\Nature1.jpg");
        try
        {
            img=(Image)(ImageIO.read(f));
        }
        catch(Exception e){}
        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }    
        }); 
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,x,y,100,100,this);
    }
    public static void main(String [] args)
    {
        AWT20 a=new AWT20();
    }
}
