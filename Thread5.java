// Heightst prioruty gets height count


class Thrd5 extends Thread
{
    long cnt;
    volatile boolean flg;
    Thrd5 (String nm , int nPriority)
    {
        super(nm);                           //NAMING THE THREAD
        setPriority(nPriority);            //By default priority is 5
        cnt=0;
    }
    void tstart()
    {
        flg=true;
        start();
    }   
    public void  run()
    {
        while(flg)
        {
            cnt++;
        }
    }
    public void tstop()
    {
        flg=false;
    }
}


public class Thread5
{
    public static void main(String [] args)
    {
        Thrd5 a = new Thrd5("A ", 1);
        Thrd5 b = new Thrd5("B ", 5);
        Thrd5 c = new Thrd5("C ", 8);
        
        a.tstart();
        b.tstart();
        c.tstart();

        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e){}

        a.tstop();
        b.tstop();
        c.tstop();
        
        try
        {
            a.join();
            b.join();
            c.join();
        }
        catch(Exception e){}
        
        System.out.println("A "+a.cnt);
        System.out.println("B "+b.cnt);
        System.out.println("C "+c.cnt);

    }
}