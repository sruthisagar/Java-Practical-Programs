public class BitwiseOperators
{
    public static void main(String[] args)
    {
        int a=60, b=13;

        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a;
        int g = a << 2;
        int h = a >> 2;
        int i = a >>> 2;

        System.out.println("a = " + a + "\t" + Integer.toBinaryString(a));
        System.out.println("b = " + b + "\t" + Integer.toBinaryString(b));
        System.out.println("a & b = " + c + "\t" + Integer.toBinaryString(c));
        System.out.println("a | b = " + d + "\t" + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + e + "\t" + Integer.toBinaryString(e));
        System.out.println("~a = " + f + "\t" + Integer.toBinaryString(f));
        System.out.println("a << 2 = " + g + "\t" + Integer.toBinaryString(g));
        System.out.println("a >> 2 = " + h + "\t" + Integer.toBinaryString(h));
        System.out.println("a >>> 2 = " + i + "\t" + Integer.toBinaryString(i));

    }
}
