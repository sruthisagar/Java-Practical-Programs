import java.util.Scanner;

public class MatrixMultiplication
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

    public static void product(int[][] a, int[][] b, int[][] p, int r1 ,int c1, int r2, int c2)
    {
        for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
            {
                p[i][j]=0;
                for(int k=0;k<c1;k++)
                    p[i][j]+=a[i][k]*b[k][j];
            }
        System.out.println("\nProduct of the given matrices is");
        display(p, r1, c2);
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
        int[][] b = new int[SIZE][SIZE];
        int[][] p = new int[SIZE][SIZE];
        int r1, c1, r2, c2;

        System.out.println("Matrix 1");
        System.out.println("Enter the row size and column size");
        r1=sc.nextInt();
        c1=sc.nextInt();

        System.out.println("\nMatrix 2");
        System.out.println("Enter the row size and column size");
        r2=sc.nextInt();
        c2=sc.nextInt();

        if(c1!=r2)
        {
            System.out.println("\nSize mismatch");
            return;
        }

        System.out.println("\nMatrix 1");
        read(a, r1, c1);
        System.out.println("\nMatrix 2");
        read(b, r2, c2);

        System.out.println("\nMatrix 1");
        display(a, r1, c1);
        System.out.println("\nMatrix 2");
        display(b, r2, c2);

        product(a, b, p, r1, c1, r2, c2);
    }
}
