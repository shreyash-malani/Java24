public class Cmd1   //refered to c book pg no 71
{
    public static void main(String [] args)
    {
        int i=2,cnt=0;
        int no = (int)(Math.random() * 100);
        System.out.println("Random Value: " + no);
        while (i<=(no/2))
        {
            if (no%i==0)
                cnt++;
            i++;
        }
        if (cnt==0)
            System.out.println(no+" "+" is a Prime number");
        else
            System.out.println(no+" "+"is Not a Prime number");
    }
}

