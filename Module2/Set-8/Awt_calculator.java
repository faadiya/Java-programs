import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener
{
    TextField t1, t2, result;
    Button add, sub, mul, div;

    Calculator()
    {
        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(10);

        add(t1);
        add(t2);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = 0;

            if(e.getSource() == add)
                c = a + b;

            if(e.getSource() == sub)
                c = a - b;

            if(e.getSource() == mul)
                c = a * b;

            if(e.getSource() == div)
                c = a / b;

            result.setText("" + c);
        }
        catch(Exception x)
        {
            result.setText("Invalid Input");
        }
    }

    public static void main(String args[])
    {
        new Calculator();
    }
}
