//digit sum


public class Cmd3 {
    public static void main(String[]args)
    {
        int no=args.length;
        if (no==0)
        {
             System.out.println("\nInvalid Arguments");
             return;
        }
        try
        {

            no=Integer.parseInt(args[0]);
            
        }
        catch(Exception e)
        {
            System.out.println("\nEntered invalid input");
            return;
        }
        int dig=0,tot=0;
        while(no>0)
        {
            dig=no%10;
            tot=tot+dig;
            no=no/10;
        }
        System.out.println("\nSum:"+tot);    
    }
}