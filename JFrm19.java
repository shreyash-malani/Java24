import javax.swing.*;
import javax.swing.event.*;
public class JFrm19 extends JFrame implements  ChangeListener
{
    JLabel l1;
    SpinnerModel val;
    JSpinner spinner;

    JFrm19() 
    {
        super("Spinner");
        l1=new JLabel();
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(250,100);
        val=new SpinnerNumberModel(5,0,20,1);
        spinner=new JSpinner(val);
        spinner.setBounds(100,100,50,50);
        setLayout(null);
        add(spinner);
        add(l1);
        setSize(300,300);
        spinner.addChangeListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void stateChanged(ChangeEvent e)
    {
        l1.setText("Value:"+((JSpinner)e.getSource()).getValue());
    }
    public static void main(String [] args)
    {
        JFrm19 a=new JFrm19();
    }
}
