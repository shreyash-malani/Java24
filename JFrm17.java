<<<<<<< HEAD
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JFrm17 extends JFrame 
{
    JSlider s1;
    JPanel p1;

    JFrm17()
    {
        super("Slider");
        s1 = new JSlider(JSlider.HORIZONTAL,0,100,5);
        p1 = new JPanel();
        p1.add(s1);
        add(p1);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);

    }

    public static void main(String [] args)
    {
        JFrm17 a=new JFrm17();
    }
=======
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JFrm17 extends JFrame 
{
    JSlider s1;
    JPanel p1;

    JFrm17()
    {
        super("Slider");
        s1 = new JSlider(JSlider.HORIZONTAL,0,100,5);
        p1 = new JPanel();
        p1.add(s1);
        add(p1);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);

    }

    public static void main(String [] args)
    {
        JFrm17 a=new JFrm17();
    }
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
}