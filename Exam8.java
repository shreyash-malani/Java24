import java.awt.*;
import java.awt.event.*;

public class Exam8 extends Frame implements KeyListener, MouseListener, MouseMotionListener {

    private String message = "";
    private int mouseX = 0, mouseY = 0; // Mouse coordinates

    public Exam8() {
        // Set up the Frame
        setTitle("Key and Mouse Event Demo");
        setSize(500, 400);
        setLayout(null); // No default layout
        setVisible(true);

        // Add listeners for key and mouse events
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);

        // Close the Frame on window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

  
    public void paint(Graphics g) {
        // Display key press or mouse event messages
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString(message, 50, 100);
        g.drawString("Mouse Coordinates: (" + mouseX + ", " + mouseY + ")", 50, 150);
    }

    // KeyListener methods
   
    public void keyPressed(KeyEvent e) {
        message = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

   
    public void keyReleased(KeyEvent e) {
        message = "Key Released: " + e.getKeyChar();
        repaint();
    }

 
    public void keyTyped(KeyEvent e) {
        message = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    // MouseListener methods
    
    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    
    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered the Frame";
        repaint();
    }

    
    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited the Frame";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        message = "Mouse Released at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        message = "Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")";
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        message = "Mouse Moved to (" + e.getX() + ", " + e.getY() + ")";
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public static void main(String[] args) {
        new Exam8();
    }
}
