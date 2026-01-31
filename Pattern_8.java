import java.util.*;

public class Pattern_8
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls Enter the number: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<i;j++) // Print leading spaces
            {
                System.out.print(" ");
            }

            for(int j=1;j<=(2*(n-i)+1);j++) // Print stars
            {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}