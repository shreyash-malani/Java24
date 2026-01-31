import java.util.*;

public class Pattern_20_print_E 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||i==n-1||i==n/2||j==0) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
    
}
