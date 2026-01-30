import javax.swing.*;
import java.util.*;
public class Matrix4 
{
    static int [][]x;
    static int [][]y;
    static int [][]z;
    static
    {
        x=new int[3][];
        y=new int[3][];
        z=new int[3][];
        for(int i=0;i<3;i++)
        {
            x[i]=new int[3];
            y[i]=new int[3];
            z[i]=new int[3];
        }
    }
    static String toString(int [][]a)
    {
        String b="Matrix\n";
        for(int i=0;i<3;i++)
            b=b+Arrays.toString(a[i])+"\n";
        return b;
    }
    static void display (String s)
    {
        JOptionPane.showMessageDialog(null, s);
    }
    static void input(int [][]a)
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while (j<3) 
            {
                try
                {
                    a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
                }
                catch(Exception e){a[i][j]=0;}
                j++;    
            }
            i++;
        }
    }
    static void add()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                z[i][j]=x[i][j]+y[i][j];
                j++;
            }
            i++;   
        }
    }
    static void sub()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                z[i][j]=x[i][j]-y[i][j];
                j++;
            }
            i++;   
        }
    }
    static void mul()
    {
        int i=0,j=0,k=0;
        while(i<3)
        {
            for(j=0;j<3;j++)
            {
                x[i][j]=0;
                for(k=0;k<3;k++)
                    z[i][j]+=(x[i][k]*y[k][j]);
            }
            i++;
        }
    }
    static void menu()
    {
        String []option = new String []{"Input X","Input Y","Output X","Output Y","Add","Sub","Mul","Result","Exit"};
        while(true)
        {
            int opt =JOptionPane.showOptionDialog(null, "choose one", "Matrix", JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE ,null,option,10);
            if(opt==8)
                break;
            switch(opt)
            {
                case 0:
                    input(x);break;
                case 1:    
                    input(y);break;
                case 2:
                    display(toString(x));
                case 3:
                    display(toString(y));
                case 4:
                    add();break;
                case 5:
                    sub();break;
                case 6:
                    mul();break;
                case 7:
                    display(toString(z));

            }
        }
    }
    public static void main(String [] args)
    {
        menu();
    }
}
