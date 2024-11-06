import javax.swing.*;
import java.util.*;
//Herarchical Inheritance
class Array7
{
    int [] arr;
    Array7()
    {
        arr=new int[5];
    }
    void set(int pos,int d)
    {
        arr[pos]=d;
    }
    int get(int pos)
    {
        return arr[pos]; //it will return the value at that position
    }
    public String toString()
    {
        return "Data:"+(arr);
    }
}
class Stack7 extends Array7
{
    int top;
    Stack7()
    {
        super();
        top=-1;
    }
    void push(int d)
    {
        if(top==arr.length-1)
        {
            JOptionPane.showMessageDialog(null,"OverFlow");
            return;
        }
        set(++top,d);
    }
    void pop()
    {
        if(top==-1)
        {
            JOptionPane.showMessageDialog(null,"UnderFlow");
            return;
        }
        top--;
    }
    public String toString()
    {
        String s="Stack";
        if(top==-1)
            s=s+"Empty";
        else
        {
            for(int i=top;i>= 0;i--)
                s=s+" "+get(i);  // these will return or get the value at that position 
        }
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }
    void menu()
    {
        String [] opt=new String[]{"Push","Pop","display","Exit"};
        int option=0;int d=0;
        while(true)
        {
            option=JOptionPane.showOptionDialog(null,"Choose One","Stack",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opt,0);
            if(option==3)
                break;
            switch(option)
            {
                case 0:
                    try
                    {
                        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data:"));
                    }
                    catch(Exception e){}
                    push(d);break;
                case 1:
                    pop();break;
                case 2:
                    display();break;
            }
        }
    }
}
class Queue7 extends Array7
{
    int fr,rr;
    Queue7()
    {
        super();
        fr=0;rr=-1;
    }
    void insert(int d)
    {
        if(rr==arr.length-1)
        {
            JOptionPane.showMessageDialog(null,"OverFlow");
            return;
        }
        set(++rr,d);
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void remove()
    {
        if(rr<fr)
        {
            JOptionPane.showMessageDialog(null,"UnderFlow");
            return;
        }
        fr++;
    }
    public String toString()
    {
        String s="Queue:";
        if(rr<fr)
        {
            s=s+"Empty";
        }
        else
        {
            for(int i=fr;i<=rr;i++)
                s=s+" "+get(i);
        }
        return s;
    }
    void menu()
    {
        String [] opt=new String[]{" Insert","Remove","display","Exit"};
        int option=0;int d=0;
        while(true)
        {
            option=JOptionPane.showOptionDialog(null,"Choose One","Stack",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opt,0);
            if(option==3)
                break;
            switch(option)
            {
                case 0:
                    try
                    {
                        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data:"));
                    }
                    catch(Exception e){}
                    insert(d);break;
                case 1:
                    remove();break;
                case 2:
                    display();break;
            }
        }
    }

}
public class HInh7
{
    public static void main(String [] args)
    {
        // Stack7 a=new Stack7();
        // a.menu();

        String [] option =new String[]{"Stack","Queue","Exit"};
        int opt=JOptionPane.showOptionDialog(null,"Choose One","Data Structure",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option,0);
        if(opt==2)
            return;
        if(opt==0)
        {
            (new Stack7()).menu();
        }
        else
        {
            (new Queue7()).menu();
        }

    }
}
/*
 *     [0] [1] [2] [3] [4] [5] [6] 
        fr                   rr
        In the visualization above, fr points to the front of the queue, and rr points to the rear. 
        Elements are added to the rear and removed from the front. When an element is added, rr moves to the right, 
        and when an element is removed, fr moves to the right
 */