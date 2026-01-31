import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyPanel extends JPanel
{
    int x,y;
    MyPanel()
    {
        super();
        setBorder(BorderFactory.createLineBorder(Color.ORANGE, 10));
        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawRect(x, y, 20,20);
    }
}
class JFrm3 extends JFrame
{
    MyPanel pd;
    JFrm3()
    {
        super("Frame");
        pd=new MyPanel();
        add(pd);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        JFrm3 a=new JFrm3();
    } 
}