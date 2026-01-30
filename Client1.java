import java.io.*;
import java.net.*;
public class Client1 
{
    public static void main(String [] args) throws Exception
    {
        Socket s=new Socket("LocalHost",2021);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Hello"); //sends message to server
        String str=dis.readUTF(); //reads message send by the server
        System.out.println("From Server: "+str);
        dos.close();
        dis.close();
        s.close();
    }
}
