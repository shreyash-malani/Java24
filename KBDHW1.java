// program to implement Digit Sum
import java.io.*;

public class KBDHW1
{
    public static void main(String [] args)
    {
        InputStreamReader isr=null;
        BufferedReader br=null;
        try
        {
            isr=new InputStreamReader(System.in);
            br=new BufferedReader(isr);
        }
        catch(Exception e){}
        int no=0;
        System.out.println("Enter no:");
        try
        {
            no=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            return;
        }
        int dig=0,tot=0;
        while(no>0)
        {
            dig=no%10;
            tot=tot+dig;
            no=no/10;
        }
        System.out.println("\nSum:"+tot);    
    }
}
