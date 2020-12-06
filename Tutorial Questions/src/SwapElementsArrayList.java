import java.util.*;

public class SwapElementsArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original array list: " + list);

        Collections.swap(list, 2, 3);
        System.out.println("Array list after swapping 2nd and 3rd elements: " + list);
    }
}
