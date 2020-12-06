import java.util.*;

public class CompareArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Rachel");
        list1.add("Chandler");
        list1.add("Joey");
        list1.add("Phoebe");
        list1.add("Ross");
        System.out.println("Array list 1: " + list1);

        ArrayList<String> list2 = new ArrayList<String>(list1);
        System.out.println("Array list 2: " + list2);

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Rachel");
        list3.add("Chandler");
        list3.add("Joey");
        list3.add("Phoebe");
        list3.add("Ross");
        list3.add("Monica");
        System.out.println("Array list 3: " + list3);

        System.out.println("\nList 1 equals list 2: " + list1.equals(list2));
        System.out.println("List 1 equals list 3: " + list1.equals(list3));
    }
}
