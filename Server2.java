import java.io.*;
import java.net.*;
public class Server2 
{
    public static void main(String [] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(5152);
        System.out.println("----------Server Started--------");
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String cnm=dis.readUTF(); //reads the client name 
        String str="Welcome"+" "+cnm;
        dos.writeUTF(str);  //sends the welcome message to the client
        while(true)
        {
            str=dis.readUTF(); //reads message sent by client 
            System.out.println("From"+cnm+":"+str);
            if(str.equals("bye"))
                break;
            System.out.println("Message to"+cnm);
            str=br.readLine();
            dos.writeUTF(str);
            if(str.equals("bye"))
                break;
        }
        dos.close();
        dis.close();
        s.close();
    }
}
