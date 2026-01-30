package bank;
import java.io.*;
import mypkg.Util;
public class DAccount implements Serializable
{
	int no;
	String nm;
	int amt;
	boolean state;
	public DAccount()
	{
		no=amt=0;
		nm=new String();
		state=true;
	}
	public String toString()
	{
		String s="\nAccount:\n"+no+"\nName:"+nm+"\nOpenening Balance:"+amt+"\nState:"+state;
		return s;
	}
	public void display()
	{
		Util.display(toString());
	}
	public void setData(int n)
	{
		no=n;
		nm=Util.sInput("Name:");
		amt=Util.iInput("Openeing Balance:");
		state=true;
	}
	public int getNo(){return no;}
	public int getAmt(){return amt;}
	public boolean state(){return state;}
	public void delete(){state=false;}
}