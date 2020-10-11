public class GarbageCollector
{
    public void finalize()
    {
        System.out.println("Garbage collected " + this);
    }

    public static void main(String[] args)
    {
        GarbageCollector object1 = new GarbageCollector();
        GarbageCollector object2 = new GarbageCollector();

        object1 = null;
        object2 = null;

        System.gc();
    }
}
