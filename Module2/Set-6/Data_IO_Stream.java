import java.io.*;
import java.util.*;

class Data_IO_Stream
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            float marks = sc.nextFloat();

            DataOutputStream out =
                new DataOutputStream(new FileOutputStream("student.dat"));

            out.writeInt(roll);
            out.writeUTF(name);
            out.writeFloat(marks);

            out.close();

            DataInputStream in =
                new DataInputStream(new FileInputStream("student.dat"));

            System.out.println("\nStudent Details");
            System.out.println("Roll Number: " + in.readInt());
            System.out.println("Name: " + in.readUTF());
            System.out.println("Marks: " + in.readFloat());

            in.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
