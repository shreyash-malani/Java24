<<<<<<< HEAD
public class A17_CmdArg8 
{
    public static void main(String [] args)
    {
        int n=args.length,i=0,pc=0,nc=0,zc=0,oth=0,val=0;  //args.lenth is a property of array and size() is method of link list 
        if(n==0)
        {
            System.out.println("Invalid Argument");
            return;
        }
        for(i=0;i<n;i++)
        {
            try
            {
                val=Integer.parseInt(args[i]);
                if(val==0)
                    zc++;
                else
                {
                    if(val>0)
                        pc++;
                    else
                        nc++;
                }
            }
            catch(Exception e)
            {
                oth++;
            }
        }
        System.out.println("Data \n1.+ve:" +pc +"\n2.-ve:"+ nc +"\n3.Zero count:"+ zc +"\n4.Other:" + oth);
    } 
}
=======
public class A17_CmdArg8 
{
    public static void main(String [] args)
    {
        int n=args.length,i=0,pc=0,nc=0,zc=0,oth=0,val=0;  //args.lenth is a property of array and size() is method of link list 
        if(n==0)
        {
            System.out.println("Invalid Argument");
            return;
        }
        for(i=0;i<n;i++)
        {
            try
            {
                val=Integer.parseInt(args[i]);
                if(val==0)
                    zc++;
                else
                {
                    if(val>0)
                        pc++;
                    else
                        nc++;
                }
            }
            catch(Exception e)
            {
                oth++;
            }
        }
        System.out.println("Data \n1.+ve:" +pc +"\n2.-ve:"+ nc +"\n3.Zero count:"+ zc +"\n4.Other:" + oth);
    } 
}
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
