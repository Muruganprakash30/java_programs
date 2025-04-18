import java.util.*;
class Paranthesis_cheak {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '[' || a == '{' || a == '(') {
                st.push(a);

            } else {
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char b = st.pop();
                if ((a == ']' && b != '[') || (a == '}' && b != '{') || (a == '(' && b != ')')) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}
/*
[[{{}}]](
false
/*