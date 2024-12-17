import java.io.*;

public class StringBuilderReverse 
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
        StringBuilder a=new StringBuilder(str);
        StringBuilder b=a.reverse();
        String Rev="Reverse:"+ b;
        System.out.println(Rev);
    }    
}
