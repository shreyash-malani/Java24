public class A13_CmdArg4
{
    public static void main(String [] args)
    {
        int no=0,rev=0,n=args.length;
        if(n!=1)
        {
            System.out.println(" invalid Argument");
        }
        try{
            no=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Data");
            return;
        }
        while(no>0)
        {
            rev=rev*10+(no%10);
            no/=10;
        }
        System.out.println(rev);    
    }
}
