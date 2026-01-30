import javax.swing.*;
abstract class Array9
{
    int [] arr;
    Array9()
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
        return "Data:"+arr;
    }
    abstract void menu();
}
class Stack9 extends Array9
{
    int top;
    Stack9()
    {
        super();
        top=-1;
    }
    void push(int d)
    {
        if(top==arr.length-1)
        {
            JOptionPane.showMessageDialog(null, "OverFlow");
        }
        else
        {
            set(++top,d);
        }
    }
    void pop()
    {
        if(top==-1)
        {
            JOptionPane.showMessageDialog(null,"Underflow");
            return;
        }
        else
            top--;
    }
    public String toString()
    {
        String s="Stack";
        if(top==-1)
            s=s+"Empty";
        else
            for(int i=top;i>=0;i--)   //this is the main step as it arrange the element as per stack handle the elements 
                s=s+" "+get(i);
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void menu()
    {
        String [] opt=new String []{"Push","Pop","Display","Exit"};
        int option,d=0;
        while (true) 
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
                    pop();
                    break;
                case 2:
                    display();break;
            }

        }   
    }
}
class Queue9 extends Array9
{
    int rr,fr;
    Queue9()
    {
        rr=-1;
        fr=0;
    }
    void insert(int d)
    {
        if(rr==arr.length-1)
        {
            JOptionPane.showMessageDialog(null,"OverFlow");
        }
        set(++rr,d);
    }
    void remove()
    {
        if(rr<fr)
        {
            JOptionPane.showMessageDialog(null,"UnderFlow");
        }
        fr++;
    }
    void display()
    {
        String q="Queue";
        if(rr<fr)
            q=q+"Empty";
        else
        {
            for(int i=fr;i<=rr;i++) //  here fr will always be 0 and rr will be incremented during adding element in the queue
                q=q+" "+get(i);
        }
        
    }
    void menu()
    {
        String [] opt=new String[]{"Insert","Remove","Display","Exit"};
        int option=0,d=0;
        while(true)
        {
            JOptionPane.showOptionDialog(null, "Choose One", "Queue",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE, null, opt, 0);
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
public class Stack9Imp
{
    public static void main(String [] args)
    {
        // Stack9 s=new Stack9();
        // s.menu();
        String [] option =new String[]{"Stack","Queue","Exit"};
        int opt=JOptionPane.showOptionDialog(null,"Choose One","Data Structure",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option,0);
        if(opt==2)
            return;
        Array9 ref=null;
        if(opt==0)
            ref= new Stack9();
        else
            ref=new Queue9();
        ref.menu();
    }
}
/*
 *     [0] [1] [2] [3] [4] [5] [6] 
        fr                   rr
        In the visualization above, fr points to the front of the queue, and rr points to the rear. 
        Elements are added to the rear and removed from the front. When an element is added, rr moves to the right, 
        and when an element is removed, fr moves to the right
 */