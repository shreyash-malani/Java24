public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer to place the next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Step 2: Fill the rest of the array with zeroes
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("Before :" +java.util.Arrays.toString(nums1) );
        moveZeroes(nums1);
        System.out.println("Output 1: " + java.util.Arrays.toString(nums1)); // [1, 3, 12, 0, 0]

        // Example 2
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println("Output 2: " + java.util.Arrays.toString(nums2)); // [0]
    }
}
