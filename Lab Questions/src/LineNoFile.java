import java.util.Scanner;
import java.io.*;

public class LineNoFile
{
    public static void main(String[] args)
    {
        int i, lineNo=1;
        String fileName, str;
        Scanner sc = new Scanner(System.in);

        FileInputStream fin = null;

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
            System.out.print("\n" + lineNo + "\t");
            do
            {
                i = fin.read();

                if((char)i=='\n')
                {
                    lineNo++;
                    System.out.print("\n" + lineNo + "\t");
                }
                if((char)i!='\n'&&i!=-1)
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