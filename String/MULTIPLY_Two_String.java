import java.util.*;
public class String_multiplication
{
    public static void main(String args[])
    {
        String s = "12";
        String v ="12";
        int arr[]=  new int[s.length()+v.length()];
        StringBuffer a = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j=v.length()-1;j>=0;j--)
            {
                int mul = (s.charAt(i)-'0')*(v.charAt(j)-'0');
                int sum = arr[i+j+1]+mul;
                arr[i+j+1] = sum%10;
                arr[i+j] = sum/10;
            }
        }
        for(int k:arr)
        {
            if(!(a.length()==0 && k==0))
            {
                a.append(k);
            }
        }
        System.out.println(Integer.valueOf(a.toString()));
       
    }
}
