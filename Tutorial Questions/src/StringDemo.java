public class StringDemo
{
    public static void main(String[] args) {
        String str = new String("Hey there..Let's code!!");

        System.out.println("toString()");
        System.out.println(str);

        System.out.println("\nlength()");
        System.out.println(str.length());

        System.out.println("\nvalueOf(20) + 20");
        System.out.println(String.valueOf(20) + 20);

        System.out.println("\ncharAt(2)");
        System.out.println(str.charAt(2));

        System.out.println("\ngetChars(11, 23, charStr, 0)");
        char[] charStr = new char[12];
        str.getChars(11, 23, charStr, 0);
        System.out.println(charStr);

        System.out.println("\ngetBytes()");
        byte[] byteStr = str.getBytes();
        for (byte i : byteStr)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("\ntoCharArray()");
        char[] charArray = str.toCharArray();
        for(char i : charArray)
            System.out.print(i);
        System.out.println();

        System.out.println("\nequals(\"Hey there..Let's code!!\")");
        System.out.println(str.equals("Hey there..Let's code!!"));
        System.out.println("equals(\"Hey there\")");
        System.out.println(str.equals("Hey there"));

        System.out.println("\nequalsIgnoreCase(\"HEY THERE..LET'S CODE!!\")");
        System.out.println(str.equalsIgnoreCase("HEY THERE..LET'S CODE!!"));
        System.out.println("equalsIgnoreCase(\"HEYA FELLAS\")");
        System.out.println(str.equalsIgnoreCase("HEYA FELLAS"));

        String matchStr = new String("Let's code guys..");
        System.out.println("\nregionMatches(11, matchStr, 0, 10)");
        System.out.println(str.regionMatches(11, matchStr, 0, 10));
        System.out.println("regionMatches(0, matchStr, 11, 5)");
        System.out.println(str.regionMatches(0, matchStr, 11, 5));

        System.out.println("\nstartsWith(\"Hey\")");
        System.out.println(str.startsWith("Hey"));
        System.out.println("startsWith(\"code\")");
        System.out.println(str.startsWith("code"));
        System.out.println("startsWith(\"code\", 17)");
        System.out.println(str.startsWith("code", 17));

        System.out.println("\nendsWith(\"code!!\")");
        System.out.println(str.endsWith("code!!"));
        System.out.println("endsWith(\"code\")");
        System.out.println(str.endsWith("code"));

        System.out.println("\ncompareTo(\"Hey there..Let's code!!\")");
        System.out.println(str.compareTo("Hey there..Let's code!!"));
        System.out.println("compareTo(\"hey\")");
        System.out.println(str.compareTo("hey"));
        System.out.println("compareTo(\"Code\")");
        System.out.println(str.compareTo("Code"));

        System.out.println("\ncompareToIgnoreCase(\"HEY THERE..LET'S CODE!!\")");
        System.out.println(str.compareToIgnoreCase("HEY THERE..LET'S CODE!!"));
        System.out.println("compareToIgnoreCase(\"hey\")");
        System.out.println(str.compareToIgnoreCase("hey"));
        System.out.println("compareToIgnoreCase(\"let's\")");
        System.out.println(str.compareToIgnoreCase("let's"));

        System.out.println("\nindexOf('e')");
        System.out.println(str.indexOf('e'));
        System.out.println("indexOf('e', 4)");
        System.out.println(str.indexOf('e', 4));
        System.out.println("indexOf(\"there\")");
        System.out.println(str.indexOf("there"));

        System.out.println("\nlastIndexOf('e')");
        System.out.println(str.lastIndexOf('e'));
        System.out.println("lastIndexOf('e', 11)");
        System.out.println(str.lastIndexOf('e', 11));
        System.out.println("lastIndexOf(\"Let's\")");
        System.out.println(str.lastIndexOf("Let's"));

        System.out.println("\nsubString(11)");
        System.out.println(str.substring(11));
        System.out.println("subString(11, 16)");
        System.out.println(str.substring(11, 16));

        System.out.println("\nconcat(\" Come on\")");
        System.out.println(str.concat(" Come on"));

        System.out.println("\nreplace('e', 'E')");
        System.out.println(str.replace('e', 'E'));
        System.out.println("replace(\"code\", \"play\")");
        System.out.println(str.replace("code", "play"));

        String trimStr = new String("Heya   ");
        System.out.println("\ntrim(trimStr + \"Fellas\")");
        System.out.println(trimStr + "Fellas");
        System.out.println("trim(trimStr.trim() + \"Fellas\")");
        System.out.println(trimStr.trim() + "Fellas");

        System.out.println("\ntoLowerCase()");
        System.out.println(str.toLowerCase());

        System.out.println("\ntoUpperCase()");
        System.out.println(str.toUpperCase());

        System.out.println("\njoin(\" \", \"Hello\",\"guys\", \"wassup\")");
        System.out.println(String.join(" ", "Hello","guys", "wassup"));
        System.out.println("join(\", \", \"Hello\", \"guys\", \"wassup\")");
        System.out.println(String.join(", ", "Hello", "guys", "wassup"));
    }
}
