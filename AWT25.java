import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AWT25 extends Frame implements ActionListener
{
    TextArea ta;
    Button bn,bo,bs,bx;
    String str;
    FileDialog fd;
    Panel p;
    AWT25()
    {
        super("Editor");
        ta=new TextArea("",10,100,TextArea.SCROLLBARS_BOTH);
        bn=new Button("New");
        bo=new Button("Open");
        bs=new Button("Save");
        bx=new Button("Exit");

        add(ta,BorderLayout.CENTER);
        bn.addActionListener(this);
        bo.addActionListener(this);
        bs.addActionListener(this);
        bx.addActionListener(this);

        p=new Panel();
        p.add(bn);
        p.add(bo);
        p.add(bs);
        p.add(bx);

        add(p,BorderLayout.SOUTH);

        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==bn)
            ta.setText("");
        if(b==bo)
            open();
        if(b==bs)
            save();
        if(b==bx)
            System.exit(0);
    }
    void open()
    {
        fd=new FileDialog((Frame)null,"Open",FileDialog.LOAD);
        fd.setVisible(true);
        String fnm=fd.getDirectory()+fd.getFile();
        File f=null;FileReader fr=null;
        try
        {
            f=new File(fnm);
            fr=new FileReader(f);
        }
        catch(Exception e){}
        int val=0;
        str="";
        while(true)
        {
            try
            {
                val=fr.read();  //these will return ASCII valye
                if (val==-1)
                    break;
                str=str+(char)val;
            }
            catch(Exception e){}
        }
        try
        {
            fr.close();
        }
        catch(Exception e){}
        ta.setText(str);
    }
    void save()
    {
        fd=new FileDialog((Frame)null,"Save",FileDialog.SAVE);
        fd.setVisible(true);
        String fnm=fd.getDirectory()+fd.getFile();
        File f=null;FileWriter fw=null;
        try
        {
            f=new File(fnm);
            fw=new FileWriter(f);
        }
        catch(Exception e){}
        str=ta.getText();
        int i=0,n=str.length();
        char [] a=new char[n];
        a=str.toCharArray();
        while(i<n)
        {
            try
            {
                fw.write(a[i]);
            }
            catch(Exception e){}
            i++;
        }
        try
        {
            fw.close();
        }
        catch(Exception e){}
    }
    public static void main(String [] args)
    {
        AWT25 a=new AWT25();
    }
}
