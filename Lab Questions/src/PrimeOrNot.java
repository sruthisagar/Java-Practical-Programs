import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String args[])
    {
        int f=0;
//        int n=23;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if(n<0)
            System.out.println("Invalid input");
        else if (n==0||n==1)
            System.out.println(n+" is neither prime nor composite");
        else
        {
            for (int k = 2; k <= n / 2; k++)
                if (n % k == 0)
                {
                    f = 1;
                    break;
                }

            if (f==0)
                System.out.println(n+" is prime");
            else
                System.out.println(n+" is not prime");
        }
    }
}
