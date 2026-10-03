import java.io.*;
import java.util.*;

class Combined_file
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            DataOutputStream out =
                new DataOutputStream(new FileOutputStream("employee.dat"));

            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++)
            {
                System.out.print("Enter employee ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();

                out.writeInt(id);
                out.writeUTF(name);
                out.writeDouble(salary);
            }

            out.close();

            DataInputStream in =
                new DataInputStream(new FileInputStream("employee.dat"));

            System.out.println("\nEmployee Details");

            for(int i = 1; i <= n; i++)
            {
                System.out.println("\nEmployee " + i);
                System.out.println("ID: " + in.readInt());
                System.out.println("Name: " + in.readUTF());
                System.out.println("Salary: " + in.readDouble());
            }

            in.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
