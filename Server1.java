import java.io.*;
import java.net.*;
public class Server1
{
    public static void main(String[] args) throws Exception 
    {
        ServerSocket ss=new ServerSocket(2021); //2021 port no
        System.out.println("Server started. Listening for incoming connections...");
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());  //reads data from the server
        DataOutputStream dos=new DataOutputStream(s.getOutputStream()); //sends data to the server
        String str=dis.readUTF(); //reads message send by client 
        System.out.println("From Client:"+str);
        str="Welcome U";
        dos.writeUTF(str); //sends message to client
        dos.close();
        dis.close();
        s.close();
    }
}