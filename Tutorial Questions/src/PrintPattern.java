public class PrintPattern
{
    public static void main(String[] args)
    {
        int n=0;
        int[][] a = new int[4][4];

        for (int i=0; i<4; i++)
        {
            for (int j=0; j<=i; j++)
            {
                a[i][j] = n;
                System.out.print(a[i][j]+" ");
                n++;
            }
            System.out.println();
        }
    }
}
