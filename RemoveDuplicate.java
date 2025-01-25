public class RemoveDuplicate 
{
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array has only one element, return its length
        if (nums.length == 1) {
            return 1;
        }

        // Pointer for the position of the next unique element
        int uniqueIndex = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the previous one
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i]; // Place the unique element at the uniqueIndex
                uniqueIndex++; // Move the pointer forward
            }
        }

        // Return the count of unique elements
        return uniqueIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicate sol = new RemoveDuplicate();
        
        // Test case 1
        int[] nums1 = {1, 1, 2};
        int k1 = sol.removeDuplicates(nums1);
        System.out.println("k = " + k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = sol.removeDuplicates(nums2);
        System.out.println("k = " + k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
} //here i have provided both code pls you can refer the first code as that code will understand better 
// import java.util.TreeSet;

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         // Step 1: Use a TreeSet to remove duplicates and sort the elements
//         TreeSet<Integer> set = new TreeSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }

//         // Step 2: Copy the unique elements back to the nums array
//         int index = 0;
//         for (int num : set) {
//             nums[index] = num;
//             index++;
//         }

//         // Step 3: Set unused positions in nums to a default value (optional)
//         for (int i = set.size(); i < nums.length; i++) {
//             nums[i] = 0; // Default value; you can change this if needed
//         }

//         // Step 4: Return the size of the set (number of unique elements)
//         return set.size();
//     }

//     // Testing the implementation
//     public static void main(String[] args) {
//         Solution solution = new Solution();

//         int[] nums = {1, 1, 2}; // Input array
//         int k = solution.removeDuplicates(nums); // Removing duplicates

//         // Print the first k elements (unique part)
//         System.out.println("Unique elements count: " + k);
//         System.out.print("Modified array: ");
//         for (int i = 0; i < nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

