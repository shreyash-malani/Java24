import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PaintDemo extends JPanel
{
    PaintDemo()
    {
        super();    
        setBorder(BorderFactory.createLineBorder(Color.RED,10));
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int x,y,x2,y2;
        int h=getHeight();
        int w=getWidth();
        for(int i=0;i<10;i++)
        {
            x=(int)(Math.random()*w);
            y=(int)(Math.random()*h);
            x2=(int)(Math.random()*w);
            y2=(int)(Math.random()*h);
            g.drawLine(x, y, x2, y2);
        }
    }
}
class JFrm2 extends JFrame 
{
    PaintDemo pd;
    JFrm2() 
    {
        super("Frame");
        pd = new PaintDemo();
        add(pd);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        JFrm2 a = new JFrm2();
    }
}
