import java.sql.*;
import mypkg.Util;
public class DisplayTrade 
{
    public static void main(String [] args) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data24", "root","");
        PreparedStatement ps=con.prepareStatement("Select * from trade");
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String s="ID:"+rs.getInt(1)+"\nName:"+rs.getString(2);
            Util.display(s);
        }
    }
}
