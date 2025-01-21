import java.util.*;
public class vowels_change
{
    public  static String vowels_remov(String name)
    {
        String vowels = "";
        for(int i=0;i<name.length();i++)
        {
            char c = name.charAt(i);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
            {
                vowels+="*";
            }
            else {
                vowels+="#";
            }

        }
        return vowels;
    }
    public static void main(String args[])
    {
        System.out.println(vowels_remov("hello"));
    }
}
