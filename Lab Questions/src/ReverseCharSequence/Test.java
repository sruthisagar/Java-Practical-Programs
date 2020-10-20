package ReverseCharSequence;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int length, start, end;

        System.out.println("Enter a string");
        str = sc.nextLine();
        CharSequenceReverse s = new CharSequenceReverse(str);

        System.out.println("Enter the starting and ending index of substring");
        start = sc.nextInt();
        end = sc.nextInt();

        // test length()
        length = s.length();
        System.out.println("Length of string using length() : " + length);

        // test charAt()
        System.out.print("Reverse of string using charAt() : ");
        for (int i = 0; i < length; i++)
            System.out.print(s.charAt(i));

        // test subSequence()
        System.out.print("\nReverse of substring using subSequence() : ");
        System.out.println(s.subSequence(start, end));

        //test toString()
        System.out.print("Reverse of string using toString() : ");
        System.out.println(s.toString());

    }
}
