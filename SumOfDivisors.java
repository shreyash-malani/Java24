public class SumOfDivisors {

    // Function to calculate the sum of divisors of a number x
    public static int sumOfDivisors(int x) {
        int sum = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                sum += i; // Add the divisor
                if (i != x / i) { // Add the corresponding pair if it's not the same
                    sum += x / i;
                }
            }
        }
        return sum;
    }

    // Function to calculate the total sum of F(i) for i = 1 to n
    public static int totalSumOfDivisors(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += sumOfDivisors(i);
        }
        return totalSum;
    }

    public static void main(String[] args) {
        // Test cases
        int n1 = 4;
        System.out.println("Sum for n = 4: " + totalSumOfDivisors(n1)); // Output: 15

        int n2 = 5;
        System.out.println("Sum for n = 5: " + totalSumOfDivisors(n2)); // Output: 21

        int n3 = 1;
        System.out.println("Sum for n = 1: " + totalSumOfDivisors(n3)); // Output: 1
    }
}
