import java.util.Scanner;

public class QuickSort
{
    int partition(String arr[], int low, int high)
    {
        String pivot = arr[high];
        int i = low-1;
        for (int j=low; j<high; j++)
        {
            if (arr[j].compareToIgnoreCase(pivot)<0)
            {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void quickSort(String arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[20];

        System.out.println("Enter the number of names");
        int no = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter the names");
        for(int i=0; i<no; i++)
            arr[i]=sc.nextLine();

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, no-1);

        System.out.println("\nSorted list of names:");
        for(int i=0; i<no; i++)
            System.out.println(arr[i]);
    }
}

