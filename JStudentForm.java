import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class DB
{
    static Connection con;
    static PreparedStatement psi; //Insert Query
    static PreparedStatement psm; //Insertion
    static PreparedStatement psd; //Deletion
    static PreparedStatement pss; //Search Student 
    static PreparedStatement pst; //Search trade
    static PreparedStatement psdisplay; //
    static ResultSet rss;
    static ResultSet rst;
    static int no,id;
    static String nm,tnm;

    static //initaialize static field 
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data24", "root","");
            psi=con.prepareStatement("Insert into Student values(?,?,?,?)");
            psm=con.prepareStatement("Update Student set name=?,id=? where roll_no=?");
            psd=con.prepareStatement("Update Student set state=false where roll_no=?");
            pss=con.prepareStatement("Select * from Student where roll_no=?");
            pst=con.prepareStatement("Select *from trade where tid=?");
            psdisplay=con.prepareStatement("Select a.roll_no,a.name,a.tid,b.tnm,a.state where a.tid=b.tid from student a,Student b"); //Joining the query
        }
        catch(Exception e){}
    }
    static void update(int a,String b,int c)
    {
        no=a;
        nm=b;
        id=c;
    }
    static void add()
    {
        try
        {
            psi.setInt(1,no);
            psi.setString(2,nm);
            psi.setInt(3,id);
            psi.setBoolean(4, true);
            psi.executeUpdate();
            System.out.println("Row inserted");
        }
        catch(Exception e){}
    }
    static void mod()
    {
        try
        {
            psm.setString(1,nm);
            psm.setInt(2,id);
            psm.setInt(3,no);
            psm.executeUpdate();
            System.out.println("Row Modified");
        }
        catch(Exception e){}
    }
    static void del()
    {
        try
        {
            psd.setInt(1,no);
            psd.executeUpdate();
            System.out.println("Row Deleted");
        }
        catch(Exception e){}
    }
    static boolean ssearch(int n)
    {
        boolean result=false;
        try
        {
            pss.setInt(1,n);
            rss=pss.executeQuery();
            result=rss.next();
        }
        catch(Exception e){}
        return result;
    }
    static boolean tsearch(int n)
    {
        boolean result=false;
        try
        {
            pst.setInt(1,n);
            rst=pst.executeQuery();
            result=rst.next();
        }
        catch(Exception e){}
        return result;
    }

}
class StudentForm extends JDialog implements  ActionListener, FocusListener
{
    int no,id;
    String name,tname,action;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    ResultSet rs;
    StudentForm(JFrame f,String ac,boolean state)
    {
        super(f,ac,state);
        this.action=ac;
        l1=new JLabel("Roll no");
        l2=new JLabel("Name");
        l3=new JLabel("Trade ID");
        l4=new JLabel("Trade Name");

        t1=new JTextField(10);
        t2=new JTextField(20);
        t3=new JTextField(20);
        t4=new JTextField(20);
        
        t4.setEditable(false);
        t1.addFocusListener(this);
        t3.addFocusListener(this);

        b1=new JButton(action);
        b2=new JButton("back");
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(new GridLayout(5,2,5,5));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);

        setSize(400,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
            setVisible(false);
        else
        {
            update();
        }
    }
    public void focusGained(FocusEvent e)
    {
        JTextField t=(JTextField)e.getSource();
        if(t==t1)
        {
            b1.setEnabled(false);
            t2.setEditable(true);
            t3.setEditable(true);
        }
            
    }
    public void focusLost(FocusEvent e)
    {
        JTextField t=(JTextField)e.getSource();
        if(t==t1) //if focuslosed from roll no
        {
            try
            {
                no=Integer.parseInt(t1.getText());
            }
            catch(Exception e1){t1.requestFocus();return;}

            boolean result=DB.ssearch(no);
            
            if(result==false) // record not found
            {
                if(action.equals("ADD"))
                {
                    ;
                }
                else
                {
                    t1.requestFocus();
                    return;
                }
            }
            else
            {
                if(action.equals("ADD"))
                {
                    t1.requestFocus();
                    return;
                }
                try
                {
                    name=DB.rss.getString(2);
                    id=DB.rss.getInt(3);
                    boolean rstate=DB.rss.getBoolean(4);
                    if(rstate==false)
                    {
                        t1.requestFocus();
                        return;
                    }

                    rstate= DB.tsearch(id);
                    tname=DB.rst.getString(2);
                    t2.setText(name);
                    t3.setText(""+id);
                    t4.setText(tname);
                    if(action.equals("Del"))
                    {
                        t2.setEditable(false);
                        t3.setEditable(false);
                    }
                }
                catch(Exception e3){}
            }
        }
        else
        {
            try
            {
                id=Integer.parseInt(t3.getText());
            }
            catch(Exception e4)
            {
                t3.requestFocus();
                return;
            }
            boolean rstate=DB.tsearch(id);
            if(rstate==false)
            {
                t3.requestFocus();
                return;
            }
            else
            {
                try
                {
                    tname=DB.rst.getString(2);
                    t4.setText(tname);
                    b1.setEnabled(true);
                }
                catch(Exception e5){}
                
            }
        }
    }
    public void update()
    {
        name=t2.getText();
        DB.no=no;
        DB.nm=name;
        DB.tnm=tname;
        DB.id=id;
        if(action.equals("ADD"))
        {
            DB.add();
        }
        if(action.equals("MOD"))
        {
            DB.mod();
        }
        if(action.equals("DEL"))
        {
            DB.del();
        }
    }
}
class JStudentForm extends JFrame implements ActionListener
{
    StudentForm sf;
    JButton b1,b2,b3,b4;

    public JStudentForm() 
    {
        super();
        b1=new JButton("ADD");
        b2=new JButton("MOD");
        b3=new JButton("DEL");
        b4=new JButton("EXIT");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("EXIT"))
        {
            System.exit(0);
        }
        else
        {
            sf=new StudentForm((JFrame) null,s,true);
        }
    }
    public static void main(String[] args) 
    {
        JStudentForm studentForm = new JStudentForm();

    }

}


