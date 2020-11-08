import java.io.*;
import java.util.Scanner;

public class CountCharactersLinesWords
{
    public static void main(String[] args)
    {
        int i, character=0, word=1, line=1;

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

        System.out.println();

        try
        {
            do
            {
                i = fin.read();

                if(i!=-1)
                {
                    if ((char) i == '\n')
                    {
                        line++;
                        word++;
                    } else if ((char) i == ' ')
                        word++;
                    else
                        character++;
                    System.out.print((char) i);
                }
            }
            while(i!=-1);

            System.out.println("\n\nNo of characters = " + character);
            System.out.println("No of words = " + word);
            System.out.println("No of lines = " + line);
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

