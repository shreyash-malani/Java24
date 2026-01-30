import java.io.*;
import java.net.*;
public class Client5 extends Thread
{
    DataOutputStream dos;
    DataInputStream dis;
    BufferedReader br;
    String cnm,str;
    Socket s;
    Client5(String cnm) throws Exception
    {
        super(cnm);
        this.cnm=cnm;
        br=new BufferedReader(new InputStreamReader(System.in));
        s=new Socket("localhost",3030);
        dis=new DataInputStream(s.getInputStream());
        dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF(cnm); //sends client name to server
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
    synchronized void doChat()  throws Exception  
    {
        while(true)
        {
            System.out.println("Message to Server:");
            str=br.readLine();
            dos.writeUTF(str);
            if(str.equals("bye"))
                break;
            System.out.println("From Server:"+dis.readUTF());
        }
    }
    public static void main(String [] args)
    {
        if(args.length!=1)
            return;
        try
        {
            Client5 a=new Client5(args[0]);
        }
        catch(Exception e){}
        
    }
}
