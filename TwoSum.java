import java.util.HashMap;

//Understanding of the code is given below the code pls refer the code

public class TwoSum 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array

        for (int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i]; // Calculate the complement
            
            // Check if the complement is already in the map
            if (numMap.containsKey(complement)) 
            {
                return new int[] {numMap.get(complement), i};
            }
            
            // Add the current number and its index to the map
            numMap.put(nums[i], i);
        }
        
        // In case no solution is found (although the problem guarantees a solution)
        return new int[] {};
    }

    public static void main(String[] args) 
    {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 15;
        int[] result1 = twoSum(nums1, target1);
        if (result1.length == 0) 
        {
            System.out.println("No solution found for nums1.");
        } 
        else 
        {
            System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
        }

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        if (result2.length == 0) 
        {
            System.out.println("No solution found for nums2.");
        } 
        else 
        {
            System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
        }

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        if (result3.length == 0) 
        {
            System.out.println("No solution found for nums3.");
        } 
        else 
        {
            System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
        } 
    } 
}

// public class TwoSum
// {
//     static int num []=new int[]{1,2,3,4,5,6};
//     public static void hi()
//     {
//         for(int i=0;i<num.length;i++)
//         {
//             System.out.println(num[i] +" ");   
//         }
//     }
//     public static void main(String [] args)
//     {
//         hi();
//     }
// }