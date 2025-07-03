import java.util.*;
public class Pattern8 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * (n - i) + 1); j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
//Above code is without space and below code is with space 

// public class SolidInvertedTriangleWithSpaces {
//     public static void main(String[] args) {
//         int n = 3; // Number of rows

//         // Outer loop for rows
//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces
//             for (int j = 1; j < i; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars with spaces between them
//             for (int j = 1; j <= (2 * (n - i) + 1); j++) {
//                 System.out.print("*"); // Print a star
//                 if (j < (2 * (n - i) + 1)) { // Add a space after the star (except the last one)
//                     System.out.print(" ");
//                 }
//             }
//             // Move to the next line
//             System.out.println();
//         }
//     }
// }

