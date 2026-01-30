import java.sql.*;
import mypkg.Util;

public class Inserttrade1 
{
    public static void main(String[] args) throws Exception
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data124", "root", "");
        int id = 0;
        String nm = "";
        
        PreparedStatement ps = con.prepareStatement("INSERT INTO trade values(?,?)");
        PreparedStatement ps1 = con.prepareStatement("Select * from trade where tid=?");
        
        while (true)
        {
            id = Util.iInput("Trade ID:");
            if (id == 0)
            {
                break;
            }
            
            ps1.setInt(1, id);
            ResultSet rs = ps1.executeQuery();
            
            if (rs.next())
            {
                Util.display("Record Exists");
                continue;
            }
            
            nm = Util.sInput("Enter Trade Name:");
            ps.setInt(1, id);
            ps.setString(2, nm);
            ps.executeUpdate();
            
            System.out.println("Row Inserted.");
        }
        
        con.close();
    }
}

// cd .\Database\ use as a class path
// javac -cp ".;driver.jar;D:\java24" Inserttrade.java
// java -cp ".;driver.jar;D:\java24" Inserttrade  It works properly using these in the terminal 
