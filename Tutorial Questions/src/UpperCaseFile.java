import java.util.Scanner;
import java.io.*;

public class UpperCaseFile
{
    public static void main(String[] args)
    {
        int i;
        String fileName, str;
        Scanner sc = new Scanner(System.in);

        FileInputStream fin =null;
        FileOutputStream fout = null;

        System.out.println("Enter the file name");
        fileName = sc.next();

        try
        {
            fin = new FileInputStream(fileName);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Unable to open file");
        }

        try
        {
            System.out.println("\nContent of the given file in uppercase:\n");
            do
            {
                i = fin.read();
                char ch = (char)i;
                if(i!=-1)
                {
                    if (Character.isLowerCase(ch))
                        System.out.print(Character.toUpperCase(ch));
                    else
                        System.out.print(ch);
                }
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
