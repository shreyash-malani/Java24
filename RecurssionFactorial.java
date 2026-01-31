import java.util.*;
public class RecurssionFactorial 
{
    static ArrayList<Long> factorialNumbers(long n) 
    {
        ArrayList<Long> result=new ArrayList<>();
        long fact=1;
        int i=1;
        
        while(fact<=n)
        {
            result.add(fact);
            i++;
            fact=fact*i;
        }
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextLong();

        System.out.println(factorialNumbers(n));
    }

}