import mypkg.Util;
import mypkg.Account;
import java.io.*;
import java.util.HashSet;
public class ObjWriteA
{
    public static void main(String [] args) throws Exception 
    {
        FileOutputStream fos=new FileOutputStream("acc.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Account obj=null;
        HashSet <Integer> a=new HashSet();
        while (true) 
        {
            int no=Util.iInput("Account number: ");
            if(no==0)
            {
                break;
            }    
            if (a.add(no)==false)
            {
                Util.display("Record Exist");
                continue;
            }
            obj=new Account();
            obj.setData(no);
            oos.writeObject(obj);
        }
        oos.close();
        fos.close();
    }
}

