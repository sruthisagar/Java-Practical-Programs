import java.util.Scanner;
public class IfExample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        if(a>b)
            System.out.println(a+" is greater than "+b);
        else if(b>a)
            System.out.println(b+" is greater than "+a);
        else
            System.out.println(a+" is equal to "+b);
    }
}
