import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class DB
{
    static Connection con;
    static PreparedStatement psi; //Insert row query
    static PreparedStatement psm; //modify row query
    static PreparedStatement psd; //Deletion row query
    static PreparedStatement pss; //Search Student query
    static PreparedStatement pst; //Search trade query
    static PreparedStatement psdisplay; 
    static ResultSet rss;
    static ResultSet rst;
    static int no,id;
    static String nm,tnm;

    static //initaialize static field 
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data124", "root","");
            psi=con.prepareStatement("insert into Student values(?,?,?,?)");
            psm=con.prepareStatement("update student set name=?,tid=? where roll_no=?");
            psd=con.prepareStatement("update student set state=false where roll_no=?");
            pss=con.prepareStatement("Select * from Student where roll_no=?");
            pst=con.prepareStatement("Select * from trade where tid=?");
            psdisplay=con.prepareStatement("Select a.roll_no,a.name,a.tid,b.tnm,a.state from student a,trade b where a.tid=b.tid"); //Joining the query
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
            System.out.println("Row Inserted");
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
        System.out.println(n);
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
        b2=new JButton("BACK");
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
        }
        t2.setEditable(true);
        t3.setEditable(true);
        
            
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
                    if(action.equals("DEL"))
                    {
                        t2.setEditable(false);
                        t3.setEditable(false);
                    }
                }
                catch(Exception e3){}
            }
            b1.setEnabled(true);
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
            System.out.println(rstate);
            System.out.println(id);
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
class StudentDisplay extends JDialog implements ActionListener
{
    ResultSet rs;
    JTable jt;
    DefaultTableModel dtm;
    JScrollPane jsp;
    JButton btm ;
    String [][] arr=null;

    String [] chead={"Roll No","Name","Trade ID","Trade Name","State"};
    StudentDisplay(JFrame f,String action,boolean  state)
    {
        super(f,action,state);
        dtm=new DefaultTableModel(arr,chead);
        int i=0;
        try
        {
            rs=DB.psdisplay.executeQuery();
            while(rs.next())
            {
                dtm.insertRow(i, new String [] {""+rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                i++;
            }
            jt=new JTable(dtm);
            jsp=new JScrollPane(jt);
            btm=new JButton("Print");
            btm.addActionListener(this);
            setLayout(new FlowLayout());
            jsp.setBounds(10,10,280,300);
            btm.setBounds(320,320,80,20);
            add(jsp);
            add(btm);
        }
        catch(Exception e){}
        setSize(400,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            jt.print();
        }
        catch(Exception e1){}
    }
} 
public class JStudentForm extends JFrame implements ActionListener
{
    StudentForm sf;
    StudentDisplay sd; 
    JButton b1,b2,b3,b4,b5;

    public JStudentForm() 
    {
        super("Student Record");
        b1=new JButton("ADD");
        b2=new JButton("MOD");
        b3=new JButton("DEL");
        b4=new JButton("EXIT");
        b5=new JButton("DISPLAY");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);
        add(b5);
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
            if(s.equals("DISPLAY"))
            {
                sd=new StudentDisplay((JFrame)null, s,true);
            }
            else
            {
                sf=new StudentForm((JFrame) null,s,true);
            }
            
        }
    }
    public static void main(String[] args) 
    {
        JStudentForm a = new JStudentForm();

    }

}

// cd .\Database\ use as a class path
// javac -cp ".;driver.jar;D:\java24" JStudentForm.java
// java -cp ".;driver.jar;D:\java24" JStudentForm   It works properly using these in the terminal 
