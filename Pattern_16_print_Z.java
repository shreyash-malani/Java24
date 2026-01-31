public class Pattern_16_print_Z 
{
    public static void main(String[] args) 
    {
        int n = 5; // Size of the pattern (rows)

        for (int i = 0; i < n; i++) {          // i = row index
            for (int j = 0; j < n; j++) 
            {      // j = column index
                if (i == 0 || i == n - 1 || j == n - i - 1) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}

//i==0 is for first row 
//i==n-1 is for last row
//j==n-i-1 is for diagonal line from top right to bottom left
// n is the size of the pattern