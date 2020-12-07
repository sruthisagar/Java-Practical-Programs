class Odd extends Thread
{
    synchronized public void run()
    {
        System.out.println("Odd numbers from 1 to 100:");
        for(int i=1; i<=100; i++)
        {
            if(i%2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}

class Even extends Thread
{
    synchronized public void run()
    {
        System.out.println("Even numbers from 1 to 100:");
        for(int i=1; i<=100; i++)
        {
            if(i%2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}

public class MultiThreadingOddEven
{
    public static void main(String args[])
    {
        try
        {
            Odd odd = new Odd();
            odd.setPriority(5);
            Even even = new Even();
            even.setPriority(1);
            Thread.sleep(1000);
            synchronized(args)
            {
                if(odd.getPriority() > even.getPriority())
                {
                    odd.start();
                    odd.join();
                    even.start();
                }
                else
                {
                    even.start();
                    even.join();
                    odd.start();
                }
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread interrupted " + e);
        }
    }
}