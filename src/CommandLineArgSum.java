public class CommandLineArgSum
{
    public static void main(String[] args)
    {
        int sum = 0, invalidInt = 0;
        for (int i=0; i<args.length; i++)
        {
            try
            {
                sum += Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e)
            {
                invalidInt++;
            }
        }

        System.out.println("Sum of integer arguments = " + sum);
        System.out.println("Number of invalid arguments = " + invalidInt);
    }
}
