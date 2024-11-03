import javax.swing.*;
import java.util.*;
class Number2
{
    int rno;
    Number2()
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
        String s="\n Roll No:"+rno;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
class Mark2 extends Number2
{
    int [] mrk;
    Mark2()
    {
        super();
        mrk=new int[5]; 
    }
    void setData()
    {
        super.setData();
        for(int i=0;i<5;i++)
        {
            try
            {
                mrk[i]=(Integer.parseInt(JOptionPane.showInputDialog(null,"Marks:")));
            } 
            catch(Exception e){continue;}
        }
    }
    public String toString()
    {
        String s=super.toString()+"\nMarks:"+Arrays.toString(mrk)+"\nTotal:"+total()+"\n Average:"+average();
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    int total()
    {
        int tot=0;
        for(int i=0;i<5;i++)
        {
            tot=tot+mrk[i];
        }
        return tot;
    }
    double average()
    {
        return (double)total()/5;
    }
}
public class SInh2
{
    public static void main(String [] args)
    {
        Mark2 b=new Mark2();

        b.setData();
        b.display();
    }
}

