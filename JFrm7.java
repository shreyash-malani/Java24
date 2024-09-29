import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class JFrm7 extends JFrame 
{
    JList list;
    JLabel l1;
    JScrollPane jsp;
    String[] city = {
        "Satara", "Sangli", "Kolhapur", "Barshi", "Beed", "Karad", "Ratnagiri", "Pandharpur"};

    JFrm7() 
    {
        super("Frame");
        

        l1 = new JLabel("Choose City");
        list = new JList(city);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Add ListSelectionListener
        list.addListSelectionListener(new ListSelectionListener() 
        {
            public void valueChanged(ListSelectionEvent e) 
            {
                int choice = list.getSelectedIndex();
                if (choice == -1) 
                {
                    l1.setText("Choose City");
                }
                else
                {
                    l1.setText("Current Selection: "+city[choice]);
                }
            }
        });
        jsp = new JScrollPane(list);
        jsp.setPreferredSize(new Dimension(200,100));
        setLayout(new FlowLayout());
        add(jsp);
        add(l1);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        JFrm7 a=new JFrm7();
    }
}
