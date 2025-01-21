import java.util.*;
public class add_words
{
    public static String add_word(String sentence,int index,String add)
    {
        String news = "";
        for(int i=0;i<sentence.length();i++)
        {
            if(i==index)
            {
                news+=add;
            }

                news+=sentence.charAt(i);
        }
        return news;
    }
    public static void main(String args[])
    {
        System.out.println(add_word("hello everyone",6,"hai "));
    }
}
