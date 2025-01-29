import java.util.*;
public class median
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8};
        int num = arr.length;
        if(num%2==0)
        {
            double med = (arr[(num/2-1)]+arr[(num/2)])/2.0;
            System.out.printf("%.2f",med);
        }
        else {
            System.out.printf("%.2f",(double)arr[num/2]);
        }
    }
}
/*
4.50
*/