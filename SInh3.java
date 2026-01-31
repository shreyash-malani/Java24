import javax.swing.*;
import java.util.*;
class Number3
{
    int rno;
    Number3()
    {
        rno=0;
    }
    void setData()
    {
        try
        {
            rno=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll No:"));
        }
        catch(Exception e){}
    }
    public String toString()
    {
        String s="\n Roll No: "+rno;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
class Mark3 extends Number3
{
    Vector<Integer>mrk;
    Mark3()
    {
        mrk=new Vector<Integer>();
    }
    void setData()
    {
        super.setData();
        int val=0;
        while(true)
        {
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks:"));
            }
            catch(Exception e){continue;}
            if(val==0)
                break;
            mrk.add(val);
        }
    }
    int total()
    {
        int tot=0,i=0,n=mrk.size();
        while(i<n)
        {
            tot=tot+(mrk.get(i)).intValue();
            i++;
        }
        return tot;
    }
    double average()
    {
        return (double)total()/mrk.size();
    }
    public String toString()
    {
        String s=super.toString()+"\n Marks:"+mrk+"\nTotal:"+total()+"\nAverage:"+average();
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
public class SInh3
{
    public static void main(String [] args)
    {
        Mark3 a=new Mark3();
        a.setData();
        a.display();
    }
}