import java.awt.*;
import java.awt.event.*;

class ColorDemo extends Frame implements ActionListener
{
    Button red, green, blue;

    ColorDemo()
    {
        setLayout(new FlowLayout());

        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");

        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == red)
            setBackground(Color.red);

        if(e.getSource() == green)
            setBackground(Color.green);

        if(e.getSource() == blue)
            setBackground(Color.blue);
    }

    public static void main(String args[])
    {
        new ColorDemo();
    }
}
