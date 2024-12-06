import java.util.*;
public class Codechef2 
{
    public static int sweet(int N,int k,int [] s)
    {
        int cnt=0;
        int calorie=0;
        for(int i=0;i<N;i++)
        {
            if(calorie+s[i]<=k)
            {
                calorie=calorie+s[i];
                cnt++;
            }   
            else
                break;
        }
        return cnt;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int [] s=new int [N];
        for(int i=0;i<N;i++)
        {
            s[i]=sc.nextInt();
        }
        int result=sweet(N,K,s);
        System.out.println(result); 
    }
}
