import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrm5 extends JFrame
{
    JLabel l1;
    JFrm5() 
    {
        super("Frame");
        l1=new JLabel(new ImageIcon("n1.jpg"));
        add(l1);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }    
    public static void main(String [] args)
    {
        JFrm5 a=new JFrm5();
    }
}
