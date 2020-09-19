import java.util.Scanner;

public class MatrixTranspose
{
    static Scanner sc = new Scanner(System.in);
    static final int SIZE=10;

    public static void read(int[][] r, int m, int n)
    {
        System.out.println("\nEnter the elements");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                r[i][j]=sc.nextInt();
    }

    public static void transpose(int[][] a, int t[][], int r, int c)
    {
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                t[j][i]=a[i][j];
        System.out.println("\nTranspose of the given matrix is");
        display(t, c, r);
    }

    public static void display(int[][] d, int m, int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(d[i][j]+"\t");
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        int[][] a = new int[SIZE][SIZE];
        int[][] t = new int[SIZE][SIZE];
        int r, c;

        System.out.println("Enter the row size and column size");
        r=sc.nextInt();
        c=sc.nextInt();
        read(a, r, c);

        System.out.println("\nThe given matrix is");
        display(a, r, c);

        transpose(a, t, r, c);
    }
}
