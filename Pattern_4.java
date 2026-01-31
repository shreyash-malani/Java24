import java.util.*;
public class Pattern_4
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++) //reperesent the number of rows
        {
            for(int j=1;j<=i;j++) //represent the number of columns
            {
                System.out.print(i+" "); //print star
            }
            System.out.println(); 
        }
        sc.close();
    }
}
