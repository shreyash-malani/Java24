import java.awt.*;
import java.awt.event.*;

class Thrd10 extends Thread 
{
    volatile boolean flag;
    Graphics g;

    Thrd10(Graphics g) 
    {
        super();
        this.g = g;
    }

    void tstart() 
    {
        flag = true;
        start();
    }

    void tstop() 
    {
        flag = false;
    }

    public void run() 
    {
        int a, b;
        Color cr;
        while (flag) 
        {
            a = (int) (Math.random() * 400);
            b = (int) (Math.random() * 400);

            cr = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

            g.setColor(cr);
            g.fillOval(a, b, 20, 20);
            try 
            {
                Thread.sleep(1000);
            } 
            catch (Exception e) {}

        }
    }
}

public class Thread10 extends Frame implements Runnable 
{

    Thrd10 obj;
    int flg;

    Thread10() 
    {
        super("Thread");
        flg = 0;

        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                if (flg == 0)
                    start();
                else
                    stop();
            }
        });

        setSize(400, 400);
        (new Thread(this)).start();

        setVisible(true);

    }

    public void run() 
    {
        while (true) 
        {
            try 
            {
                Thread.sleep(10000);
            } catch (Exception e) {}
            repaint();
        }
    }

    void start() 
    {
        flg = 1;
        obj = new Thrd10(getGraphics());
        obj.tstart();
    }

    void stop() 
    {
        flg = 0;
        obj.tstop();
    }

    public static void main(String[] args) 
    {
        Thread10 a = new Thread10();
    }

}