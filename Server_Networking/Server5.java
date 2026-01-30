import java.io.*;
import java.net.*;
public class Server5  
{
    public static void main(String [] args) throws Exception 
    {
        ServerSocket ss=new ServerSocket(3030);
        while(true)
        {
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream()); 
            String cnm=dis.readUTF();  //reads name from the client 
            thread5 a=new thread5(s,cnm);
        }
    }
}
class thread5 extends Thread
{
    Socket s;
    String str;
    String cnm;
    DataOutputStream dos;
    DataInputStream dis;
    BufferedReader br;
    thread5(Socket s,String cnm) throws Exception 
    {
        super(cnm);
        this.cnm=cnm;
        this.s=s;
        dos=new DataOutputStream(s.getOutputStream());
        dis =new DataInputStream(s.getInputStream());
        br=new BufferedReader(new InputStreamReader(System.in));
        start();
    }
    public void run()
    {
        try
        {
            doChat();
        }
        catch(Exception e){}
        
    }
    synchronized void doChat() throws Exception
    {
        while(true)
        {
            str=dis.readUTF(); //reads message 
            System.out.println("From " + cnm + " : " + str);
            System.out.println("Message to" + cnm + ":");
            str=br.readLine();
            dos.writeUTF(str); //sends message
        }
        
    }
}