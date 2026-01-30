import java.util.*;
import javax.swing.*;
class Book1 
{
    int bno;
    String bnm;
    int bprice;
    Book1()
    {
        bno=bprice=0;
        bnm=new String();
    }
    public String toString()
    {
        String s="\n Book Data\n No:"+bno+"\n Name:"+bnm+"\n Price:"+bprice;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void setData(int n)  //integer Argument
    {
        bno=n;
        try
        {
            bnm=JOptionPane.showInputDialog(null,"Name:");
            bprice=Integer.parseInt(JOptionPane.showInputDialog(null,"Price:"));
        }
        catch(Exception e){}
    }
}

    public class UseBook1
    {
        Book1 bk;
        LinkedList<Book1>ls;
        public UseBook1()                //constructor
        {                                //UseBook1 is main the class as it is a main class we have to write the name of file as UseBook1.java
            ls=new LinkedList<Book1>();
            bk=null;
        }
        boolean search(int no)
        {
            int i=0,n=ls.size();
            while(i<n)
            {
                bk=ls.get(i);
                if(bk.bno==no)
                    break;
                i++;            
            }
            if(i==n)
                bk=null;
            return (i<n);
        }
        void add()
        {
            int no=0;
            try
            {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
            }
            catch(Exception e){return ;}
            if(search(no)==true)
            {
                JOptionPane.showMessageDialog(null,"Record Exist");
                return;
            }
            
            bk=new Book1();
            bk.setData(no);
            ls.add(bk);    //ls is instance variable for object
            JOptionPane.showMessageDialog(null, "Added to List");
        }
        void mod()
        {
            int no=0;
            try
            {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
            }
            catch(Exception e){return ;}
            if(search(no)==false)
            {
                JOptionPane.showMessageDialog(null,"Record Not Exist");
                return;
            }
            bk.setData(no);
            JOptionPane.showMessageDialog(null, "Record Modified");
        }
        void del()
        {
            int no=0;
            try
            {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
            }
            catch(Exception e){return ;}
            if(search(no)==false)
            {
                JOptionPane.showMessageDialog(null,"Record Not Exist");
                return;
            }
            ls.remove(bk);
            JOptionPane.showMessageDialog(null, "Record Deleted");
        }
        void display()
        {
            int i=0,n=ls.size();
            while(i<n)
            {
                bk=ls.get(i);
                bk.display();
                i++;
            }
        }
        void menu()
        {
            int opt,no;
            String[]option =new String[]{"Add","Mod","Del","Search","display","Exit"};
            while(true)
            {
                opt=JOptionPane.showOptionDialog(null, "Choose Option", "Book",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE, null, option, 0);
                if(opt==5)
                    break;
                switch(opt)
                {
                    case 0:
                        add();break;
                    case 1:
                        mod();break;
                    case 2:
                        del();break;
                    case 3:
                        try
                        {
                            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Book No:"));
                        }
                        catch(Exception e){continue;}
                        if(search(no)==false)
                            JOptionPane.showMessageDialog(null, "Record Not Found");
                        else
                            bk.display();
                        break;
                    case 4:
                        display();break;                
                }
            }
        }
        public static void main(String[] args)
        {
            UseBook1 p=new UseBook1();
            p.menu();
        }
        
    }