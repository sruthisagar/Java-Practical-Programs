public class CommandLineArgName
{
    public static void main(String[] args)
    {
        System.out.println("The given name is: ");
        for (int i=0; i<args.length; i++)
        {
            System.out.print(args[i] + " ");
        }
    }
}
