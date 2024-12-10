import java.util.ArrayList;
import java.util.List;

class Frequency_Count {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        // Initialize result array with zero
        int[] result = new int[n];
        
        // Traverse the array and update frequencies
        for (int i = 0; i < n; i++) {
            int index = arr[i] - 1; // Calculate the index corresponding to the number
            if (index >= 0 && index < n) { // Check if the index is valid
                result[index] = result[index] + 1; // Increment the value at the calculated index
            }
        }
        
        
        // Convert result array to list using a simple for loop
        List<Integer> frequencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            frequencyList.add(result[i]);
        }
        
        return frequencyList;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        Frequency_Count solution = new Frequency_Count();
        System.out.println(solution.frequencyCount(arr)); // Output: [0, 2, 2, 0, 1]
        
    }
}
