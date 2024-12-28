import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();  // Input the number
        
        // Negative numbers and numbers ending with 0 (except 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            System.out.println(0);  // Not a palindrome
            return;
        }

        int reversed = 0;
        int original = x;  // Store the original number to compare later

        while (x > 0) {
            int tmp = x % 10;  // Extract the last digit
            reversed = reversed * 10 + tmp;  // Build the reversed number
            x /= 10;  // Remove the last digit
        }

        // Check if the original number equals the reversed number
        if (original == reversed) {
            System.out.println(1);  // Palindrome
        } else {
            System.out.println(0);  // Not a palindrome
        }
    }
}
