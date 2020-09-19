import java.util.Scanner;

public class AreaOfShapes
{
    static Scanner sc = new Scanner(System.in);

    public static float calculateArea(float radius)
    {
        return 3.14f*radius*radius;
    }

    public static float calculateArea(float length, float breadth)
    {
        return length*breadth;
    }

    public static float calculateArea(float side1, float side2, float side3)
    {
        float s = (side1 + side2 + side3)/2;
        return (float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public static void main(String[] args)
    {
        float radius, length, breadth, side1, side2, side3, area;
        char ch;

        do
        {
            System.out.println("Area Menu\n_________");
            System.out.println("1. Circle \n2. Rectangle \n3. Triangle");
            System.out.println("\nEnter your choice");
            int choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("\nEnter the radius of the circle");
                    radius=sc.nextFloat();
                    area=calculateArea(radius);
                    System.out.println("Area of the ciecle = "+area+" sq units");
                    break;

                case 2:
                    System.out.println("\nEnter the length and breadth of the rectangle");
                    length=sc.nextFloat();
                    breadth=sc.nextFloat();
                    area=calculateArea(length, breadth);
                    System.out.println("Area of the rectangle = "+area+" sq units");
                    break;

                case 3:
                    System.out.println("\nEnter the sides of the triangle");
                    side1=sc.nextFloat();
                    side2=sc.nextFloat();
                    side3=sc.nextFloat();
                    area=calculateArea(side1, side2, side3);
                    System.out.println("Area of the triangle = "+area+" sq units");
                    break;

                default:
                    System.out.println("\nInvalid input");
            }

            System.out.println("\nDo you want to continue? [y/n]");
            ch=sc.next().charAt(0);
            System.out.print("\n");
        }
        while (ch=='Y'||ch=='y');
    }
}
