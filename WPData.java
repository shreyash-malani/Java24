import java.io.*;
import mypkg.Util;

public class WPData 
{
    public static void main(String [] args) throws Exception 
    {
        FileOutputStream fos=new FileOutputStream("stu.dat");
        DataOutputStream dos =new DataOutputStream(fos);
        int no=0;
        String nm="";
        double mrk=0.0;
        while(true)
        {
            no=Util.iInput("Roll No: ");
            if(no==0)
            {
                break;
            }
            nm=Util.sInput("Name: ");
            mrk=Util.dInput("Marks: ");
            dos.writeInt(no);
            dos.writeUTF(nm);
            dos.writeDouble(mrk);
        }
        dos.close();
        fos.close();
    }   
}
