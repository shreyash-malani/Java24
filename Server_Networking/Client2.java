import java.io.*;
import java.net.*;
public class Client2 
{
    public static void main(String [] args) throws Exception 
    {
        if(args.length!=1)
        {
            System.out.println("Invalid Arguments");
            return;
        }
        Socket s=new Socket("LocalHost",5152);
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        dos.writeUTF(args[0]); //sends client name to the server
        String str=dis.readUTF(); //reads respond by server
        System.out.println("From Server "+str);
        while(true)
        {
            System.out.println("---------------Message to server----------");
            str=br.readLine();
            dos.writeUTF(str); //sends message to server
            if(str.equals("bye"))
                break;
            str=dis.readUTF(); //reads message send by server
            System.out.println("From Srever "+str);
            if(str.equals("bye"))
                break;
        }
        s.close();
        dis.close();
        dos.close();
    }   
}
/*
 * br.readLine() captures "Hi Server!" and assigns it to str.
    dos.writeUTF(str); sends "Hi Server!" to the server.    
    Explanation for buffered reader 
    
 */ 