
import java.util.*;
public class KBD3 
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        String [] a=null;
        a=new String[5];
        int i=0;
        while(i<a.length)
        {
            System.out.println("City Name"+i+":");
            a[i]=s.next();  //it is used to input data or waits for input
            i++;
        }
        System.out.println(" input Converted to string");  //this will create a list and input the given characters  
        System.out.println(Arrays.toString(a));

        System.out.println("string is sorted and print");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
