import java.io.*;

public class RenameFile
{
    public static void main(String[] args)
    {
        File oldFile = new File(args[0]);
        File newFile = new File(args[1]);

        if(oldFile.exists())
        {
            System.out.println(oldFile.getName() + " exists");
            try
            {
                oldFile.renameTo(newFile);
                System.out.println(oldFile.getName() + " renamed to " + newFile.getName());
            }
            catch (NullPointerException e)
            {
                System.out.println("Unable to rename");
            }

            if(newFile.delete())
                System.out.println("Deleted " + newFile.getName());
            else
                System.out.println("Unable to delete " + newFile.getName());
        }
        else
            System.out.println("File does not exist");
    }
}
