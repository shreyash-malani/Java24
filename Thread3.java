class Thrd3 extends Thread 
{
    int cnt;
    String tnm;
    Thrd3(String nm,int val)
    {
        super(nm);  //NAMING THE THREAD
        cnt=val;
        tnm=nm;
    }
    public void run()
    {
        int i=1;
        while(i<=cnt)
        {
            System.out.println( tnm + " "+ i);
            try
            {
                Thread.sleep(1000);
            }catch(Exception e){}
            i++;
        }
    }
}
public class Thread3
{
    public static void main(String[] args) {
        System.out.println("Main Starts");
        Thrd3 A=new Thrd3("A",3);
        Thrd3 B=new Thrd3("B",5);
        Thrd3 C=new Thrd3("C",7);
    
        A.start();
        B.start();
        C.start();
        try
        {
            A.join();
            B.join();
            C.join();
            
        }catch(Exception e){}
        System.out.println("Main Ends");
    }
}