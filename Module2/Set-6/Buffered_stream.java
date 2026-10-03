import java.io.*;

class Buffered_stream
{
    public static void main(String args[])
    {
        try
        {
            BufferedInputStream in =
                new BufferedInputStream(new FileInputStream("input.txt"));

            BufferedOutputStream out =
                new BufferedOutputStream(new FileOutputStream("copy.txt"));

            int ch;

            while((ch = in.read()) != -1)
            {
                out.write(ch);
            }

            in.close();
            out.close();

            System.out.println("File copied successfully.");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
