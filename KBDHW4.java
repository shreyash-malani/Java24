// find the odd no or even no
import java.io.*;

public class KBDHW4
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
        if(no%2==0)
        {
            System.out.println(no+"is Even no");
        }
        else 
        {
            System.out.println(no+" is Odd no");
        }
    }
}