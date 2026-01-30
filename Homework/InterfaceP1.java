//reference taken from UseBook1.java and UseAccount1.java

import java.util.Arrays;
import javax.swing.*;
interface Inter3
{
    void setData();
    void setData(int n);
    void display();
    int getNo();
    // int getPrice();
}
class Book3 implements Inter3
{
    int no;
    String nm;
    int [] price;
    Book3()
    {
        no=0;
        price=new int[5];
        nm=new String();
    }
    public void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
            nm=JOptionPane.showInputDialog(null,"Name:");
            for(int i=0;i<5;i++)
            {
                price[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Price:"));
            }
        }
        catch(Exception e){}
    }
    public void setData(int n)
    {
        no=n;
        try
        {
            nm=JOptionPane.showInputDialog(null,"Name:");
            for(int i=0;i<5;i++)
            {
                price[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Price:"));
            }
        }
        catch(Exception e){}
    }
    
    public String toString()
    {
        String s="\nBook No:"+no+"\n Name:"+nm+"\n Book Price:"+Arrays.toString(price);
        return s;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public int getNo()
    {
        return no;
    }
    // public int getPrice()
    // {
    //     return price;
    // }
}
public class InterfaceP1
{
    public static void main(String [] args)
    {
        Book3 b=new Book3();
        b.setData();
        b.display();

        Book3 c=new Book3();
        Inter3 a=c;
        a.setData(101);
        a.display();
    }
}