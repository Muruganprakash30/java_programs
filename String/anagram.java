import java.util.*;
public class anagram
{
    public static String  ana(String name,String name1)
    {
        char[] a = name.toCharArray();
        char[] b = name1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            return "anagram";
        }
        else
            return "not";

    }
    public static void main(String args[])
    {
        System.out.println((ana("hellaos","hellsoa")));
    }
}
