public class A9_App9 
{
    public static void main(String [] args)
    {
        String str="Table\n";
        int i=1,j=2;
        while(i<=10)
        {
            j=2;
            do
            {
                str=str+" "+(i*j);
                j++;
            }
            while(j<=10);
            str=str+"\n";
            i++;
        }
        System.out.println(str);
    }
}
