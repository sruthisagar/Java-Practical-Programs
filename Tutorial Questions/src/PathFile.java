import java.io.*;

public class PathFile
{
    public static void main(String[] args)
    {

        File fileObj = new File("/media/dingu/D_Box/Sruthi/Java/FirstApp/Tutorial Questions/path.txt");
        if(fileObj.exists())
            System.out.println(fileObj.getName() + " exists");
        else
        {
            try
            {
                fileObj.createNewFile();
                System.out.println("Created " + fileObj.getName());
            }
            catch(IOException e)
            {
                System.out.println("Unable to create file");
            }
        }

        if(fileObj.isDirectory())
            System.out.println(fileObj.getName() + " is a directory");
        else
            System.out.println(fileObj.getName() + " is not a directory");

        if(fileObj.isFile())
            System.out.println(fileObj.getName() + " is a file");
        else
            System.out.println(fileObj.getName() + " is not a file");

        System.out.println("Absolute path of " + fileObj.getName() + " :");
        System.out.println(fileObj.getAbsolutePath());
    }
}
