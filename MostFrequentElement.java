import java.util.HashMap;

public class MostFrequentElement {
    public static int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxFrequency = 0;
        int mostFrequent = -1;

        // Count occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            // Update the most frequent element if current count exceeds maxFrequency
            if (countMap.get(num) > maxFrequency) 
            {
                maxFrequency = countMap.get(num);
                mostFrequent = num;
            }
        }

        return mostFrequent; // Return the element with the highest frequency
    }

    public static void main(String[] args) {
        // Test Case 1: Most frequent element is 1
        int[] nums1 = {2, 2, 1, 1, 1, 3, 3};
        System.out.println("Most Frequent Element: " + mostFrequentElement(nums1)); // Output: 1

        // Test Case 2: Most frequent element is 2
        int[] nums2 = {2, 2, 2, 1, 1, 3, 3};
        System.out.println("Most Frequent Element: " + mostFrequentElement(nums2)); // Output: 2

        // Test Case 3: Most frequent element is 3
        int[] nums3 = {3, 3, 3, 3, 2, 1, 1};
        System.out.println("Most Frequent Element: " + mostFrequentElement(nums3)); // Output: 3
    }
}
