import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class Server5Practice extends Frame implements Runnable, ActionListener {
    Label l1, l2;
    TextArea t1, t2;
    Button b1, b2;
    Thread th;
    ServerSocket ss;
    Socket s;
    DataOutputStream dos;
    DataInputStream dis;
    String str;
    
    Server5Practice(String title, int port) {
        super(title); // Title for the server window
        l1 = new Label("From Client");
        l2 = new Label("To Client");

        t1 = new TextArea("", 10, 60, TextArea.SCROLLBARS_BOTH);
        t1.setEditable(false);

        t2 = new TextArea("", 10, 60, TextArea.SCROLLBARS_BOTH);

        b1 = new Button("Send");
        b2 = new Button("Exit");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        l1.setBounds(50, 50, 100, 20);
        t1.setBounds(50, 80, 150, 100);

        l2.setBounds(50, 190, 100, 20);
        t2.setBounds(50, 220, 150, 100);

        b1.setBounds(50, 330, 70, 20);
        b2.setBounds(130, 330, 70, 20);

        setSize(250, 400);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);

        setVisible(true);

        try {
            ss = new ServerSocket(port); // Use the provided port for this server
            System.out.println(title + " is waiting for a client on port " + port);
            s = ss.accept();
            System.out.println("Client connected to " + title);
            dos = new DataOutputStream(s.getOutputStream());
            dis = new DataInputStream(s.getInputStream());
            th = new Thread(this);
            th.start();
        } catch (Exception e) {
            System.out.println("Error in " + title + ": " + e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();
        if (b == b2) {
            System.exit(0);
        } else {
            try {
                str = t2.getText();
                dos.writeUTF(str);
                t2.setText("");
            } catch (Exception e1) {}
        }
    }

    public void run() {
        while (true) {
            try {
                str = dis.readUTF();
                str = t1.getText() + "\n" + str;
                t1.setText(str);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) throws Exception {
        // Start two servers with different titles and ports
        new Server5Practice("Server 1", 9294); // Server 1 on port 9294
        new Server5Practice("Server 2", 9295); // Server 2 on port 9295
    }
}
