import java.io.*;
public class Static1 
{
    static int no;
    static BufferedReader br;
    static
    {
        try 
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e){}
    }
    static void input()
    {
        System.out.println("Enter No:");
        try
        {
            no=Integer.parseInt(br.readLine());
        }
        catch(Exception e){}
    }
    static void display()
    {
        System.out.println("No:"+no);
    }
    public static void main(String [] args)
    {
        input();
        display();
    }
}
