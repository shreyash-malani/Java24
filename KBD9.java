
import java.io.*;

public class KBD9
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
            no=Integer.parseInt(br.readLine()); //here you should input only number 
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("No:"+no);
    }
}
