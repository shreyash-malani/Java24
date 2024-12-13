//Striver Example 
//Question no 7 table 

import java.util.*;
public class p1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();

        // Print reverse multiplication table
        int multiplier = 10;
        while (multiplier >= 1) {
            System.out.print((n * multiplier) +" ");
            multiplier--;
        }
        scanner.close();
    }
}