import java.util.*;
public class DuplicateUsingHashSet 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int a:arr)
        {
            if(hs.contains(a)) 
            {
                System.out.println("Duplicate found: " + a);
                return;
            } 
            else 
            {
                hs.add(a);
            }
        }
    }
}
