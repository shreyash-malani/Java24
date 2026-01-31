import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AWT6 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int no,mrk;
	String nm;
	AWT6()
	{
		super("Student");
		l1=new Label("Roll No");
		l2=new Label("Student Name");
		l3=new Label("Marks");
		
		t1=new TextField(10);
		t2=new TextField(30);
		t3=new TextField(10);
		
		b1=new Button("OK");
		b2=new Button("Exit");
		
		b1.addActionListener(this);
		b2.addActionListener(this);

		setLayout(new GridLayout(4,2,5,5));

		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
			
		add(b1);
		add(b2);
		
		setSize(400,300);
		//setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();  // Using getSource() to determine which button was clicked
		if(b==b2)
			System.exit(0);
		else
		{
			try
			{
				no=Integer.parseInt(t1.getText());
			}
			catch(Exception e1)
			{
				t1.requestFocus();
				return;
			}
			if(no<=0)
			{
				t1.requestFocus();
				return;
			}
			nm=(t2.getText()).trim();
			if(nm.length()==0)
			{	
				t2.requestFocus();
				return;
			}
			try
			{
				mrk=Integer.parseInt(t3.getText());
			}
			catch(Exception e2)
			{
				t3.requestFocus();
				return;
			}
			if(mrk<=0 || mrk>100)
			{
				t3.requestFocus();
				return;
			}
			String str="Roll No:"+no+"\nName:"+nm+"\nMarks:"+mrk;
			JOptionPane.showMessageDialog(null,str);
			t1.requestFocus();
		}
	}
	public static void main(String [] args)
	{
		AWT6 a=new AWT6();
	}
}

			
	
	 