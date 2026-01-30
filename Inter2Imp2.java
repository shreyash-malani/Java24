import java.util.*;
import javax.swing.*;
interface Inter2
{
    void setData();
    void display();
}
interface IComp
{
    int total();
    int avg();
}
interface IArray2 extends Inter2,IComp
{
    int size=5;
}
class ArrayImpl implements IArray2
{
    int [] arr;
    ArrayImpl()
    {
        arr=new int[size];
    }
    public int total()
    {
        int tot=arr[0],i=1;
        while(i<size)
            tot+=arr[i++];
        return tot;
    }
    public int avg()
    {
        return total()/size;
    }
    public String toString()
    {
        String s="Data:\n"+Arrays.toString(arr)+"\nTotal:"+total()+"\nAverage:"+avg();
        return s;
    }
    public void setData()
    {
        for(int i=0;i<size;i++)
        {
            try
            {
                arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Data:"));
            }
            catch(Exception e){continue;}
        }
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
public class Inter2Imp2
{
    public static void main(String [] args)
    {
        ArrayImpl a=new ArrayImpl();
        a.setData();
        a.display();

        ArrayImpl b=new ArrayImpl();
        Inter2 c=b;
        c.setData();
        c.display();
        
        IComp d=b;
        System.out.println("Total:"+d.total());
        System.out.println("Average:"+d.avg());
    }
}
/*
    * inter3 name of interface 
    *void setdata();
    void setData(int n);
    void display();
    int getNo();
    int getPrice();

    class Book3 implements inter3
    int no;
    String nm;
    int price;

    define Appropriate constructor of inter 3
 */

