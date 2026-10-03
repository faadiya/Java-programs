import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseApplet extends Applet implements MouseListener {

    String message = "Move the mouse inside the applet";

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }

    public void mouseClicked(MouseEvent e) {
        message = "Mouse clicked at X = " + e.getX()
                + ", Y = " + e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
