import java.util.Scanner;

public class SecondSmallestElement
{
    public static void main(String[] args)
    {
        int[] a = new int[20];
        int n, s1, s2;
        s1=s2=Integer.MAX_VALUE;
//        int n=5;
//        int[] a = {4,-5,1,-2,5};
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

        for (int i=0;i<n;i++)
        {
            if (a[i]<s2)
            {
                if (a[i] < s1)
                {
                    s2 = s1;
                    s1 = a[i];
                }
                else if(a[i]!=s1)
                    s2 = a[i];
            }
        }

        if(s2==Integer.MAX_VALUE)
            System.out.println("\nSecond smallest element is not present");
        else
            System.out.println("\nThe second smallest element is "+s2);
    }
}
