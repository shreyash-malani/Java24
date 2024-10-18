import javax.swing.*;
public class JFrm22 extends JFrame
{
    JMenu  menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    JMenuBar mb;

    JFrm22() 
    {
        super("Separator in Menu");
        mb=new JMenuBar();
        menu=new JMenu("Menu");
        i1=new JMenuItem("item1");
        i2=new JMenuItem("item2");
        i3=new JMenuItem("item3");
        i4=new JMenuItem("item4");
        i5=new JMenuItem("item5");
        menu.add(i1);
        menu.add(i2);
        menu.addSeparator();
        menu.add(i3);
        menu.add(i4);
        menu.addSeparator();
        menu.add(i5);
        mb.add(menu);

        setJMenuBar(mb);

        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }
    public static void main(String[] args) 
    {
        new JFrm22();
    }
    
}

