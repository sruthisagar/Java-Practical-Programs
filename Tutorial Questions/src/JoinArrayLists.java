import java.util.*;

public class JoinArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("It's gonna be");
        list1.add("legen..");
        System.out.println("List 1: " + list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("wait for it..");
        list2.add("dary");
        System.out.println("List 2: " + list2);

        list1.addAll(list2);
        System.out.println("\nList 1 after joining: " + list1);
    }
}
