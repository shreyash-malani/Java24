import java.util.*;

public class Pattern_9
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls Enter the number: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++) //These logic is for upper triangle 
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" "); // Print spaces
            }
            for (int j=n;j>=n-(2*i-2);j--)
            {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }

        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<i;j++) // These logic is for lower triangle
            {
                System.out.print(" "); // Print spaces
            }
            for(int j=1;j<=(2*(n-i)+1);j++) // Print stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}