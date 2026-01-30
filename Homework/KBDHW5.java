//Length of input no
import java.io.*;

public class KBDHW5
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
        int cnt=0;
        while(no!=0) 
        {
            no/=10;
            cnt++;
        }
        System.out.println(cnt);
    }
}