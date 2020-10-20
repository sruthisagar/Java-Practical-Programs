import java.lang.Math;
import java.util.Scanner;

class Complex
{
    float real, imaginary;

    Complex add(Complex z1, Complex z2)
    {
        Complex sum = new Complex();

        sum.real = z1.real + z2.real;
        sum.imaginary = z1.imaginary + z2.imaginary;

        return sum;
    }

    Complex sub(Complex z1, Complex z2)
    {
        Complex difference = new Complex();

        difference.real = z1.real - z2.real;
        difference.imaginary = z1.imaginary - z2.imaginary;

        return difference;
    }

    Complex mul(Complex z1, Complex z2)
    {
        Complex product = new Complex();

        product.real = (z1.real*z2.real) - (z1.imaginary*z2.imaginary);
        product.imaginary = (z1.real*z2.imaginary) + (z1.imaginary*z2.real);

        return product;
    }

    float magnitude(Complex z)
    {
        float magnitude = (float) Math.sqrt(Math.pow(z.real, 2) + Math.pow(z.imaginary, 2));
        return magnitude;
    }

    Complex conjugate(Complex z)
    {
        Complex conjugate = new Complex();

        conjugate.real = z.real;
        conjugate.imaginary = -z.imaginary;

        return conjugate;
    }

    void display()
    {
        if(this.imaginary >= 0)
            System.out.println(this.real + "+" + this.imaginary + "i");
        else
            System.out.println(this.real + "" + this.imaginary + "i");
    }
}
public class ComplexNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float mag;
        Complex z1 = new Complex();
        Complex z2 = new Complex();
        Complex result = new Complex();

        System.out.println("Enter 1st complex number (z1):");
        z1.real =  sc.nextFloat();
        z1.imaginary = sc.nextFloat();

        System.out.println("\nEnter 2nd complex number (z2):");
        z2.real =  sc.nextFloat();
        z2.imaginary = sc.nextFloat();

        System.out.print("\nz1 = ");
        z1.display();

        System.out.print("\nz2 = ");
        z2.display();

        System.out.print("\nz1 + z2 = ");
        result = result.add(z1, z2);
        result.display();

        System.out.print("\nz1 - z2 = ");
        result = result.sub(z1, z2);
        result.display();

        System.out.print("\nz1 * z2 = ");
        result = result.mul(z1, z2);
        result.display();

        mag = result.magnitude(z1);
        System.out.println("\nModulus of z1 = " + mag);

        mag = result.magnitude(z2);
        System.out.println("\nModulus of z2 = " + mag);

        System.out.print("\nConjugate of z1 = ");
        result =result.conjugate(z1);
        result.display();

        System.out.print("\nConjugate of z2 = ");
        result =result.conjugate(z2);
        result.display();
    }
}
