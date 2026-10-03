interface Printable {
    void print();
}

class Student implements Printable {
    void display() {
        System.out.println("Student: Fadiya");
    }

    public void print() {
        display();
    }
}

class Teacher implements Printable {
    void display() {
        System.out.println("Teacher: Anu");
    }

    public void print() {
        display();
    }
}

class Implementing_interface {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.print();
        t.print();
    }
}
