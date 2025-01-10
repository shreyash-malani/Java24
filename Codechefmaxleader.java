import java.lang.*;
import java.util.*;

class Codechefmaxleader

{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Scanner to take input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of students
        int n = sc.nextInt();
        
        // Initialize the array of achievement scores
        int a[] = new int[n];
        
        // Read the achievement scores
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Initialize variable for tracking the maximum score
        int max = Integer.MIN_VALUE;
        
        // StringBuilder to store the result (whether each student is happy or not)
        StringBuilder s = new StringBuilder();
        
        // Loop through the scores and check if each student is happy
        for (int j = 0; j < n; j++) {
            // If the student's score is greater than the previous max, they are happy
            if (a[j] > max) {
                s.append("1 ");
                max = a[j]; // Update the max score encountered
            } else {
                s.append("0 ");
            }
        }
        
        // Output the result, trim to remove any extra space at the end
        System.out.println(s);
    }
}
