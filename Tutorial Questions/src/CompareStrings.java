import java.util.Scanner;

public class CompareStrings
{
    public static void main(String[] args)
    {
        String s1, s2;
//        s1="aparna";
//        s2="aparna";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String 1");
        s1 = scanner.nextLine();
        System.out.println("Enter String 2");
        s2 = scanner.nextLine();

        if (s1==s2)
            System.out.println("String 1 and String 2 are equal");
        else
            System.out.println("String 1 and String 2 are not equal");
    }
}
