import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server6imp extends Thread
{
    ServerSocket ss;
    LinkedList<DataOutputStream>cls;
    String msg;
    Socket s;
    DataOutputStream dos;
    BufferedReader br; 
    Server6imp()
    {
        super();
        try
        {
            
            ss = new ServerSocket(5051);
            cls=new LinkedList<DataOutputStream>();
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e ){}
        while(true)
        {
            try
            {
                
                s=ss.accept();
                cls.add(new DataOutputStream(s.getOutputStream()));
            }
            catch(Exception e){}
            if(cls.size()==1)
            start();
        }
    }
    public void run()
    {
        int i=0,k;
        while(true)
        {
            System.out.println("Enter Message");
            try
            {
                msg=br.readLine();
            }
            catch(Exception e){}
            i=0;k=cls.size();
            while(i<k)
            {
                try
                {
                    dos=cls.get(i);
                    dos.writeUTF(msg+"\n");
                    i++;
                }
                catch(Exception e){}
                
            }
        }
    }
    public static void main(String [] args) throws Exception
    {
        Server6imp a=new Server6imp();
    }
}
