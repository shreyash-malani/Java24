<<<<<<< HEAD
import java.util.*;
import javax.swing.*;
public class List2 
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
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);  //these will display list 
        int i=0,n=ls.size();
        String str="Data\n";
        while(i<n)
        {
            str=str+" "+ls.get(i); //this will display in string 
            i++;
        }
        JOptionPane.showMessageDialog(null, str);
    }
}
=======
import java.util.*;
import javax.swing.*;
public class List2 
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
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);  //these will display list 
        int i=0,n=ls.size();
        String str="Data\n";
        while(i<n)
        {
            str=str+" "+ls.get(i); //this will display in string 
            i++;
        }
        JOptionPane.showMessageDialog(null, str);
    }
}
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
