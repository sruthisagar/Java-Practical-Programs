import java.util.Random;

class NewThread extends Thread
{
    synchronized void call()
    {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Random integer: " + number);
        if (number%2 == 0)
        {
            Square squareNo = new Square(number);
            squareNo.start();
        }
        else
        {
            Cube cubeNo = new Cube(number);
            cubeNo.start();
        }
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread Interrupted " + e);
        }
    }

    public void run()
    {
        call();
    }
}

class Square extends Thread
{
    int n;
    Square(int number)
    {
        n = number;
    }

    public void run()
    {
        System.out.println("Square of " + n + ": " + (n * n) + "\n");
    }
}

class Cube extends Thread
{
    int n;
    Cube(int number)
    {
        n = number;
    }

    public void run()
    {
        System.out.println("Cube of " + n + ": " + (n * n * n) + "\n");
    }
}

public class MultiThreadingRandomSquareCube
{
    public static void main(String args[])
    {
        NewThread t1 = new NewThread();
        t1.start();
        t1.run();
        t1.run();
    }
}