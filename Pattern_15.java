import java.util.*;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter the number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) // rows
        {
            for (int j = 1; j <= n - i + 1; j++) // columns
            {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

//below is the link of chatgpt where there is a explanation of the code
//https://chatgpt.com/share/684d74b2-61b0-8003-a60c-8fc8aff8ca83