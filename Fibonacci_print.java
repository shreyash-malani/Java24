import java.util.*;

public class Fibonacci_print 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;  // Calculate next term
            first = second;             // Update first
            second = next;              // Update second
        }
    }
}
//0 1 1 
