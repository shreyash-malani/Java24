import java.util.*;
public class keyboard2 
{
    public static void main(String [] args)
    {
        int lc=0,uc=0,i=1;
        int val=0;
        for(i=0;i<=10;i++)
        {
            System.out.println("Type a Character: ");
            try
            {
                val=System.in.read();
                System.in.skip(5);
            }
            catch (Exception e){}
        
            if(val>65 && val<90)
                uc++;
            else
            {
                if(val>97 && val<122)
                    lc++;
            } 
        } 
        System.out.println("Upper:"+uc+"\nLower:"+lc);  
    } 
}
