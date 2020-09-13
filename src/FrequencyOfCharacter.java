import java.util.Scanner;

public class FrequencyOfCharacter
{
    public static void main(String[] args)
    {
        String str;
        char ch;
        int freq=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        str = scanner.nextLine();

        System.out.println("Enter a character");
        ch = scanner.next().charAt(0);

        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==ch)
                freq++;
        }

        System.out.println("Frequency of "+ch+" in "+str+" is "+freq);
    }
}
