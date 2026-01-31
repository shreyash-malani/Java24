// import java.awt.*;
// import java.awt.event.*;
// class Thrd9 extends Thread
// {
//     volatile boolean flag;
//     Graphics g;
//     Thrd9(Graphics g)
//     {
//         super();
//         this.g=g;
//     }
//     void tshort()
//     {
//         flag=true;
//         start();
//     }
//     void tstop()
//     {
//         flag=false;
//     }
//     public void run()
//     {
//         int a,b;
//         Color cr;
//         while(flag)
//         {
//             a=(int)(Math.random()*400);
//             b=(int)(Math.random()*400);

//             cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
//             g.setColor(cr);
//             g.fillOval(b, b, 20, 20);
//             try
//             {
//                 Thread.sleep(1000);
//             }
//             catch(Exception e){}
//         }
//     }
// }
// public class Thrd9Frm extends Frame
// {
//     Thrd9 obj;int flg;
//     Thrd9Frm()
//     {
//         super("Thread");flg=0;
//         addMouseListener(new MouseAdapter(){
//             public void mouseClicked(MouseEvent e)
//             {
//                 if(flg==0)
//                     start();
//                 else
//                     stop();
//             }
//         });
//         setSize(400,400);
//         setVisible(true);
//     }
//     void start()
//     {
//         flg=1;
//         obj=new Thrd9(getGraphics());
//         obj.start();
//     }
//     void stop()
//     {
//         obj.tstop();
//         flg=0;
//     }
//     public static void main(String [] args)
//     {
//         Thrd9Frm a=new Thrd9Frm();
//     }
// }
import java.awt.*;
import java.awt.event.*;

class Thrd9 extends Thread{
    volatile boolean flag;
    Graphics g;
    Thrd9(Graphics g)
    {
        super();
        this.g=g;
    }
    void tstart()
    {
        flag = true;
        start();
    }
    void tstop()
    {
        flag=false;
    }

    public void run()
    {
        int a,b;
        Color cr;
        while(flag)
        {
            a=(int)(Math.random()*400);
            b=(int)(Math.random()*400);
            
            cr= new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        
            g.setColor(cr);
            g.fillOval(a,b,20,20);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        
        
        }
    }
}

public class Thrd9Frm extends Frame
{

    Thrd9 obj; int flg;
    Thrd9Frm()
    {
        super("Thread");
        flg=0;

        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e)
            {
                if (flg==0)
                    start();
                else
                    stop();    
            }    
        });


        setSize(400,400);
        setVisible(true);

    }
    void start()
    {
        flg= 1;
        obj=new Thrd9(getGraphics());
        obj.tstart();
    }
    void stop()
    {
        obj.tstop();
    }
    public static void main(String [] args)
    {
        Thrd9Frm a = new Thrd9Frm();
    }

}