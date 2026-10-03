import java.applet.Applet;
import java.awt.Graphics;

public class Applet_userInformation extends Applet {

    String name, regno, course, semester;

    public void init() {
        name = getParameter("name");
        regno = getParameter("regno");
        course = getParameter("course");
        semester = getParameter("semester");
    }

    public void paint(Graphics g) {
        g.drawString("Student Information", 100, 50);
        g.drawString("Name: " + name, 50, 90);
        g.drawString("Register Number: " + regno, 50, 120);
        g.drawString("Course: " + course, 50, 150);
        g.drawString("Semester: " + semester, 50, 180);
    }
}
