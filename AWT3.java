import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AWT3  extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	String id;
	String pw;
	AWT3()
	{
		super("Login");
		l1=new Label("ID");
		l2=new Label("Password");
		
		t1=new TextField(10);
		t2=new TextField(10);
		t2.setEchoChar('*');
		
		pw="Abc#1999";
		id="Operator";
		
		b1=new Button("OK");
		b2=new Button("Exit");
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new GridLayout(3,2,5,5));
		
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		
		setSize(400,300);
		//setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b2)
			System.exit(0);
		else
		{
			String c=t1.getText();
			String d=t2.getText();
			
			if(c.equals(id)==false)
			{
				t1.requestFocus();
				return;
			}
			if(d.equals(pw)==false)
			{
				t2.requestFocus();
				return;
			}
			JOptionPane.showMessageDialog(null,"Login SuccessFul");
		}
	}
	public static void main(String [] args)
	{
		AWT3 a=new AWT3();
	}
}