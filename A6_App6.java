public class A6_App6
{
    public static void main(String [] args)
    {
        int i=1;
        int no=(int)(Math.random()*100);
        String str="Table\n";
        while (i<=10) 
        {
            str=str+" "+(no*i);
            i++;    
        }
        System.out.println(str);
    }
}