import java.util.Arrays;

public class FrequencyCount {
    public static int[] frequencyCount(int[] arr, int n) {
        // Step 1: Adjust array values to ensure all elements are in the range [1, n]
        for (int i = 0; i < n; i++) {
            arr[i]--; // Convert 1-based to 0-based for easier indexing
        }

        // Step 2: Encode frequencies in the array
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n; // Get the actual index for this element
            arr[index] += n;        // Increment the encoded value at that index
        }

        // Step 3: Extract frequencies from the modified array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i] / n; // Divide by `n` to get the frequency
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {2, 3, 2, 3, 5};
        System.out.println(Arrays.toString(frequencyCount(arr1.clone(), 5))); // Output: [0, 2, 2, 0, 1]

        // Example 2
        int[] arr2 = {3, 3, 3, 3};
        System.out.println(Arrays.toString(frequencyCount(arr2.clone(), 4))); // Output: [0, 0, 4, 0]

        // Example 3
        int[] arr3 = {1};
        System.out.println(Arrays.toString(frequencyCount(arr3.clone(), 1))); // Output: [1]
    }
}
