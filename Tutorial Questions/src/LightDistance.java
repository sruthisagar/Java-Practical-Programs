public class LightDistance
{
    public static void main(String[] args)
    {
        long lightSpeed = 186000, days = 1000, seconds, distance;

        seconds = days*24*60*60;
        distance = lightSpeed*seconds;

        System.out.println("Distance travelled by light in "+days+" days = "+distance+" miles");
    }
}
