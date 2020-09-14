import java.util.Scanner;

public class StringPalindrome
{
    public static void main(String[] args)
    {
        String str;
        int f=0;
        char temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        str = scanner.nextLine();

        int n=str.length();
        StringBuilder reverse = new StringBuilder(str);
        for (int i=0;i<n/2;i++)
        {
            temp=reverse.charAt(i);
            reverse.setCharAt(i, reverse.charAt(n-i-1));
            reverse.setCharAt(n-i-1, temp);
        }

        System.out.println("Given string: "+str);
        System.out.println("Reverse string: "+reverse+"\n");

        for (int i=0;i<n;i++)
        {
            if(str.charAt(i)!=reverse.charAt(i))
                f=1;
        }

        if (f==0)
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}
