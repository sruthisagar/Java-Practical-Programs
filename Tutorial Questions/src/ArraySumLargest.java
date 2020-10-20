import java.util.Scanner;

public class ArraySumLargest
{
    public static void main(String[] args)
    {
        int a[] = new int[20];
        int n, sum=0, l=Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size");
        n = scanner.nextInt();

        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
        {
            a[i] = scanner.nextInt();
            sum+=a[i];
            if (a[i]>l)
                l=a[i];
        }

        System.out.println("The given array is:");
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");

        System.out.println("\nSum of elements = "+sum);
        System.out.println("Largest element = "+l);
    }
}
