import java.util.*;
public class third_max
{
    public static void main(String args[])
    {
        int arr[]={1, -4, 3, -6, 7, 0};
        int max = Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                third = sec_max;
                sec_max=max;
                max = arr[i];
            }
            else if(arr[i]!=max && arr[i]>sec_max)
            {
                third = sec_max;
                sec_max = arr[i];
            }
            else if(arr[i]!=sec_max && arr[i]>third)
            {
                third = arr[i];
            }
            if(arr[i]<min)
            {
                min1 = min;
                min = arr[i];
            }
            else if(arr[i]!=min && arr[i]<min1)
            {
                min1 = arr[i];            }
        }
        System.out.println(max);
        System.out.println(sec_max);
        System.out.println(third);
        System.out.println(min);
        System.out.println(min1);
        System.out.println(Math.max(max*sec_max*third,min*min1*max));

    }
}
/* 
7
3
1
-6
-4
168
/*