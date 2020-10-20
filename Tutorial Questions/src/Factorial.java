import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++)
            factorial*=i;

        System.out.println(n+" factorial = "+factorial);
    }
}
