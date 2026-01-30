import javax.swing.*;
import java.util.*;
public class Result2 
{
    int rno;
    Vector<Integer>mrk;  
    Result2()
    {
        rno=0;
        mrk=new Vector<Integer>(); // declares a variable named mrk of type Vector that stores integers (Integer objects). 
    }
    int total()
    {
        int tot=0,i=0,n=mrk.size(); //args.lenth is a property of array and size() is method of link list  
        while(i<n)
        {
            tot=tot+(mrk.get(i)).intValue();   //This declaration means mrk is an Vector list  that holds Integer objects.
            i++;
        }
        return tot;
    }
    int average()
    {
        return total()/mrk.size();
    }
    public String toString()
    {
        return "Roll No:"+rno+"\n Marks:"+mrk+"\nTotal:"+total()+"\nAverage:"+average();
    }
    void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }
    void setData(int n)
    {
        rno=n;
        int val=0;
        while(true)
        {
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks:"));
            }
            catch(Exception e)
            {
                continue;
            }
            if(val==0)
                break;
            mrk.add(val);
        }
    }
    public static void main(String [] args)
    {
        Result2 a=new Result2();
        a.setData(101);
        a.display();
    }
    
}
/* explaination for total() method 
 * Initialization:
tot is initialized to 0.
i is initialized to 0.
n is assigned the size of the list mrk, which is 3.

Loop Execution:
In the first iteration of the loop:
i is 0.
mrk.get(0) retrieves the element at index 0, which is 10.
intValue() converts 10 (which is an Integer object) to its corresponding integer value, which is 10.
tot is updated to tot + 10, so tot becomes 10.
i is incremented to 1.

In the second iteration of the loop:
i is 1.
mrk.get(1) retrieves the element at index 1, which is 20.
intValue() converts 20 to its corresponding integer value, which is 20.
tot is updated to tot + 20, so tot becomes 30.
i is incremented to 2.

In the third iteration of the loop:
i is 2.
mrk.get(2) retrieves the element at index 2, which is 30.
intValue() converts 30 to its corresponding integer value, which is 30.
tot is updated to tot + 30, so tot becomes 60.
i is incremented to 3.

Loop Termination:
The loop terminates because i becomes equal to n, which is 3.

Return Total Sum:
The function returns the final value of tot, which is 60
 */
