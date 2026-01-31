<<<<<<< HEAD
public class A12_CmdArg3 
{
    public static void main(String [] args)
    {
        int no=0,n=args.length,i=1;
        if(n!=1)
        {
            System.out.println(" Invalid Argument");
        }
        try
        {
            no=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Data");
            return;
        }
        String str="Table\n";
        for(i=1;i<=10;i++)
            str=str+" "+(no*i);
        System.out.println(str);
    }
}
=======
public class A12_CmdArg3 
{
    public static void main(String [] args)
    {
        int no=0,n=args.length,i=1;
        if(n!=1)
        {
            System.out.println(" Invalid Argument");
        }
        try
        {
            no=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Data");
            return;
        }
        String str="Table\n";
        for(i=1;i<=10;i++)
            str=str+" "+(no*i);
        System.out.println(str);
    }
}
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
