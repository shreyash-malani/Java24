import java.util.*;
public class BubbleSort 
{
    public static void sort(int nums[])
    {
        int i,j,tmp,n=nums.length;
        for(i=0;i<n-1;i++) 
        {
            for(j=0;j<n-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        } 
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        sort(nums);
        System.out.println("Sorted Array"+ Arrays.toString(nums));

    }
      
}
