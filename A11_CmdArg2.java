<<<<<<< HEAD
public class A11_CmdArg2
{
    public static void main(String [] args)
    {
        int n=args.length;
        if(n!=1)
        {
            System.out.println("Invalid Argument");
            return;
        }
        try
        {
            n=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
            return;
        }
        System.out.println("No:"+ n);
    }   
}
=======
public class A11_CmdArg2
{
    public static void main(String [] args)
    {
        int n=args.length;
        if(n!=1)
        {
            System.out.println("Invalid Argument");
            return;
        }
        try
        {
            n=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
            return;
        }
        System.out.println("No:"+ n);
    }   
}
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
