import java.util.*;
import javax.swing.*;

public class List5
{
    public static void main(String [] args)
    {
        LinkedList<Integer>ls=new LinkedList<Integer>(); // it shows link list holds integer type of data
        int val=0;
        while(true)
        {
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"value"));
            }
            catch(Exception e)
            {
                continue;
            }
            if(val==0)
                break;
            ls.add(val);
        }
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
        ls.removeFirst();
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
        ls.removeLast();
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
        ls.remove(2);
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
    }    
}
