import java.util.Scanner;

public class Exam2
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        // Input two matrices
        System.out.println("Enter elements of the first matrix:");
        int[][] matrix1 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");
        int[][] matrix2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Matrix Addition
        System.out.println("Matrix Addition:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
            }
            System.out.println();
        }

        // Matrix Subtraction
        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((matrix1[i][j] - matrix2[i][j]) + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication (Only valid if rows == cols)
        if (rows == cols) {
            System.out.println("Matrix Multiplication:");
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } 
        else 
        {
            System.out.println("Matrix multiplication is not possible for non-square matrices.");
        }

        scanner.close();
    }
}