import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrm6 extends JFrame
{
    JLabel l1;
    JScrollPane jsp;
    JFrm6() 
    {
        super("Frame");
        l1=new JLabel(new ImageIcon("n1.jpg"));
        jsp=new JScrollPane(l1);
        add(jsp);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }    
    public static void main(String [] args)
    {
        JFrm6 a=new JFrm6();
    }
}
