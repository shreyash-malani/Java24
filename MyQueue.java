/*
    * MyQueue.java
    * set CLASSPATH=d:\;set CLASSPATH=d:\java24;
    * javac MyQueue.java
 */

package ds;
import ds.IQueue;
import mypkg.Util;
public class MyQueue implements IQueue
{
    int [] arr;
    int fr,rr;
    public MyQueue()
    {
        arr=new int [size];
        rr=-1;
        fr=0;
    }
    public boolean isFull()
    {
        return (rr==size-1);
    }
    public boolean isEmpty()
    {
        return rr<fr;
    }
    public void insert(int d)
    {
        if(isFull())
            Util.display("OverFlow");
        else
            arr[++rr]=d;
    }
    public void remove()
    {
        if(isEmpty())
            Util.display("Underflow");
        else
            ++fr;
    } 
    public void display()
    {
        Util.display(toString());        
    }
    public String toString()
    {
        String s="Queue";
        if(isEmpty())
            s=s+"Empty";
        else
        {
            for(int i=fr;i<=rr;i++)
                s=s+" "+arr[i];
        }
        return s;
    }
    public void qmenu()
    {
        int opt=0;
        int d=0;
        while(true)
        {
            opt=Util.oInput("Queue","Choose One",new String[]{"Insert","Remove","Display","Exit"});
            if(opt==3)
                break;
            switch(opt)
            {
                case 0:
                    d=Util.iInput("Data");
                    insert(d);
                    break;
                case 1:
                    remove();
                case 2:
                    display();
            }
        }
    }
}