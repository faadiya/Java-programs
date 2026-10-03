import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;


public class HTMLColorApplet extends Applet {

    String message;
    Color bg, fg;

    public void init() {
        message = getParameter("message");

        String background = getParameter("bg");
        String foreground = getParameter("fg");

        if (background.equals("yellow"))
            bg = Color.yellow;
        else if (background.equals("green"))
            bg = Color.green;
        else
            bg = Color.white;

        if (foreground.equals("blue"))
            fg = Color.blue;
        else if (foreground.equals("red"))
            fg = Color.red;
        else
            fg = Color.black;

        setBackground(bg);
        setForeground(fg);
    }

    public void paint(Graphics g) {
        g.drawString(message, 100, 100);
    }
}
