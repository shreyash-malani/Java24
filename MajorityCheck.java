// public class MajorityCheck {
//     public int majorityElement(int[] nums) {
//         int candidate = nums[0]; // Assume the first element as the candidate
//         int count = 0;           // Initialize the count as 0
        
//         // Step 1: Find the candidate for the majority element
//         for (int num : nums) {
//             if (count == 0) {
//                 candidate = num; // Update the candidate when count is 0
//             }
//             if (num == candidate) {
//                 count++; // Increment count if num matches candidate
//             } else {
//                 count--; // Decrement count otherwise
//             }
//         }
        
//         // Since the majority element always exists, return the candidate
//         return candidate;
//     }

//     public static void main(String[] args) {
//         MajorityCheck solution = new MajorityCheck();
        
//         // Example 1
//         int[] nums1 = {3, 2, 3 ,2, 2};
//         System.out.println(solution.majorityElement(nums1)); // Output: 3
        
//         // Example 2
//         int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
//         System.out.println(solution.majorityElement(nums2)); // Output: 2
//     }
// }

//Using HashMap 
import java.util.HashMap;
import java.util.Map;

public class MajorityCheck {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Iterate through the array and count occurrences of each element
        for (int num : nums) 
        {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
            // Check if the current element is the majority element
            // if (countMap.get(num) > nums.length / 2) 
            // {
            //     return num; // Return the majority element as soon as it's found
            // }
        for(Map.Entry<Integer,Integer> entry:countMap.entrySet())
        {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        } 
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {6,5,5};
        System.out.println("Majority Element: " + majorityElement(nums1)); // Output: 5

        int[] nums2 = {2, 2, 1, 1, 1, 3, 3};
        System.out.println("Majority Element: " + majorityElement(nums2)); // Output: 1
    }
}
