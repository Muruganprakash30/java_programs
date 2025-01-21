import java.util.*;
public class even_length_word
{
    public  static void check (String line)
    {
        String arr[] = line.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String args[])
    {
        String s = "ha every one .. hello";
        check(s);
    }

}
