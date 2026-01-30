
import java.io.*;

public class KBD10
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
        System.out.println("Table:");
        while(i<=10)
        {
            System.out.println(no*i);
            i++;
        }
    }
}