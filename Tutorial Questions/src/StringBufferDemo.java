public class StringBufferDemo
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("Hola amigos..How you doin'");

        System.out.println(str);

        System.out.println("\nlength()");
        System.out.println(str.length());

        System.out.println("\ncapacity()");
        System.out.println(str.capacity());

        System.out.println("\nensureCapacity(20)");
        str.ensureCapacity(20);
        System.out.println(str.capacity());
        System.out.println("ensureCapacity(50)");
        str.ensureCapacity(50);
        System.out.println(str.capacity());

        System.out.println("\nsetLength(13)");
        StringBuffer setLengthStr = new StringBuffer(str);
        setLengthStr.setLength(13);
        System.out.println(setLengthStr.length());
        System.out.println(setLengthStr);

        System.out.println("\ncharAt(5)");
        System.out.println(str.charAt(5));

        System.out.println("\nsetCharAt(9, 'a')");
        StringBuffer setCharAtStr = new StringBuffer(str);
        setCharAtStr.setCharAt(9, 'a');
        System.out.println(setCharAtStr);

        System.out.println("\ngetChars(13, 26, charStr, 0)");
        char[] charStr = new char[13];
        str.getChars(13, 26, charStr, 0);
        System.out.println(charStr);

        System.out.println("\nappend(\"??\")");
        StringBuffer appendStr1 = new StringBuffer(str);
        System.out.println(appendStr1.append("??"));
        System.out.println("append(777)");
        StringBuffer appendStr2 = new StringBuffer(str);
        System.out.println(appendStr2.append(777));

        System.out.println("\ninsert(5, \"mi \")");
        StringBuffer insertStr = new StringBuffer(str);
        System.out.println(insertStr.insert(5, "mi "));

        System.out.println("\nreverse()");
        StringBuffer reverseStr = new StringBuffer(str);
        System.out.println(reverseStr.reverse());

        System.out.println("\ndelete(4, 11)");
        StringBuffer delStr = new StringBuffer(str);
        System.out.println(delStr.delete(4, 11));

        System.out.println("\ndeleteCharAt(0)");
        StringBuffer delCharStr = new StringBuffer(str);
        System.out.println(delCharStr.deleteCharAt(0));

        System.out.println("\nreplace(5, 11, \"friends\")");
        StringBuffer replaceStr = new StringBuffer(str);
        System.out.println(replaceStr.replace(5, 11, "friends"));

        System.out.println("\nsubString(13)");
        StringBuffer subStr1 = new StringBuffer(str);
        System.out.println(subStr1.substring(13));
        System.out.println("subString(11, 16)");
        StringBuffer subStr2 = new StringBuffer(str);
        System.out.println(subStr2.substring(13, 16));
    }
}
