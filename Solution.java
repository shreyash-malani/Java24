class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        // XOR all elements
        for (int num : nums) {
            result ^= num;
        }

        return result; // Single number remains
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1,1,2,2,3};
        System.out.println("Single Number: " + solution.singleNumber(nums1)); // Output: 1

        // Test Case 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single Number: " + solution.singleNumber(nums2)); // Output: 4

        // Test Case 3
        int[] nums3 = {1};
        System.out.println("Single Number: " + solution.singleNumber(nums3)); // Output: 1
    }
}
