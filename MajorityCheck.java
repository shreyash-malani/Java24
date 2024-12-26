public class MajorityCheck {
    public int majorityElement(int[] nums) {
        int candidate = nums[0]; // Assume the first element as the candidate
        int count = 0;           // Initialize the count as 0
        
        // Step 1: Find the candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Update the candidate when count is 0
            }
            if (num == candidate) {
                count++; // Increment count if num matches candidate
            } else {
                count--; // Decrement count otherwise
            }
        }
        
        // Since the majority element always exists, return the candidate
        return candidate;
    }

    public static void main(String[] args) {
        MajorityCheck solution = new MajorityCheck();
        
        // Example 1
        int[] nums1 = {3, 2, 3 ,2, 2};
        System.out.println(solution.majorityElement(nums1)); // Output: 3
        
        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2)); // Output: 2
    }
}
