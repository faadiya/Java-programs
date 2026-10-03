import java.io.*;
import java.util.*;

class File_outputStream
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter text: ");
            String str = sc.nextLine();

            FileOutputStream f = new FileOutputStream("output.txt", true);

            f.write(str.getBytes());
            f.write('\n');

            f.close();

            System.out.println("Data written successfully.");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
