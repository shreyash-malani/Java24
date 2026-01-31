import java.util.*;
public class Pattern_11 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the number: "); 
        int n=sc.nextInt();
        int num;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                num=1;
            }
            else
            {
                num=0;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num=1-num;   
            }
            System.out.println();
        }
    }    
}
