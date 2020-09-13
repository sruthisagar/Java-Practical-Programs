import java.util.Scanner;

public class SecondSmallestElement
{
    public static void main(String[] args)
    {
        int[] a = new int[20];
        int n, s1=0, s2=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size");
        n = scanner.nextInt();

        if (n<2)
        {
            System.out.println("Array size should be greater than 1");
            return;
        }

        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
            a[i]=scanner.nextInt();

        System.out.println("The given array is:");
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");

        if (a[0]<a[1])
        {
            s1=a[0];
            s2=a[1];
        }
        else
        {
            s1=a[1];
            s2=a[0];
        }

        for (int i=2;i<n;i++)
        {
            if (a[i]<s2)
            {
                if (a[i] < s1)
                {
                    s2 = s1;
                    s1 = a[i];
                }
                else
                    s2 = a[i];
            }
        }



        System.out.println("\nThe second smallest element is "+s2);
    }
}
