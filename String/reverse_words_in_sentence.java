import java.util.*;
public class return_words
{

        // Function to reverse words in a given string
        public  static String reverseWords(String s)
        {
            String n = s.trim();
            String arr[]=n.split(" ");
            StringBuilder y = new StringBuilder();
            for(int i=arr.length-1;i>=0;i--)
            {
                y.append(arr[i]).append(" ");
            }

            return y.toString().trim();

        }
        public static void main(String args[])
        {
            System.out.print(reverseWords(" hai hello everyone "));
            
    }
}
