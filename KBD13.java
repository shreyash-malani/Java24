
import java.io.*;

public class KBD13
{
    public static void main(String [] args)
    {
        InputStreamReader isr=null;
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e){}
        int no=0;
        String str="";
        System.out.println("Enter no:");
        try
        {
            str=br.readLine();
        }
        catch(Exception e){}
        try
        {
            no=Integer.parseInt(str);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            return;
        }
        int tot=0;
        while(no>0)
        {
            tot=tot+(no%10);
            no/=10;
        }
        System.out.println("Digit Sum:"+tot);
    }
}
