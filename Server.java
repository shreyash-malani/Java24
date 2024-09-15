import java.io.*;
import java.net.*;
public class Server
{
    public static void main(String[] args) throws Exception 
    {
        ServerSocket ss=new ServerSocket(2021); //2021 port no
        System.out.println("Server started. Listening for incoming connections...");
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        String str=dis.readUTF(); //reads message send by client 
        System.out.println("From Client:"+str);
        str="Welcome U";
        dos.writeUTF(str); //sends message to client
        dos.close();
        dis.close();
        s.close();
    }
}