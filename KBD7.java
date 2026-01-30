public class KBD7 
{
    public static void main(String [] args)
    {
        int i=1,val=0,uc=0,lc=0,dc=0,oc=0;
        while(i<=10)
        {
            System.out.println("Type Character:");
            try
            {
                val=System.in.read(); //The method returns the ASCII value of the character read and stores it in the variable val.
                System.in.skip(5);  //For example, if the user types the character A, val will be set to 65, the ASCII value of A. System.in.skip(5);
            }
            catch(Exception e){}
            if(val>=65 && val<=90)
                    uc++;
                else
                {
                    if(val>=97 &&val<=122)
                        lc++;
                    else
                    {
                        if(val>=48 && val<=57)
                            dc++;
                        else    
                            oc++;
                    }
                }
            i++;    
        }   
        System.out.println("Upper:"+uc+"\nLower:"+lc+"\nDigit:"+dc+"\nOther:"+oc);

    }    
}
