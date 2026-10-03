import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentMarkList extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2, b3;

    StudentMarkList()
    {
        setTitle("Student Mark List");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2));

        l1 = new JLabel("Name");
        l2 = new JLabel("Register No");
        l3 = new JLabel("Mark 1");
        l4 = new JLabel("Mark 2");
        l5 = new JLabel("Mark 3");
        l6 = new JLabel("Result");
        l7 = new JLabel("");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();

        b1 = new JButton("Calculate");
        b2 = new JButton("Clear");
        b3 = new JButton("Exit");

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);
        add(b1); add(b2);
        add(b3); add(l6);
        add(l7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            int m1 = Integer.parseInt(t3.getText());
            int m2 = Integer.parseInt(t4.getText());
            int m3 = Integer.parseInt(t5.getText());

            if(m1 < 0 || m1 > 100 ||
               m2 < 0 || m2 > 100 ||
               m3 < 0 || m3 > 100)
            {
                JOptionPane.showMessageDialog(this,
                    "Marks must be between 0 and 100");
            }
            else
            {
                int total = m1 + m2 + m3;
                double average = total / 3.0;
                String grade;

                if(average >= 90)
                    grade = "A";
                else if(average >= 75)
                    grade = "B";
                else if(average >= 50)
                    grade = "C";
                else
                    grade = "F";

                l7.setText("Total: " + total +
                           "  Average: " + average +
                           "  Grade: " + grade);
            }
        }

        if(e.getSource() == b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            l7.setText("");
        }

        if(e.getSource() == b3)
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        new StudentMarkList();
    }
}
