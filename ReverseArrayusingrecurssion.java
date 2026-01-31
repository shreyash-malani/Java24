import java.util.*;

public class ReverseArrayusingrecurssion {
    // Function to reverse the array using recursion
    static void reverseArray(int[] arr, int start, int end) {
        // Base case: If the start index is greater than or equal to the end index
        if (start >= end) { //star and end means initial index value 
            return;
        }

        // Swap elements at 'start' and 'end'
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with updated indices
        reverseArray(arr, start + 1, end - 1);

        System.out.print("hi "); //for understanding purpose 
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 4, 3, 2, 6, 5};
        System.out.println("Original Array: " + Arrays.toString(arr1));
        reverseArray(arr1, 0, arr1.length - 1);
        // System.out.print(arr1.clone());
        System.out.println("Reversed Array: " + Arrays.toString(arr1));

        // Example 2
        int[] arr2 = {4, 5, 2};
        System.out.println("Original Array: " + Arrays.toString(arr2));
        reverseArray(arr2, 0, arr2.length - 1);
        System.out.println("Reversed Array: " + Arrays.toString(arr2));

        // Example 3
        int[] arr3 = {1};
        System.out.println("Original Array: " + Arrays.toString(arr3));
        reverseArray(arr3, 0, arr3.length - 1);
        System.out.println("Reversed Array: " + Arrays.toString(arr3));
    }
}
