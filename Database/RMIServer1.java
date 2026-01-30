import java.rmi.*;
import java.rmi.server.*;

interface inter1 extends Remote 
{
    public int getNumber(int no) throws Exception;
}

class InterImpl1 extends UnicastRemoteObject implements inter1 
{
    InterImpl1() throws Exception 
    {
        super();
    }

    public int getNumber(int no) throws Exception 
    {
        return (int)(Math.random()*no);
    }
}

public class RMIServer1 
{
    public static void main(String [] args)
    {
        try
        {
            InterImpl1 a=new InterImpl1();
            Naming.rebind("w1", a);
            System.out.println("Server Started");
        }
        catch(Exception e){}
    }
}
