class Student
{
    String name;
    int rollNo;
    int mark;

    // Default constructor
    Student()
    {
        name = "Unknown";
        rollNo = 0;
        mark = 0;
    }

    // Parameterized constructor
    Student(String n, int r, int m)
    {
        name = n;
        rollNo = r;
        mark = m;
    }

    // Display student details
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark: " + mark);
    }

    // Overloaded method for int
    char calculateGrade(int mark)
    {
        if(mark >= 90)
            return 'A';
        else if(mark >= 75)
            return 'B';
        else if(mark >= 50)
            return 'C';
        else
            return 'F';
    }

    // Overloaded method for double
    char calculateGrade(double mark)
    {
        if(mark >= 90)
            return 'A';
        else if(mark >= 75)
            return 'B';
        else if(mark >= 50)
            return 'C';
        else
            return 'F';
    }

    // Garbage collection method
    protected void finalize()
    {
        System.out.println("Student object garbage collected");
    }

    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Fadiya", 101, 85);
        Student s3 = new Student("Anu", 102, 92);

        s1.display();
        System.out.println("Grade: " + s1.calculateGrade(s1.mark));

        System.out.println();

        s2.display();
        System.out.println("Grade: " + s2.calculateGrade(s2.mark));

        System.out.println();

        s3.display();
        System.out.println("Grade: " + s3.calculateGrade(s3.mark));

        // Making objects eligible for garbage collection
        s1 = null;
        s2 = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}

File name: "Student.java"

Sample Output:

Name: Unknown
Roll No: 0
Mark: 0
Grade: F

Name: Fadiya
Roll No: 101
Mark: 85
Grade: B

Name: Anu
Roll No: 102
Mark: 92
Grade: A

Garbage collection requested
Student object garbage collected
Student object garbage collected

The last two garbage-collection messages may or may not appear, because "System.gc()" only requests the JVM to perform garbage collection.
