import java.util.*; // Import statement correctly placed

public class p2 {
    public static int[] passedBy(int a, int b) {
        // Add 1 to the value passed by value (a)
        int passByValue = a + 1;

        // Add 2 to the value passed by reference (b)
        int passByReference = b + 2;

        // Return the results as an array
        return new int[]{passByValue, passByReference};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Call the function
        int[] result = passedBy(a, b);

        // Print the output
        System.out.println(result[0] + " " + result[1]);

        scanner.close();
    }
}
