import java.util.Scanner;
class Matrix_Op
{
    int i=0,j=0,k=0;
    int num1=0,num2=0;
    int A[][]=new int[100][100];
    int B[][]=new int[100][100];
    int C[][]=new int[100][100];
    Scanner sc=new Scanner(System.in);

    void getsize()
    {
        System.out.println("Enter Rows Of A Matrix : ");
        num1=sc.nextInt();
        System.out.println("Enter Column Of A Matrix : ");
        num2=sc.nextInt();
    }

    void getmatrix()
    {
        System.out.println("Enter Matrix A : ");
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Matrix B : ");
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
    }

    void showmatrix()
    {
        System.out.println("Matrix Of A Is :");
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                System.out.print(A[i][j]+" ");
            }
        System.out.println();
        }

        System.out.println("Matrix Of B Is :");
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                System.out.print(B[i][j]+" ");
            }
        System.out.println();
        }
    }

    void addmatrix()
    {
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                C[i][j]=A[i][j] + B[i][j];
            }
        System.out.println();
        }

        System.out.println("Addition of A and B Is :");
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                System.out.print(C[i][j]+" ");
            }
        System.out.println();
        }
    }

    void submatrix()
    {
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                C[i][j]=A[i][j] - B[i][j];
            }
        System.out.println();
        }

        System.out.println("Subtraction of A and B Is :");
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                System.out.print(C[i][j]+" ");
            }
        System.out.println();
        }
    }

    void mulmatrix()
    {
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                C[i][j]=0;
                for(k=0;k<num2;k++)
                {
                    C[i][j]=(A[i][k]*B[i][k])+C[i][j];
                }
            }
        System.out.println();
        }

        System.out.println("Multiplication of A and B Is :");
        for(i=0;i<num1;i++)
        {
            for(j=0;j<num2;j++)
            {
                System.out.print(C[i][j]+" ");
            }
        System.out.println();
        }
    }
}

public class Matrix
{
    public static void main(String[] args)
    {
        Matrix_Op m1=new Matrix_Op();
        m1.getsize();
        m1.getmatrix();
        m1.showmatrix();
        m1.addmatrix();
        m1.submatrix();
        m1.mulmatrix();
    }
}