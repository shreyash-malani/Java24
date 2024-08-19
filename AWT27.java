    import java.awt.*;
    import java.awt.event.*;

    public class AWT27 extends Frame implements ActionListener 
    {
        TextField t1;
        Panel p1;
        String [] cap=new String[] {"1","2","3","+",
                                    "4","5","6","-",
                                    "7","8","9","*",
                                    "C","0","=","/"};
        Button [] btn;
        int v1,v2,res,flg;
        char ch,opr;
        String s;
        AWT27()
        {
            super("Calculator");
            t1=new TextField(15);
            t1.setEditable(false);
            add(t1,BorderLayout.NORTH);
            btn=new Button[16];
            p1=new Panel();
            p1.setLayout(new GridLayout(4,4,5,5));
            for(int i=0;i<16;i++)
            {
                btn[i]=new Button(cap[i]);
                btn[i].addActionListener(this);
                p1.add(btn[i]);
            }
            add(p1,BorderLayout.CENTER);
            addWindowListener(new WindowAdapter() 
            {
            public void windowClosing(WindowEvent e)
            {
                    System.exit(0);
            }
            });
            s="";
            setSize(400,400);
            setVisible(true);
        }
        void comp()
        {
            switch(opr)
            {
                case '+':
                    res=v1+v2;
                    break;
                case '-':
                    res=v1-v2;
                    break;
                case '*':    
                    res=v1*v2;
                    break;
                case '/':
                    res=v1/v2;
                    break;
            }
        }
        public void actionPerformed(ActionEvent e)
        {
            ch=(e.getActionCommand()).charAt(0);
            if(ch=='C')
            {
                s="";t1.setText("");
                flg=0;
                return ;
            }
            if(ch=='=')
            {
                if(flg==1)
                {
                    try
                    {
                        v2=Integer.parseInt(t1.getText());
                    }
                    catch(Exception e1){}
                    comp();
                    t1.setText(""+res);
                    flg=0;s="";
                    return;
                }
            }
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                if(flg==0)
                {
                    try
                    {
                        v1=Integer.parseInt(t1.getText());
                    }
                    catch(Exception e1){}
                    opr=ch;
                    s="";
                    flg=1;
                }
                else
                {
                    try
                    {
                        v2=Integer.parseInt(t1.getText());
                    }
                    catch(Exception e1){}
                    comp();
                    t1.setText(""+res);
                    v1=res;
                    opr=ch;
                    s="";
                }
                return;
            }
            s=s+ch;
            t1.setText(s);
        }
        public static void main(String [] args)
        {
            AWT27 a=new AWT27();
        }
    }
