import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends JFrame implements ActionListener
{
    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2, b3;

    LoginForm()
    {
        setTitle("Login Form");
        setSize(350, 250);
        setLayout(new GridLayout(4, 2));

        l1 = new JLabel("Username");
        l2 = new JLabel("Password");

        t1 = new JTextField();
        p1 = new JPasswordField();

        b1 = new JButton("Login");
        b2 = new JButton("Reset");
        b3 = new JButton("Exit");

        add(l1); add(t1);
        add(l2); add(p1);
        add(b1); add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            String username = t1.getText();
            String password = new String(p1.getPassword());

            if(username.equals("admin") && password.equals("1234"))
            {
                JOptionPane.showMessageDialog(this,
                    "Login Successful");
            }
            else
            {
                JOptionPane.showMessageDialog(this,
                    "Invalid Username or Password");
            }
        }

        if(e.getSource() == b2)
        {
            t1.setText("");
            p1.setText("");
        }

        if(e.getSource() == b3)
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        new LoginForm();
    }
}
