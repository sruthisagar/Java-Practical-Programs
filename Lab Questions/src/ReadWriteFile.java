import java.util.Scanner;
import java.io.*;

public class ReadWriteFile
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
            File fileObj = new File(fileName);
            if(fileObj.createNewFile())
                System.out.println("Created file " + fileObj.getName());
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file");
        }

        try
        {
            System.out.println("\nEnter the text");
            sc.nextLine();
            str = sc.nextLine();
            byte byteStr[] = str.getBytes();
            fout = new FileOutputStream(fileName);
            fout.write(byteStr);
        }
        catch(IOException e)
        {
            System.out.println("Unable to write file");
        }

        try
        {
            if(fout!=null)
                fout.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to close file");
        }

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
            System.out.println("Content of the given file:");
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
