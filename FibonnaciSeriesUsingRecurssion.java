class FibonnaciSeriesUsingRecurssion {
    public static int fib(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Two variables to store the last two Fibonacci numbers
        int a = 0, b = 1;

        // Iteratively calculate Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) 
        {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) 
    {
        
        // Test examples
        System.out.println(fib(2)); // Output: 1
        System.out.println(fib(3)); // Output: 2
        System.out.println(fib(4)); // Output: 3
    }
}
