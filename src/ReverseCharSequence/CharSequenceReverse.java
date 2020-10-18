package ReverseCharSequence;

public class CharSequenceReverse implements CharSequence
{
    private String str;

    public CharSequenceReverse(String str)
    {
        this.str = str;
    }

    private int fromEnd(int i)
    {
        return str.length() - 1 - i;
    }

    public char charAt(int i)
    {
        if ((i < 0) || (i >= str.length()))
            throw new StringIndexOutOfBoundsException(i);

        return str.charAt(fromEnd(i));
    }

    public int length()
    {
        return str.length();
    }

    public CharSequence subSequence(int start, int end)
    {
        if (start < 0)
            throw new StringIndexOutOfBoundsException(start);

        if (end > str.length())
            throw new StringIndexOutOfBoundsException(end);

        if (start > end)
            throw new StringIndexOutOfBoundsException(start - end);

        StringBuilder subString = new StringBuilder(str.subSequence(start, end+1));
        return subString.reverse();
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder(this.str);
        return s.reverse().toString();
    }

}
