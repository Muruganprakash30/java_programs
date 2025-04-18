import java.util.*;
public class hashmap_Longest_occurance {
    public static void main(String agrs[]) {
        String s = "haiggggg    ggggg ggdd ddddd";
        String a ="";
        String arr[] = s.split("\\s+");
        for(String b:arr)
        {
            a+=b;
        }

        LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();
        for (int i = 0; i < s.length();i++)
        {

            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character k:m.keySet())
        {
            if(k==' ')
            {
                continue;
            }
            System.out.print(k);
            System.out.print(m.get(k));

        }
    }
}
//h1a1i1g12d7