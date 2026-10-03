import java.applet.Applet;
import java.awt.Graphics;


public class Applet_Animation extends Applet implements Runnable {

    int x = 0;
    Thread t;

    public void init() {
        x = 0;
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x = x + 5;

            if (x > 450)
                x = 0;

            repaint();

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 80, 30, 30);
    }

    public void stop() {
        t = null;
    }
}
