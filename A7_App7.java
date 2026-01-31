<<<<<<< HEAD
public class A7_App7 
{
    public static void main(String [] args)
    {
        int no=10,i=2;
        String str="Prime No:";
        while(no<=100)
        {
            for(i=2;i<no;i++)
            {
                if(no%i==0)
                    break;   
            }
            if(i==no)
                    str=str+" "+no;
            no++;
        }
        System.out.println(str);

    }

}
=======
public class A7_App7 
{
    public static void main(String [] args)
    {
        int no=10,i=2;
        String str="Prime No:";
        while(no<=100)
        {
            for(i=2;i<no;i++)
            {
                if(no%i==0)
                    break;   
            }
            if(i==no)
                    str=str+" "+no;
            no++;
        }
        System.out.println(str);

    }

}
>>>>>>> e620835b779dad45fd861b3fa8752e79e9b10f1a
