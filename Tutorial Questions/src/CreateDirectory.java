import java.io.*;

public class CreateDirectory
{
    public static void main(String[] args)
    {
        File file = new File("/media/dingu/D_Box/Sruthi/Java/FirstApp/Tutorial Questions/New Directory");

        if (file.mkdir())
        {
            System.out.println("Created directory " + file.getName());
            System.out.println("Absolute path: " + file.getName());
        }
        else
            System.out.println("Unable to create directory");
    }
}
