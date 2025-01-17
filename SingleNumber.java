import java.util.*;

class SingleNumber 
{
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) 
        {
            if (map.get(key) == 1) {
                return key; // Return the single number
            }
        }
        return -1;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:  ");
        int n=sc.nextInt();

        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SingleNumber sn = new SingleNumber();
        System.out.println("Single Number is: "+sn.singleNumber(arr));


    }
}
