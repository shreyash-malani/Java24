import javax.swing.*;
import java.util.*;

public class ListP1 
{
    public static void main(String [] args)
    {
        LinkedList<Integer> a=new LinkedList<Integer>();
        int val=0;
        while(true)
        {
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"Value:"));
            }
            catch(Exception e){}
            if(val==0)
                break;
            a.add(val);
        }
        JOptionPane.showMessageDialog(null, a);
        
    }     
}
