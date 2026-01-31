//implementation of single Inheritance
import javax.swing.*;
class Number1     //Superclass 
{
    int rno;
    Number1()
    {
        rno=0;
    }
    Number1(int a)
    {
        rno=a;
    }
    // void setData(int a)
    // {
    //     rno=a;
    // }
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
        JOptionPane.showMessageDialog(null, toString());
    }
}   
class Marks1 extends Number1   //Sub-class   //extends means we are inheriting 
{
    int mrk;
    Marks1()
    {
        super();
        mrk=0;
    }
    Marks1(int a,int b)
    {
        super(a);
        mrk=b;
    }
    // void setData(int a,int b)
    // {
    //     setData(a);
    //     mrk=b;
    // }
    void setData()
    {
        super.setData();
        try
        {
            mrk=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks:"));
        }
        catch(Exception e){}
    }
    public String toString()
    {
        String s=super.toString()+"\n Marks:"+mrk;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
public class SInh1
{
    public static void main(String [] args)
    {
        Number1 a=new Number1();
        a.setData();
        a.display();

        Marks1 b=new Marks1();
        b.setData();
        b.display();

        Number1 c=new Marks1();
        c.setData();
        c.display();
    }
}
/* 
  When a method in a subclass has the same name, same parameters, and same return type as a method in its superclass, it's called overriding.
 */

//int mrk and array of 5 integer h.w.