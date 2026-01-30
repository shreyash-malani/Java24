// program to implement to find the prime no  
import java.io.*;

public class KBDHW2
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
        int no=0,i=1;
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
        int cnt=0;
        while (i<=(no/2))
        {
            if (no%i==0)
                cnt++;
            i++;
        }
        if (cnt==0)
            System.out.println(no+" "+" is a Prime number");
        else
            System.out.println(no+" "+"is Not a Prime number");
    }
}
