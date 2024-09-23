import java.io.*;
import java.net.*;
public class Client6
{
    Socket t;
    DataInputStream dis;
    Client6()
    {
        try
        {
            t=new Socket("localhost",3030);
            dis=new DataInputStream(t.getInputStream());
        }catch(Exception e){}
        String str=" ";
        while(true)
        {
            try
            {
                str=dis.readUTF();
                System.out.println(str);
                if(str.equals("bye"))
                {
                    break;
                }
            }catch(Exception e){}
        }
    }
    public static void main(String[] args) 
    {
        Client6 c=new Client6();
    }
}