import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Outer loop for rows
            // Print spaces for alignment
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars in each row
            for (int j = n; j >= n - (2 * i - 2); j--) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        sc.close();
    }
}
// not fully understood
