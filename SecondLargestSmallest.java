import java.util.*;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and array elements
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Need at least 2 elements to find second largest/smallest.");
            return;
        }

        // Initialize variables
        int largest = -1;
        int secondLargest = -1;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // For largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // For smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // Output results
        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("No second largest element (all elements might be same).");
        else
            System.out.println("Second Largest: " + secondLargest);

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("No second smallest element (all elements might be same).");
        else
            System.out.println("Second Smallest: " + secondSmallest);
    }
}
