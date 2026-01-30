public class Cmd2     //refered to c book page no 57 
{
    public static void main(String [] args)
    {
        int dig,tot=0; 
        int no=(int)(Math.random() * 100);
        System.out.println("Random Value: " + no);
        while(no>0)
        {
            dig=no%10;
            tot+=dig;
            no/=10;
        }
        System.out.print(tot+" "+"Digit sum");
    }
}
