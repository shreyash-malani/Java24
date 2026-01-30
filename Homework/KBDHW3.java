//Reverse the string 
import java.io.*;

public class KBDHW3
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
        int rev=0;
        while(no>0)
        {
            rev=rev*10+(no%10);
            no/=10;
        }
        System.out.println(rev);
    }
}