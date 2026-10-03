import java.awt.*;
import java.awt.event.*;

class Events extends Frame
{
    Label l;

    Events()
    {
        l = new Label("Move mouse or press a key");
        add(l);

        addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                l.setText("X = " + e.getX() +
                          " Y = " + e.getY());
            }
        });

        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                l.setText("Mouse Clicked");
            }
        });

        addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                l.setText("Key Pressed: " + e.getKeyChar());
            }
        });

        setSize(400,300);
        setLayout(new FlowLayout());
        setVisible(true);
        requestFocus();
    }

    public static void main(String args[])
    {
        new Events();
    }
}
