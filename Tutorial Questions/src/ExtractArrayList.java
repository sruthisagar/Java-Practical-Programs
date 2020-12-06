import java.util.*;

public class ExtractArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        strList.add("D");
        strList.add("E");
        System.out.println("Original array list: " + strList);

        List<String> subStrList = strList.subList(0, 3);
        System.out.println("Extracted array list: " + subStrList);
    }
}

