import java.util.*;

public class keyboard1
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        Integer arr[]=null;
        arr=new Integer[5];
        int tot=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("City Name"+i+":");
            arr[i]=s.nextInt();
            tot=tot+arr[i];
        }
        String d="\nData: "+Arrays.toString(arr)+"\n Totoal: "+tot;
        System.out.println(d);
    }
}
