//same program to Student1... 

import javax.swing.*;
public class Book1 
{
    int no;
    String nm;
    double pr;

    Book1() 
    {
        no=0;
        nm=new String();
        pr=0.0;
    }
    Book1(int a,String b,double c)
    {
        no=a;
        nm=b;
        pr=c;
    }

    public String toString()
    {
        String s="No:"+no+"\n"+"Name:"+nm+"\n"+"Price:"+pr;
        return s;
    }
   
   
    void setData(int no)
    {
        this.no=no;
        {
            try
            {
                nm=JOptionPane.showInputDialog(null,"Name:");
                pr=Double.parseDouble(JOptionPane.showInputDialog(null,"Price:"));
            }
            catch(Exception e){}
        }
    }

    void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
            nm=JOptionPane.showInputDialog(null,"Book Name:");
            pr=Double.parseDouble(JOptionPane.showInputDialog(null,"Price:"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid");
        }
    }

    void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }

    public static void main(String [] args)
    {
        Book1 a=new Book1();
        a.setData();
        a.display();
    
    // Book1 b= null;
    // b=new Book1();
    // b.setData(12);
    // b.display();
    
    // Book1[]c=new Book1[5];
    // int i=0;
    // while(i<c.length)
    // {
    //     c[i]=new Book1();
    //     c[i].setData(i+1);
    //     i++;
    // }
    // for (i=0;i<5;i++)
    // {
    //     c[i].display();
    // }
     } 
}