//DIALOGUE BOX IS GENERATED
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Matrix2
{
    public static void main(String[]args)
    {
        int[][]x=null;//holds refernce to one-D array
        x=new int [3][];
        for(int i=0;i<3;i++)
        {
            x[i]=new int[3];    
        }   
        int i=0,j=0;
        /*try
        {
            br=new BufferedReader(new InputStreamReader(System.in));

        }catch(Exception e){}*/
        System.out.println("MATRIX DATA:");
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                //System.out.println("x["+i+"]["+j+"]:");
                try
                {
                    x[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"x["+i+"]["+j+"]"));
                }
                catch(Exception e)
                {
                    continue;
                }
                j++;

            }
            i++;
        }
        String str="MATRIX\n"+Arrays.toString(x[0])+"\n"+Arrays.toString(x[1])+"\n"+Arrays.toString(x[2]);
        JOptionPane.showMessageDialog(null,str);
    }   

}