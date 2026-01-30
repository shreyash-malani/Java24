
import java.io.*;

public class KBD15
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
        String str="";
        System.out.println("Enter no:");
        try
        {
            str=br.readLine();
        }
        catch(Exception e){}
        // try
        // {
        //     int no=Integer.parseInt(str);
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Invalid Input");
        //     return;
        // }
        System.out.println("Length:"+str.length());  //str is string class object and we have called its method length
        
    }
}
