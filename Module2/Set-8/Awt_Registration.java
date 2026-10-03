import java.awt.*;
import java.awt.event.*;

class Student extends Frame implements ActionListener
{
    TextField name, age;
    Choice course;
    Checkbox male, female;
    Button submit, clear;
    Label result;

    Student()
    {
        setLayout(new FlowLayout());

        add(new Label("Name"));
        name = new TextField(15);
        add(name);

        add(new Label("Age"));
        age = new TextField(5);
        add(age);

        add(new Label("Course"));
        course = new Choice();
        course.add("BSc");
        course.add("BCA");
        course.add("BCom");
        add(course);

        male = new Checkbox("Male");
        female = new Checkbox("Female");
        add(male);
        add(female);

        submit = new Button("Submit");
        clear = new Button("Clear");
        add(submit);
        add(clear);

        result = new Label();
        add(result);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setSize(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == submit)
        {
            result.setText("Name: " + name.getText() +
                           " Age: " + age.getText() +
                           " Course: " + course.getSelectedItem());
        }

        if(e.getSource() == clear)
        {
            name.setText("");
            age.setText("");
            result.setText("");
        }
    }

    public static void main(String args[])
    {
        new Student();
    }
}
