import java.io.*;

public class CommandLineFile
{
    public static void main(String[] args)
    {
        int i;

        FileInputStream fin = null;

        try
        {
            fin = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Unable to open file");
        }

        try
        {
            System.out.println("Content of the given file:\n");
            do
            {
                i = fin.read();
                if(i!=-1)
                    System.out.print((char)i);
            }
            while(i!=-1);
        }
        catch(IOException e)
        {
            System.out.println("Unable to read file");
        }

        try
        {
            if(fin!=null)
                fin.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to close file");
        }

    }
}
