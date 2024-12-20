class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // Maximum count of consecutive 1s
        int currentCount = 0; // Current streak of consecutive 1s

        // Iterate through the array
        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Increment current streak
            } else {
                maxCount = Math.max(maxCount, currentCount); // Update maxCount if needed
                currentCount = 0; // Reset current streak
            }
        }

        // Update maxCount for the last streak of 1s
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }

    public static void main(String[] args) {
        ConsecutiveOnes solution = new ConsecutiveOnes();

        // Test Case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Output: " + solution.findMaxConsecutiveOnes(nums1)); // Output: 3

        // Test Case 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Output: " + solution.findMaxConsecutiveOnes(nums2)); // Output: 2
    }
}
