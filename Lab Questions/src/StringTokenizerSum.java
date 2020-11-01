import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum
{
    public static void main(String[] args)
    {
        int sum=0, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integers seperated by tokens");
        String str = sc.nextLine();

        System.out.println("Enter the token");
        String token = sc.nextLine();

        StringTokenizer c = new StringTokenizer(str, token);
        System.out.print("\nGiven integers: ");
        while(c.hasMoreTokens())
        {
            num = Integer.parseInt(c.nextToken());
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nSum = " + sum);
    }
}
