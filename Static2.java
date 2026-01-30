import javax.swing.*;
public class Static2 
{
    static int no;
    static void input()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
        }
        catch(Exception e){}
    }    
    static void display()
    {
        JOptionPane.showMessageDialog(null,"No:"+no);
    }
    public static void main(String [] args)
    {
        input();
        display();
    }
}
