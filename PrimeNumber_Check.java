import java.util.*;
public class PrimeNumber_Check 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = sc.nextInt();
        
        if (isPrime(n)) 
        {
            System.out.println(n + " is a prime number.");
        } 
        else 
        {
            System.out.println(n + " is not a prime number.");
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<1)
        {
            return false;
        }
        if(n==1)
        {
            return false; // 1 is not a prime number
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%2==0)
            {
                return false; // n is prime

                
            }
        }
        return true; // If no divisors found, n is prime
    }

    
}
