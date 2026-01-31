public class Armstrong {
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int cnt=0;

        // Find the number of digits (k)for()
        int digits = Integer.toString(n).length();

        // Calculate the sum of digits raised to the power of k
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits); // digit^k
            n /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == original)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isArmstrong(1));    // true
        System.out.println(isArmstrong(103));  // false
        System.out.println(isArmstrong(1634)); // true
        System.out.println(isArmstrong(371));  // true
        System.out.println(isArmstrong(9474)); // true
    }
}
// Explanation
// original = 1634: The variable original is used to store the input number, so we can compare it later.
// sum = 0: We initialize sum to accumulate the sum of the digits raised to the power of the number of digits.
// java 
// Copy code
//     int digits = Integer.toString(n).length(); // Find the number of digits

// Step to Find the Number of Digits (k):
// Convert 1634 to a string: "1634".
// Find its length: 4.
// digits = 4: There are 4 digits in 1634.
// java

// Copy code
//     while (n > 0) {
//         int digit = n % 10; // Extract the last digit
//         sum += Math.pow(digit, digits); // Add digit^digits to sum
//         n /= 10; // Remove the last digit
//     }
// Loop to Process Each Digit:

// At each iteration, we extract the last digit of the number, calculate its power, and add it to sum.
// Iteration 1:
// n = 1634.
// digit = 1634 % 10 = 4.
// sum = sum + 4^4 = 0 + 256 = 256.
// n = 1634 / 10 = 163.
// Iteration 2:
// n = 163.
// digit = 163 % 10 = 3.
// sum = sum + 3^4 = 256 + 81 = 337.
// n = 163 / 10 = 16.
// Iteration 3:
// n = 16.
// digit = 16 % 10 = 6.
// sum = sum + 6^4 = 337 + 1296 = 1633.
// n = 16 / 10 = 1.
// Iteration 4:
// n = 1.
// digit = 1 % 10 = 1.
// sum = sum + 1^4 = 1633 + 1 = 1634.
// n = 1 / 10 = 0.
// Final Values After Loop:

// sum = 1634.
// n = 0.
// java
// Copy code
//     return sum == original; // Compare sum with the original number
// Check if sum Equals original:
// sum = 1634 and original = 1634.
// Since they are equal, the function returns true.
// Complete Execution:
// Input: 1634.
// Steps in the Loop:
// Add 4^4, 3^4, 6^4, and 1^4 to sum sequentially.
// Final sum = 1634.
// Compare sum with original → Both are equal.
// Return true.
