import java.util.*;
public class longest_cosecative
{
    public static void main(String args[])
    {
        int arr[]= {1, 1, 0, 0,0,0,0, 1, 0, 1, 0, 1, 1, 1, 1};
        int result = 0;
        int count = 0;
        int res = 0;
        int c = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count = 0;
            }
            else {
                count++;
                result = Math.max(result,count);
            }
            if(arr[i]==1)
            {
                c = 0;
            }
            else {
                c++;
                res = Math.max(res,c);
            }
        }
        System.out.println(result);
        System.out.println(res);
    }
}
/*
4
5
/*