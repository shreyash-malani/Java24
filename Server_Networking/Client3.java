import java.io.*;
import java.net.*;
public class Client3 
{
    public static void main(String [] args) throws Exception
    {
        Socket s=new Socket("LocalHost",8081);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Source File name: ");
        String source=br.readLine();
        dos.writeUTF(source);  //sends file name to server
        boolean result=dis.readBoolean();
        if(result==false)
        {
            System.out.println("File not Found / Invalid File Name");
        }
        else
        {
            System.out.println("Enter Destination File name");
            String destination=br.readLine();
            int val=0;
            FileOutputStream fos=new FileOutputStream(destination);
            while(true)
            {
                val=dis.read();
                if(val==-1)  //Due to end of the file
                {
                    break;
                } 
                fos.write(val);
            }
            fos.close();
        }
        dis.close();
        dos.close();
        s.close();
    }
}
