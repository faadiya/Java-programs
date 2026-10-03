interface Sports {
    void sportsInfo();
}

interface Academics {
    void academicInfo();
}

class Student implements Sports, Academics {
    public void sportsInfo() {
        System.out.println("Sports: Football");
    }

    public void academicInfo() {
        System.out.println("Academics: Computer Science");
    }
}

class Multiple_interface {
    public static void main(String[] args) {
        Student s = new Student();

        s.academicInfo();
        s.sportsInfo();
    }
}
