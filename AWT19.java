import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class AWT19 extends Frame
{
    Image img;
    AWT19()
    {
        super("Draw Image");
        File f=new File("D:\\Window Programming Java\\Nature1.jpg");
        try
        {
            img=(Image)(ImageIO.read(f));
        }
        catch(Exception e){}
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
        g.drawImage(img,20,20,360,360,this);
    }
    public static void main(String [] args)
    {
        AWT19 a=new AWT19();
    }
}
