public class A10_CmdArg1 
{
    public static void main(String [] args )
    {
        int i=0,n=args.length;
        if(n==0)
        {
            System.out.println("Invalid argument");
            return ;
        }
        while (i<n) 
        {
            System.out.println(args[i]);
            i++;    
        }
    }
}
