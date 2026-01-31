import java.io.*;
import java.util.*;
import javax.swing.*;

public class MatrixP1 
{
    public static void main(String [] args)
    {
        int [][] a=new int [3][3];
        int [][] b=new int [3][3];
        int [][] c=new int [3][3];
        int i=0;int j=0;
        System.out.println("Matrix data for a :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                try
                {
                        a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"x["+i+"]["+j+"]"));
                }
                catch(Exception e){continue;}
            }
        }
        String str="Matrix: a \n";
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                str=str+a[i][j]+" ";
            }
            str+="\n";
        }
        JOptionPane.showMessageDialog(null, str);

        System.out.println("Matrix data for b :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                try
                {
                        b[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"x["+i+"]["+j+"]"));
                }
                catch(Exception e){continue;}
            }
        }
        String str2="Matrix b:\n";
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                str2=str2+b[i][j]+" ";
            }
            str2+="\n";
        }
        JOptionPane.showMessageDialog(null, str2);
    }  
}//it displays like this 
// j = 0: str becomes "Matrix:\n1 2 3 \n4 ".
// j = 1: str becomes "Matrix:\n1 2 3 \n4 5 ".
// j = 2: str becomes "Matrix:\n1 2 3 \n4 5 6 ".