import java.util.*;
import java.util.Stack;
public class Stack_operation
{
    public static void main(String args[])
    {
        Stack<Character> s = new Stack<>();
        String s1 = "helloheveryone";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ')
            {
                s.push(s1.charAt(i));
            }
        }
        System.out.println(s);


        s.remove('h');
        System.out.println(s);

    }
}
