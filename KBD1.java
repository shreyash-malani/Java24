// import java.util.*;

// public class KBD1 
// {
//     public static void main(String [] args)
//     {
//         Scanner s = new Scanner(System.in); //'in' is a field name 
//         System.out.println("String:");
//         String str=s.next();  //waits for input  s.next is a method in Scanner class 
//         System.out.println(str); 
//     }   
// }

//Below code will input number 
import java.util.*;

public class KBD1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object to read input from System.in
        System.out.println("Enter an integer:");
        int num = s.nextInt(); // Reads the next integer from the input
        System.out.println("You entered: " + num); // Prints the entered integer
    }
}

