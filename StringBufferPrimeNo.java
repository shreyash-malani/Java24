import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringBufferPrimeNo 
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
        try
        {
            System.out.println("Enter No: ");
            no=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input ");
        }
        int i=2;
        while(i<no)
        {
            if(no%i==0)
                break;
            i++;
        }
        if(i==no)
            System.out.println("Prime No");
        else
            System.out.println("Not a Prime no");
    } 

}
