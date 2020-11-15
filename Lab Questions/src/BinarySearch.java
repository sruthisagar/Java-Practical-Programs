import java.util.Scanner;

public class BinarySearch
{
    public static int binarySearch(int a[], int beg, int end, int x)
    {
        int middle=0;
        while(end>=beg)
        {
            middle = (beg+end)/2;
            if(a[middle] == x)
                return middle;
            else if(a[middle] < x)
                beg = middle+1;
            else
                end = middle-1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("\nEnter the elements");
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        System.out.println("\nEnter the element to be searched");
        int x = sc.nextInt();

        int ind = binarySearch(a,0, n-1, x);

        if(ind == -1)
            System.out.println("\nElement not found");
        else
            System.out.println("\nElement found at index " + ind);
    }
}
