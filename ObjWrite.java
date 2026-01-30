import mypkg.Util;
import mypkg.Account;
import java.io.*;
public class ObjWrite 
{
    public static void main(String [] args) throws Exception 
    {
        FileOutputStream fos=new FileOutputStream("acc.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Account obj=null;
        while (true) 
        {
            int no=Util.iInput("Account number: ");
            if(no==0)
            {
                break;
            }    
            obj=new Account();
            obj.setData(no);
            oos.writeObject(obj);
        }
        oos.close();
        fos.close();
    }
}

