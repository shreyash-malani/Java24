import java.util.*;

public class DuplicateUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3};

        // HashMap to count frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count occurrences
        for (int num : arr) 
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicates
        System.out.println("Duplicate elements are:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) 
        {
            if (entry.getValue() > 1) 
            {
                System.out.println(entry.getKey() + " → occurs " + entry.getValue() + " times");
            }
        }
    }
}
