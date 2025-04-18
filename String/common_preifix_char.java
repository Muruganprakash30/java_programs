import java.util.*;
class common_prefix_word
{
    public static void main(String args[])
    {
    String s = "hai haile haillo haive";
    StringBuffer n = new StringBuffer();
    String arr[] = s.split(" ");
    Arrays.sort(arr);
    String v = arr[0];
    String v1 =  arr[arr.length-1];
    for(int i=0;i<Math.min(v.length(),v1.length());i++)
    {
        if (v.charAt(i) == v1.charAt(i) )
        {
            n.append(v.charAt(i));

        }

        else {
            break;
        }
    }
    System.out.println(String.valueOf(n));


    }
}
//hai