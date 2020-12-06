import java.util.*;

public class CloneArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<String> originalList = new ArrayList<String>();
        originalList.add("Barney");
        originalList.add("Robin");
        originalList.add("Ted");
        originalList.add("Lily");
        originalList.add("Marshall");
        System.out.println("Original array list: " + originalList);

        ArrayList<String> clonedList = (ArrayList<String>)originalList.clone();
        System.out.println("Cloned array list: " + clonedList);
    }
}
