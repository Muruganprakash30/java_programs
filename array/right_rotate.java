import java.util.*;
public class rotate_rigtht
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int r = 10;
        for(int i=0;i<r;i++)
        {
            int num = arr[arr.length-1];
            for(int j =arr.length-1;j>=1;j--)
            {
               arr[j] = arr[j-1];
            }
            arr[0] = num;
        }
        System.out.println(Arrays.toString(arr));
    }
}
