import java.util.*;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Enter some number");
        int n = sc.nextInt();

        for (int i=n; i>=1; i--)
            factorial*=i;
        System.out.print(n+" factorial = ");
        System.out.println(factorial);
    }
}
