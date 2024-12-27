import java.util.Scanner;

class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length; // Length of the array
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;

        // Calculate the sum of all elements in the array
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();

        int []a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int result= missingNumber(a);
        System.out.println("The union of the arrays is:");
        System.out.println("Result" +result);
    }
}
