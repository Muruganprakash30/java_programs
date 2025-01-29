import java.util.*;
public class longestfre_in_Strng
{
    public static void main(String args[])
    {
        String name = "helloooooooooo everyone hhhhhh";
        char v ='1';
        int count = 0;
        int high = 0;
        for(int i=0;i<name.length()-1;i++)
        {
            count = 1;
            for(int j=i+1;j<name.length();j++)
            {
                if(name.charAt(i)==name.charAt(j))
                {
                    count++;
                    i++;
                }
                else {
                    break;
                }
            }
            if(count>=high)
            {
                v = name.charAt(i);
                high = count;
            }
        }
        System.out.printf("%c:%d",v,high);
    }
}
/*
o:10
/*