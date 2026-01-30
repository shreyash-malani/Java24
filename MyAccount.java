import java.io.*;
import java.util.*;

import mypkg.Util;
import mypkg.Account;
public class MyAccount 
{

    HashSet <Integer> a;
    Map <Integer,Account> b ;
    Account obj;
    MyAccount()
    {
        obj = null;
        a=new HashSet<Integer>();
        b=new HashMap <Integer,Account> ();
    }
    void add()
    {
        int no=Util.iInput("Account No:");
        if(a.add(no)==false)
        {
            Util.display("Record Exist");
            return ;
        }
        obj=new Account();
        obj.setData(no);
        b.put(no,obj);  //adds to Hashmap
    }
    void display()
    {
        Iterator<Integer>c=a.iterator();
        while(c.hasNext())
        {
            int no=c.next();
            obj=b.get(no);
            obj.display();
        }
    }
    public static void main(String [] args)
    {
        MyAccount p =new MyAccount();
        p.add();
        p.add();
        p.add();
        p.display();
    }
}