import java.awt.*;
import java.awt.event.*;

public class AWT33 extends Frame implements KeyListener,ActionListener
{
    TextArea ta;
    Label l1;
    Button b1,b2;
    AWT33()
    {
        super("Key Listener");
        
        ta=new TextArea();
        l1=new Label("Message");
        
        b1=new Button("Characters");
        b2=new Button("Words");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        ta.addKeyListener(this);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        l1.setBounds(50,50,200,20);
        ta.setBounds(50,80,200,200);
        
        b1.setBounds(50,290,90,20);
        b2.setBounds(160,290,90,20);

        add(l1);
        add(ta);
        add(b1);
        add(b2);

        setSize(300,360);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button) e.getSource();
        if(b==b1)
        {
            String str=ta.getText();
            l1.setText("Characters Count:"+str.length());
        }
        if(b==b2)
        {
            String str=ta.getText();
            String [] words=str.split("\\s");
            l1.setText("Word Count:"+words.length);
        }
    }
    public void keyPressed(KeyEvent e) 
    {
        l1.setText("");
    }
    
    public void keyReleased(KeyEvent e) 
    { 
        l1.setText("");
    }
    
    public void keyTyped(KeyEvent e) 
    {  
        l1.setText("");
    }
    public static void main(String []  args)
    {
        AWT33 a=new AWT33();
    }
    
}
