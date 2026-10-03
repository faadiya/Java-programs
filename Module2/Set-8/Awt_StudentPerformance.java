import java.awt.*;
import java.awt.event.*;

class Performance extends Frame implements ActionListener
{
    TextField name, m1, m2, m3;
    Button calculate;
    Label result;

    Performance()
    {
        setLayout(new FlowLayout());

        add(new Label("Name"));
        name = new TextField(10);
        add(name);

        add(new Label("Mark 1"));
        m1 = new TextField(5);
        add(m1);

        add(new Label("Mark 2"));
        m2 = new TextField(5);
        add(m2);

        add(new Label("Mark 3"));
        m3 = new TextField(5);
        add(m3);

        calculate = new Button("Calculate");
        add(calculate);

        result = new Label();
        add(result);

        calculate.addActionListener(this);

        setSize(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(m1.getText());
        int b = Integer.parseInt(m2.getText());
        int c = Integer.parseInt(m3.getText());

        int total = a + b + c;
        double average = total / 3.0;

        result.setText("Total = " + total +
                       " Average = " + average);
    }

    public static void main(String args[])
    {
        new Performance();
    }
}
