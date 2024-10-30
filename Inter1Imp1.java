import javax.swing.*;
interface Imp1
{
    void setData();
    void display();
}
public class Inter1Imp1 implements Imp1
{
    int no;
    String nm;
    Inter1Imp1()
    {
        no=0;
        nm=new String();
    }
    public void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"No:"));
            nm=JOptionPane.showInputDialog(null,"Name:");
        }
        catch(Exception e){}
    }
    public String toString()
    {
        String s="\nNo:"+no+"\nName:"+nm;
        return s;
    }   
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public static void main(String [] args)
    {
        Inter1Imp1 a=new Inter1Imp1();
        a.setData();
        a.display();
    }
}
