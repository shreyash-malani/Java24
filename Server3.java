
// Here we have shared the file name n1 that is a jpeg image 


import java.io.*;
import java.net.*;

public class Server3 
{
    public static void main(String [] args) throws Exception 
    {
        ServerSocket ss=new ServerSocket(8081);
        System.out.println("---------------Server Started------------------");
        Socket s=ss.accept();
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String source =dis.readUTF(); //reads source file name send by client 
        boolean result=(new File(source)).exists();
        dos.writeBoolean(result); //sends true if file found otherwise false 
        if(result==false)
        {
            dos.close();
            dis.close();
            s.close();
            return;
        }
        FileInputStream fis=new FileInputStream(source);
        int val=(byte)0;
        while(true)
        {
            val=fis.read();
            if(val==-1)
                break;
            dos.write(val);
        }
        fis.close();
        dis.close();
        dos.close();
        s.close();
    }
}
