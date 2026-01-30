import java.util.*;
public class KBD5 
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        Integer [] arr=null;
        arr=new Integer[5];
        int i=0;int tot=0;
        while(i<arr.length)
        {
            System.out.println("Arr["+i+"]:");
            arr[i]=s.nextInt();
            tot+=(arr[i]);
            i++;
        }
        String str="Data\n"+Arrays.toString(arr)+"\n Total:"+tot;
        System.out.println(str);

        //here we sort the list 
        Arrays.sort(arr);
        System.out.println("Data:" +Arrays.toString(arr));
        
        System.out.println("Search value:");
        int sv=s.nextInt();
        int index=Arrays.binarySearch(arr,sv);
        if(index==-1)
            System.out.println("Not Found");
        else 
            System.out.println("Found at "+ index);
    }
}
