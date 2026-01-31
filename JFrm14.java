<<<<<<< HEAD
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import mypkg.Util;
class Book implements Serializable,Comparable <Book>, Comparator <Book> 
{
    int bno,bprice;
    String bnm;
    Boolean bstate;
    Book()
    {
        bno=0;
        bnm=new String();
        bprice=0;
        bstate=true;
    }
    Book(int no,String nm,int price,Boolean state)
    {
        bno=no;
        bprice=price;
        bnm=nm;
        bstate=state;   
    }
    public String toString()
    {
        String s="Book Data\nNo:"+bno+"\nName:"+bnm+"\nPrice:"+bprice+"\nState:"+bstate;
        return s;
    }
    void display()
    {
        Util.display(toString());
    }
    public int compareTo (Book b)
    {   
        return (bno-b.bno);
    }
    public int compare(Book a,Book b)
    {
        return (a.bnm).compareTo(b.bnm);
    }
}
class BAdd extends JDialog implements ActionListener,FocusListener
{
    JPanel p1,p2;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3;
    JButton b1,b2;
    LinkedList<Book>ls;
    int no,price;
    String nm;Boolean state;
    Book obj;
    BAdd(Frame f,String t,LinkedList<Book>l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new JLabel("Book No:");
        l2=new JLabel("Name:");
        l3=new JLabel("Price:");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1,BorderLayout.CENTER);
        b1=new JButton("Add");
        b2=new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);
    }
    public void focusLost(FocusEvent e)
    {
        try
        {
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
        }
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            if(obj.bno==no)
                break;
            i++;
        }
        if(i!=n)
        {
            t2.setText(obj.bnm);
            t3.setText(""+obj.bprice);
            t1.requestFocus();
            return;
        }
        b1.setEnabled(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
        {
            setVisible(false);
        }
        else
        {
            try
            {
                no=Integer.parseInt(t1.getText());
                nm=t2.getText();
                price=Integer.parseInt(t3.getText());
                obj=new Book (no,nm,price,true);
                ls.add(obj);
            }
            catch(Exception e1){}
            setVisible(false);
        }
    }
}
class BMod extends JDialog implements ActionListener,FocusListener
{
    JPanel p1,p2;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3;
    JButton b1,b2;
    LinkedList<Book>ls;
    int no,price;
    String nm;Boolean state;
    Book obj;
    BMod(Frame f,String t,LinkedList<Book>l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new JLabel("Book No:");
        l2=new JLabel("Name:");
        l3=new JLabel("Price:");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1,BorderLayout.CENTER);
        b1=new JButton("MOD");
        b2=new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);
    }
    public void focusLost(FocusEvent e)
    {
        try
        {
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
        }
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            if(obj.bno==no && obj.bstate==true)
                break;
            i++;
        }
        if(i!=n)
        {
            t2.setText(obj.bnm);
            t3.setText(""+obj.bprice);
            b1.setEnabled(true);
        }
        else
        {
            t1.requestFocus();
            return;
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
        {
            setVisible(false);
        }
        else
        {
            try
            {
                no=Integer.parseInt(t1.getText());
                nm=t2.getText();
                price=Integer.parseInt(t3.getText());
                obj.bnm=nm;obj.bprice=price;
            }
            catch(Exception e1){}
            setVisible(false);
        }
    }
}
class BDel extends JDialog implements ActionListener,FocusListener
{
    JPanel p1,p2;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3;
    JButton b1,b2;
    LinkedList<Book>ls;
    int no,price;
    String nm;Boolean state;
    Book obj;
    BDel(Frame f,String t,LinkedList<Book>l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new JLabel("Book No:");
        l2=new JLabel("Name:");
        l3=new JLabel("Price:");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1,BorderLayout.CENTER);
        b1=new JButton("DEL");
        b2=new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);
    }
    public void focusLost(FocusEvent e)
    {
        try
        {
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
        }
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            if(obj.bno==no && obj.bstate==true)
                break;
            i++;
        }
        if(i!=n)
        {
            t2.setText(obj.bnm);
            t3.setText(""+obj.bprice);
            b1.setEnabled(true);
        }
        else
        {
            t1.requestFocus();
            return;
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
        {
            setVisible(false);
        }
        else
        {
            obj.bstate=false;
            setVisible(false);
        }
    }
}
class BDisplay extends JDialog implements ActionListener
{
    int i,n;
    LinkedList<Book>ls;
    JTable jt;
    JScrollPane jsp;
    DefaultTableModel dtm;
    String [][] arr;
    String [] chead ={"No","Name","Prize","State"};
    JButton b1,b2;
    Book [] barr=null;
    BDisplay(Frame f,String t,LinkedList<Book>ls,boolean state)
    {
        super(f,t,state);
        int i=0;
        this.ls=ls;
        barr=new Book[ls.size()]; //copy linkedList data to array
        ls.toArray(barr);
        //System.out.println(" "+Arrays.toString(barr));
        Arrays.sort(barr);
        
        
        
        b1=new JButton("Print");
        b2=new JButton("Back");
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        JPanel p1=new JPanel();
        dtm=new DefaultTableModel(arr,chead);
        jt=new JTable(dtm);
        jsp=new JScrollPane(jt);
        jsp.setBounds(20,20,350,280);
        p1.setLayout(null);
        p1.add(jsp);
        add(p1,BorderLayout.CENTER);
        i=0;
        n=barr.length;
        while(i<n)
        {
            Book b=barr[i];
            dtm.insertRow(i, new String []{""+b.bno,b.bnm,""+b.bprice,""+b.bstate});
            i++;
        }

        JPanel p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                setVisible(false);
            }
        });
        setSize(400,400); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b1)
        {
            try
            {
                jt.print();
            }
            catch(Exception e1){}
        }
        else
        {
            setVisible(false);
        }
    }
}
class BDisplayName extends JDialog implements ActionListener
{
    int i,n;
    LinkedList<Book>ls;
    JTable jt;
    JScrollPane jsp;
    DefaultTableModel dtm;
    String [][] arr;
    String [] chead ={"Name","No","Prize","State"};
    JButton b1,b2;
    Book [] barr=null;
    BDisplayName(Frame f,String t,LinkedList<Book>ls,boolean state)
    {
        super(f,t,state);
        int i=0;
        this.ls=ls;
        barr=new Book[ls.size()]; //copy linkedList data to array
        ls.toArray(barr);
        //System.out.println(" "+Arrays.toString(barr));
        Arrays.sort(barr,new Book());
        
        
        
        b1=new JButton("Print");
        b2=new JButton("Back");
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        JPanel p1=new JPanel();
        dtm=new DefaultTableModel(arr,chead);
        jt=new JTable(dtm);
        jsp=new JScrollPane(jt);
        jsp.setBounds(20,20,350,280);
        p1.setLayout(null);
        p1.add(jsp);
        add(p1,BorderLayout.CENTER);
        i=0;
        n=barr.length;
        while(i<n)
        {
            Book b=barr[i];
            dtm.insertRow(i, new String []{b.bnm,""+b.bno,""+b.bprice,""+b.bstate});
            i++;
        }

        JPanel p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                setVisible(false);
            }
        });
        setSize(400,400); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b1)
        {
            try
            {
                jt.print();
            }
            catch(Exception e1){}
        }
        else
        {
            setVisible(false);
        }
    }
}


public class JFrm14 extends JFrame implements ActionListener 
{
    JMenuBar mb;
    JMenu m1,m2,m3,m4;
    JMenuItem m11,m12,m13;
    JMenuItem m21,m22;
    JMenuItem m31,m32;
    JMenuItem m41,m42;
    BAdd ba;
    BMod bm;
    BDel bd;
    BDisplay bdisp;
    BDisplayName bdispNm;
    LinkedList<Book>ls;
    JFrm14()
    {
        super("Book");
        mb=new JMenuBar();
        m1=new JMenu("Book");
        m11=new JMenuItem("Add");
        m12=new JMenuItem("Mod");
        m13=new JMenuItem("Del");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);

        m2=new JMenu("Records");
        m21=new JMenuItem("Display Number");
        m22=new JMenuItem("Display Name");
        m21.addActionListener(this);
        m22.addActionListener(this);
        m2.add(m21);
        m2.add(m22);
        m3=new JMenu("Exit");
        m31=new JMenuItem("No");
        m32=new JMenuItem("Yes");
        m32.addActionListener(this);

        m4=new JMenu("File");
        m41=new JMenuItem("Open");
        m42=new JMenuItem("Save");
        m41.addActionListener(this);
        m42.addActionListener(this);
        m4.add(m41);
        m4.add(m42);
        m3.add(m31);
        m3.add(m32);
        mb.add(m1);
        mb.add(m2);
        mb.add(m4);
        mb.add(m3);
        setJMenuBar(mb);
        setSize(400,400);
        ls=new LinkedList<Book>();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JMenuItem a= (JMenuItem)e.getSource();
        if(a==m32)
            System.exit(0);
        if(a==m11)
            ba=new BAdd((Frame)null,"Add",ls,true);
        if(a==m12)
            bm=new BMod((Frame)null,"Mod",ls,true);
        if(a==m13)
            bd=new BDel((Frame)null,"Del",ls,true);
        if(a==m21)
            bdisp=new BDisplay((Frame) null, "Display",ls,true);
        if(a==m22)
            bdispNm=new BDisplayName((Frame) null, "Display Name",ls,true);
        if(a==m41)
            open();
        if(a==m42)
            save();
    }
    void save()
    {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try
        {
            fos=new FileOutputStream("book.dat");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        }
        catch(Exception e){}
    }
    void open()
    {

        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try
        {
            fis=new FileInputStream("Book.dat");
            ois=new ObjectInputStream(fis);
            ls=(LinkedList<Book>)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(Exception e){}
    }
    public static void main(String [] args)
    {
        JFrm14 a=new JFrm14();
    }
}
=======
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import mypkg.Util;
class Book implements Serializable,Comparable <Book>, Comparator <Book> 
{
    int bno,bprice;
    String bnm;
    Boolean bstate;
    Book()
    {
        bno=0;
        bnm=new String();
        bprice=0;
        bstate=true;
    }
    Book(int no,String nm,int price,Boolean state)
    {
        bno=no;
        bprice=price;
        bnm=nm;
        bstate=state;   
    }
    public String toString()
    {
        String s="Book Data\nNo:"+bno+"\nName:"+bnm+"\nPrice:"+bprice+"\nState:"+bstate;
        return s;
    }
    void display()
    {
        Util.display(toString());
    }
    public int compareTo (Book b)
    {   
        return (bno-b.bno);
    }
    public int compare(Book a,Book b)
    {
        return (a.bnm).compareTo(b.bnm);
    }
}
class BAdd extends JDialog implements ActionListener,FocusListener
{
    JPanel p1,p2;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3;
    JButton b1,b2;
    LinkedList<Book>ls;
    int no,price;
    String nm;Boolean state;
    Book obj;
    BAdd(Frame f,String t,LinkedList<Book>l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new JLabel("Book No:");
        l2=new JLabel("Name:");
        l3=new JLabel("Price:");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1,BorderLayout.CENTER);
        b1=new JButton("Add");
        b2=new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);
    }
    public void focusLost(FocusEvent e)
    {
        try
        {
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
        }
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            if(obj.bno==no)
                break;
            i++;
        }
        if(i!=n)
        {
            t2.setText(obj.bnm);
            t3.setText(""+obj.bprice);
            t1.requestFocus();
            return;
        }
        b1.setEnabled(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
        {
            setVisible(false);
        }
        else
        {
            try
            {
                no=Integer.parseInt(t1.getText());
                nm=t2.getText();
                price=Integer.parseInt(t3.getText());
                obj=new Book (no,nm,price,true);
                ls.add(obj);
            }
            catch(Exception e1){}
            setVisible(false);
        }
    }
}
class BMod extends JDialog implements ActionListener,FocusListener
{
    JPanel p1,p2;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3;
    JButton b1,b2;
    LinkedList<Book>ls;
    int no,price;
    String nm;Boolean state;
    Book obj;
    BMod(Frame f,String t,LinkedList<Book>l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new JLabel("Book No:");
        l2=new JLabel("Name:");
        l3=new JLabel("Price:");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1,BorderLayout.CENTER);
        b1=new JButton("MOD");
        b2=new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);
    }
    public void focusLost(FocusEvent e)
    {
        try
        {
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
        }
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            if(obj.bno==no && obj.bstate==true)
                break;
            i++;
        }
        if(i!=n)
        {
            t2.setText(obj.bnm);
            t3.setText(""+obj.bprice);
            b1.setEnabled(true);
        }
        else
        {
            t1.requestFocus();
            return;
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
        {
            setVisible(false);
        }
        else
        {
            try
            {
                no=Integer.parseInt(t1.getText());
                nm=t2.getText();
                price=Integer.parseInt(t3.getText());
                obj.bnm=nm;obj.bprice=price;
            }
            catch(Exception e1){}
            setVisible(false);
        }
    }
}
class BDel extends JDialog implements ActionListener,FocusListener
{
    JPanel p1,p2;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3;
    JButton b1,b2;
    LinkedList<Book>ls;
    int no,price;
    String nm;Boolean state;
    Book obj;
    BDel(Frame f,String t,LinkedList<Book>l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new JLabel("Book No:");
        l2=new JLabel("Name:");
        l3=new JLabel("Price:");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1,BorderLayout.CENTER);
        b1=new JButton("DEL");
        b2=new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);
    }
    public void focusLost(FocusEvent e)
    {
        try
        {
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
        }
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            if(obj.bno==no && obj.bstate==true)
                break;
            i++;
        }
        if(i!=n)
        {
            t2.setText(obj.bnm);
            t3.setText(""+obj.bprice);
            b1.setEnabled(true);
        }
        else
        {
            t1.requestFocus();
            return;
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
        {
            setVisible(false);
        }
        else
        {
            obj.bstate=false;
            setVisible(false);
        }
    }
}
class BDisplay extends JDialog implements ActionListener
{
    int i,n;
    LinkedList<Book>ls;
    JTable jt;
    JScrollPane jsp;
    DefaultTableModel dtm;
    String [][] arr;
    String [] chead ={"No","Name","Prize","State"};
    JButton b1,b2;
    Book [] barr=null;
    BDisplay(Frame f,String t,LinkedList<Book>ls,boolean state)
    {
        super(f,t,state);
        int i=0;
        this.ls=ls;
        barr=new Book[ls.size()]; //copy linkedList data to array
        ls.toArray(barr);
        //System.out.println(" "+Arrays.toString(barr));
        Arrays.sort(barr);
        
        
        
        b1=new JButton("Print");
        b2=new JButton("Back");
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        JPanel p1=new JPanel();
        dtm=new DefaultTableModel(arr,chead);
        jt=new JTable(dtm);
        jsp=new JScrollPane(jt);
        jsp.setBounds(20,20,350,280);
        p1.setLayout(null);
        p1.add(jsp);
        add(p1,BorderLayout.CENTER);
        i=0;
        n=barr.length;
        while(i<n)
        {
            Book b=barr[i];
            dtm.insertRow(i, new String []{""+b.bno,b.bnm,""+b.bprice,""+b.bstate});
            i++;
        }

        JPanel p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                setVisible(false);
            }
        });
        setSize(400,400); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b1)
        {
            try
            {
                jt.print();
            }
            catch(Exception e1){}
        }
        else
        {
            setVisible(false);
        }
    }
}
class BDisplayName extends JDialog implements ActionListener
{
    int i,n;
    LinkedList<Book>ls;
    JTable jt;
    JScrollPane jsp;
    DefaultTableModel dtm;
    String [][] arr;
    String [] chead ={"Name","No","Prize","State"};
    JButton b1,b2;
    Book [] barr=null;
    BDisplayName(Frame f,String t,LinkedList<Book>ls,boolean state)
    {
        super(f,t,state);
        int i=0;
        this.ls=ls;
        barr=new Book[ls.size()]; //copy linkedList data to array
        ls.toArray(barr);
        //System.out.println(" "+Arrays.toString(barr));
        Arrays.sort(barr,new Book());
        
        
        
        b1=new JButton("Print");
        b2=new JButton("Back");
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        JPanel p1=new JPanel();
        dtm=new DefaultTableModel(arr,chead);
        jt=new JTable(dtm);
        jsp=new JScrollPane(jt);
        jsp.setBounds(20,20,350,280);
        p1.setLayout(null);
        p1.add(jsp);
        add(p1,BorderLayout.CENTER);
        i=0;
        n=barr.length;
        while(i<n)
        {
            Book b=barr[i];
            dtm.insertRow(i, new String []{b.bnm,""+b.bno,""+b.bprice,""+b.bstate});
            i++;
        }

        JPanel p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        add(p2,BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                setVisible(false);
            }
        });
        setSize(400,400); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b1)
        {
            try
            {
                jt.print();
            }
            catch(Exception e1){}
        }
        else
        {
            setVisible(false);
        }
    }
}


public class JFrm14 extends JFrame implements ActionListener 
{
    JMenuBar mb;
    JMenu m1,m2,m3,m4;
    JMenuItem m11,m12,m13;
    JMenuItem m21,m22;
    JMenuItem m31,m32;
    JMenuItem m41,m42;
    BAdd ba;
    BMod bm;
    BDel bd;
    BDisplay bdisp;
    BDisplayName bdispNm;
    LinkedList<Book>ls;
    JFrm14()
    {
        super("Book");
        mb=new JMenuBar();
        m1=new JMenu("Book");
        m11=new JMenuItem("Add");
        m12=new JMenuItem("Mod");
        m13=new JMenuItem("Del");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);

        m2=new JMenu("Records");
        m21=new JMenuItem("Display Number");
        m22=new JMenuItem("Display Name");
        m21.addActionListener(this);
        m22.addActionListener(this);
        m2.add(m21);
        m2.add(m22);
        m3=new JMenu("Exit");
        m31=new JMenuItem("No");
        m32=new JMenuItem("Yes");
        m32.addActionListener(this);

        m4=new JMenu("File");
        m41=new JMenuItem("Open");
        m42=new JMenuItem("Save");
        m41.addActionListener(this);
        m42.addActionListener(this);
        m4.add(m41);
        m4.add(m42);
        m3.add(m31);
        m3.add(m32);
        mb.add(m1);
        mb.add(m2);
        mb.add(m4);
        mb.add(m3);
        setJMenuBar(mb);
        setSize(400,400);
        ls=new LinkedList<Book>();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JMenuItem a= (JMenuItem)e.getSource();
        if(a==m32)
            System.exit(0);
        if(a==m11)
            ba=new BAdd((Frame)null,"Add",ls,true);
        if(a==m12)
            bm=new BMod((Frame)null,"Mod",ls,true);
        if(a==m13)
            bd=new BDel((Frame)null,"Del",ls,true);
        if(a==m21)
            bdisp=new BDisplay((Frame) null, "Display",ls,true);
        if(a==m22)
            bdispNm=new BDisplayName((Frame) null, "Display Name",ls,true);
        if(a==m41)
            open();
        if(a==m42)
            save();
    }
    void save()
    {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try
        {
            fos=new FileOutputStream("book.dat");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        }
        catch(Exception e){}
    }
    void open()
    {

        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try
        {
            fis=new FileInputStream("Book.dat");
            ois=new ObjectInputStream(fis);
            ls=(LinkedList<Book>)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(Exception e){}
    }
    public static void main(String [] args)
    {
        JFrm14 a=new JFrm14();
    }
}
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
