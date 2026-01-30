// import javax.swing.*;
// public class JFrm20 extends JFrame  
// {
//     JProgressBar p1;
//     int i=0;

//     JFrm20()
//     {
//         super("JProgressBar");
//         p1=new JProgressBar(0,10000);
//         p1.setBounds(40,40,160,30);
//         p1.setValue(0);
//         p1.setStringPainted(true);
//         add(p1);
//         setLayout(null);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }
//     public void iterate()
//     {
//         while(i<=10000)
//         {
//             p1.setValue(i);
//             i+=20;
//         }
//         try
//         {
//             Thread.sleep(100);
//         }
//         catch(Exception e){}
//     }
//     public static void main(String[] args) 
//     {
//         JFrm20 a=new JFrm20();    
//         a.setVisible(true);
//         a.iterate();
//     }
// }
import javax.swing.*; 
class JFrm20 extends JFrame
{
    JProgressBar p1;
    int i=0;
    JFrm20()
    {
        super("Progress Bar");
        p1=new JProgressBar(0,10000);
        p1.setBounds(40,40,160,30);
        p1.setValue(0);
        p1.setStringPainted(true);
        add(p1);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void iterate()
    {
        while(i<=10000)
        {
            p1.setValue(i);
            i+=20; //INCREMENT BY 20
            try
            {
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
    public static void main(String[] args) 
    {
        JFrm20 a=new JFrm20();
        a.setVisible(true);
        a.iterate();
    }
}