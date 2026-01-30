
import java.io.*;

public class KBD12
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
        int i=2;
        while(i<no)
        {
            if(no%i==0)
                break;
            i++;
        }
        if(i==no)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
