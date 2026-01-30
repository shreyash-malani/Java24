import java.rmi.*;

class RMIClient1 
{
    public static void main(String[] args) throws Exception 
    {
        String url = "rmi://localhost/w1";
        inter1 ref = (inter1) Naming.lookup(url);
        System.out.println("No. " + ref.getNumber(1000));
    }
}
