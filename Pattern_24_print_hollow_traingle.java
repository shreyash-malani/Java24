// import java.util.*;

// public class Pattern_24_print_hollow_traingle 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Pls enter the number: ");
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++) 
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i==j||i==n-1||j==0) 
//                 {
//                     System.out.print("*");
//                 } 
//                 else 
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }   
//     }
    
// }
import java.util.*;

public class Pattern_24_print_hollow_traingle 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {   // ✅ Changed i from 0 to 1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");   // ✅ Leading spaces for right alignment
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");  // ✅ Print stars at borders or last row
                } else {
                    System.out.print(" ");  // ✅ Inner hollow space
                }
            }
            System.out.println();
        }
    }
}
//IMP codes pls checkout ones again 



