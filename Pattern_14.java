import java.util.*;
public class Pattern_14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int rows = sc.nextInt(); // You can change this for more rows

        for (int i = 1; i <= rows; i++) 
        {
            for (char ch = 'A'; ch < 'A' + i; ch++) 
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

//below is the link of chatgpt where there is a explanation of the code
//https://chatgpt.com/share/684d74b2-61b0-8003-a60c-8fc8aff8ca83
