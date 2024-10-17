import java.awt.event.*;
import javax.swing.*;
public class JFrm23 extends JFrame implements ActionListener 
{
    JLabel l1;
    JPopupMenu pm;
    JMenuItem cut,copy,paste;
    JFrame frm;
    JFrm23()
    {
        super("PopMenu");
        frm=this;
        l1=new JLabel();
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(400,100);
        
        pm=new JPopupMenu("Edit");
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e)
            {
                pm.show(frm, e.getX() ,e.getY());
            }
        });
        setLayout(null);
        add(l1);
        add(pm);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JMenuItem a=(JMenuItem)e.getSource();
        if(a==cut)
            l1.setText("Cut MenuItem Clicked");
        if(a==copy)
            l1.setText("Copy MenuItem Clicked");
        if(a==paste)
            l1.setText("Paste MenuItem Clicked");
    }
    public static void main(String [] args)
    {
        JFrm23 a=new JFrm23();
    }

}
