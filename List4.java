import java.util.*;
import javax.swing.*;

public class List4
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
        int i=0,n=ls.size();
        String str="Data\n";
        while(i<n)
        {
            str=str+" "+ls.get(i);
            i++;
        }
        JOptionPane.showMessageDialog(null, str);
        Iterator it=ls.iterator();  //Iteretaor through only we can go forward 
        str="Data\n";
        while(it.hasNext())
        {
            str=str+" "+it.next();
        }
        JOptionPane.showMessageDialog(null, str);
        int tot=0;
        for(i=0;i<n;i++)
        {
            tot+=(ls.get(i)).intValue();  //converts the Integer class object into int value
        }
        str="Data\n"+ls+"\nTotal:"+tot;
        JOptionPane.showMessageDialog(null, str);
    }
}
