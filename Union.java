
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Union 
{
    public static ArrayList<Integer> findUnion(int a[], int b[])
    {
        TreeSet<Integer> ts=new TreeSet<>();
        int n=a.length;
        int m=b.length;
        for(int i=0;i<n;i++)
        {
            ts.add(a[i]);
        }
        for(int j=0;j<m;j++)
        {
            ts.add(b[j]);
        }
        return  new ArrayList<>(ts);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Array size: ");
        int l=sc.nextInt();

        int a[]=new int[l];
        System.out.println("Value inputed for a array");
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[l];
        System.out.println("Value printed for b array");
        for(int j=0;j<l;j++)
        {
            b[j]=sc.nextInt();
        }
        ArrayList<Integer> res =findUnion(a, b);
        System.out.println("The union of the arrays is:");
        for (int c=0;c<res.size();c++) 
        {
            System.out.print(res.get(c) + " ");
        }

        // Alternate way for "for loop"
        // for (int val : result) 
        // {
        //     System.out.print(val + " ");
        // }    
    }
}