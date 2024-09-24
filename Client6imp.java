import java.io.*;
import java.util.*;
import java.net.*;
public class Client6imp
{
    DataInputStream dis;
    String msg;
    Socket s;
    
    Client6imp() throws Exception 
    {
        s=new Socket("localhost",5051);
        dis=new DataInputStream(s.getInputStream());
        while(true)
        {
            msg=dis.readUTF();
            System.out.println("From Server: "+msg);   
        }
    }
    public static void main(String [] args) throws Exception 
    {
        Client6imp c=new Client6imp();
    }
}
