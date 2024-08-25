import javax.swing.*;
import java.util.*;
public class StuGrade 
{
    int rno;
    String nm;
    Vector<Integer>mrk;
    char G; //G grade
    

    StuGrade()
    {
        rno=0;
        mrk=new Vector <Integer>();
        nm=null; 
    }
    public String toString()
    {
        String s="\n Roll No:"+rno+"\nName:"+nm+"\nTotal Marks:"+total()+"\nAverage"+avg()+"\nGrade"+grade();
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
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
    double avg()
    {
        return (double) total()/mrk.size();
    }
    char grade()
    {
        double val = avg();    // avg is considered as percentage
        if (val >= 91 && val <= 100)
            return 'O';
        else if (val >= 81 && val <= 90)
            return 'A';
        else if (val >= 71 && val <= 80)
            return 'B';
        else if (val >= 61 && val <= 70)
            return 'C';
        else if (val >= 51 && val <= 60)
            return 'D';
        else if (val >= 41 && val <= 50)
            return 'E';
        else
            return 'F'; 
    }


    void setData(int n)
    {
        rno=n;
        int val=0;
        nm=JOptionPane.showInputDialog(null,"Name:");
        //no=Integer.parseInt(JOptionPane.showInputDialog(null))
        while(true)
        {
            
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks:"));
            }
            catch(Exception e){}
            if(val==0)
                break;
            mrk.add(val);  //ls.add(bk);
        }
       
    }
    public static void main(String [] args)
    {
        StuGrade a=new StuGrade();
        a.setData(101);
        a.display();
    }

    
}
