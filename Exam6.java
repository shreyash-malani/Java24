import java.util.Scanner;

class Arithmetic 
{
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}

class Statistics {
    public static double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) 
        {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double variance(double[] numbers) 
    {
        double mean = mean(numbers);
        double variance = 0;
        for (double num : numbers) 
        {
            variance += Math.pow(num - mean, 2);
        }
        return variance / numbers.length;
    }

    public static double standardDeviation(double[] numbers) {
        return Math.sqrt(variance(numbers));
    }
}

class Trigonometry {
    public static double sine(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    public static double cosine(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }

    public static double tangent(double angleInDegrees) {
        return Math.tan(Math.toRadians(angleInDegrees));
    }
}

public class Exam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arithmetic Operations
        System.out.println("Arithmetic Operations:");
        System.out.print("Enter two integers for addition: ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        System.out.println("Addition: " + Arithmetic.add(a1, b1));

        System.out.print("Enter two integers for subtraction: ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        System.out.println("Subtraction: " + Arithmetic.subtract(a2, b2));

        System.out.print("Enter two integers for multiplication: ");
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();
        System.out.println("Multiplication: " + Arithmetic.multiply(a3, b3));

        System.out.print("Enter two integers for division: ");
        int a4 = scanner.nextInt();
        int b4 = scanner.nextInt();
        try {
            System.out.println("Division: " + Arithmetic.divide(a4, b4));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Statistical Operations
        System.out.println("\nStatistical Operations:");
        System.out.print("Enter the number of data points: ");
        int n = scanner.nextInt();
        double[] data = new double[n];
        System.out.println("Enter the data points:");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextDouble();
        }
        System.out.println("Mean: " + Statistics.mean(data));
        System.out.println("Variance: " + Statistics.variance(data));
        System.out.println("Standard Deviation: " + Statistics.standardDeviation(data));

        // Trigonometric Operations
        System.out.println("\nTrigonometric Operations:");
        System.out.print("Enter an angle (in degrees) for sine calculation: ");
        double angle1 = scanner.nextDouble();
        System.out.println("Sine(" + angle1 + "): " + Trigonometry.sine(angle1));

        System.out.print("Enter an angle (in degrees) for cosine calculation: ");
        double angle2 = scanner.nextDouble();
        System.out.println("Cosine(" + angle2 + "): " + Trigonometry.cosine(angle2));

        System.out.print("Enter an angle (in degrees) for tangent calculation: ");
        double angle3 = scanner.nextDouble();
        System.out.println("Tangent(" + angle3 + "): " + Trigonometry.tangent(angle3));

        scanner.close();
    }
}
