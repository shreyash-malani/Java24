import java.awt.GridLayout;
import javax.swing.*;
public class JFrm21 extends JFrame 
{
    JLabel l1,l2;
    JSeparator s1;

    JFrm21()
    {
        super("Seperator");
        l1=new JLabel("Above Sperator");
        l2=new JLabel("Below Separator");

        s1=new JSeparator();
        setLayout(new GridLayout(0,1));
        add(l1);
        add(s1);
        add(l2);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        JFrm21 a=new JFrm21();    
    }
    
}
