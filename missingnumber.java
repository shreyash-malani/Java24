import java.util.Scanner;

class missingnumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length; 
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;

       
        for (int num : nums) 
        {
            actualSum += num;
        }

        
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
        System.out.println("Result: " +result);
    }
}

// class missingnumber {
//     public static int missingNumber(int[] nums) {
//         int n = nums.length; // Length of the array
//         int maxElement = n + 1; // The range is from 1 to n+1
//         int expectedSum = maxElement * (maxElement + 1) / 2; // Sum of numbers from 1 to n+1
//         int actualSum = 0;

//         // Calculate the sum of all elements in the array
//         for (int num : nums) {
//             actualSum += num;
//         }

//         // The missing number is the difference between the expected and actual sums
//         return expectedSum - actualSum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int n = sc.nextInt();

//         int[] a = new int[n];
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int result = missingNumber(a);
//         System.out.println("Result: " + result);
//     }
// }

