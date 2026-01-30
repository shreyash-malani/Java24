import java.io.*;
import mypkg.Account;
import mypkg.Util;
public class ObjRead 
{
    public static void main(String [] args) 
    {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try
        {
            fis=new FileInputStream("acc.dat");
            ois=new ObjectInputStream(fis);
        }
        catch (Exception e){}
        Account obj=null;
        while(true)
        {
            try
            {
                obj=(Account)ois.readObject();
            }
            catch(Exception e){break;}
            obj.display();
        }
        try
        {
            ois.close();
            fis.close();
        }
        catch(Exception e){}
    }
}
