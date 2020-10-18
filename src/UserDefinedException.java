//Roll No in the range 1 to 60 is considered as valid

import java.util.Scanner;

class RollNoOutOfBoundException extends Exception
{
    public RollNoOutOfBoundException(String str)
    {
        System.out.println(str);
    }
}

public class UserDefinedException
{
    public static void main(String[] args) throws RollNoOutOfBoundException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Roll No of the student");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Name of the student");
        String name = sc.nextLine();

        try
        {
            if (rollNo<1 || rollNo>60)
                throw new RollNoOutOfBoundException("\nRoll No is not between 1 and 60");
            else
                System.out.println("\nRoll No: " + rollNo);
        }

        catch (RollNoOutOfBoundException e)
        {
            System.out.println(e);
        }

        finally
        {
            System.out.println("Name: " + name);
        }
    }
}
