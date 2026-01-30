import java.util.*;

public class KBD2 
{
    public static void main(String [] args )
    {
        Scanner s=new Scanner (System.in); //'in' is a field name
        String [] a=null; //a is reference variable ,to an array of type string 
        a=new String[5]; //Array creation to hold references to class type String
        int i=0;
        while(i<a.length)
        {
            System.out.println("City Name"+(i+1)+":");
            a[i]=s.next();  //it is used to input data or waits for input
            i++;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }    
}

//The declaration String a[] or String[] a denotes that a is an array of strings. 
//Each element in the array 'a' will be a string. So, a is an array, and the elements it contains are strings.

// import java.util.*;

// public class IntegerArrayInput {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] numbers = new int[5]; // Array to hold integers
//         int i = 0;

//         while (i < numbers.length) {
//             System.out.print("Enter number " + (i + 1) + ": ");
//             numbers[i] = scanner.nextInt(); // Read integer input
//             i++;
//         }

//         System.out.println("Numbers entered:");
//         for (int j = 0; j < numbers.length; j++) {
//             System.out.println(numbers[j]);
//         }
//     }
// }
// these code will tell you that you have to enter the integer value in the array for understanding the concept we have used the above code