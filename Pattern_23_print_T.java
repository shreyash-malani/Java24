import java.util.*;

public class Pattern_23_print_T 
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
                if(i==0 || j==n/2) 
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
