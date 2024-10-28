public class A14_CmdArg5 
{
    public static void main(String [] args)
    {
        int n=args.length;
        if(n!=1)
        {
            System.out.println(" Invalid Argument");
        }
        try
        {
            n=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Data");
            return;
        }
        StringBuffer a=new StringBuffer(args[0]);  //Syntax pls remember
        StringBuffer b=a.reverse();
        System.out.println("Reversed String: "+b);

        StringBuffer sb=new StringBuffer("Hello");
        sb.insert(5, " Java");  // Inserting " Java" at index 5
        System.out.println("Inserted: " + sb);

        StringBuffer s=new StringBuffer("Shreyash");
        s.delete(1, 6);  //it will take from 1 to n-1 here n is 6 
        System.out.println("Deleted String:"+ s);
    }
}
//StringBuffer is a class in Java used to create mutable (modifiable) sequences
//String has varius method as shown above 