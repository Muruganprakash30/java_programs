import java.util.*;
public class Main
{
    public void fun(int[] arr)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int[] demo()
    {
        int arr[]=new int[4];
        arr[0]=1;
        arr[2]=3;
        fun(arr);
        return arr;
    }
    public static void main(String args[])
    {
        Main obj = new Main();
         int arr1[] = obj.demo();
        System.out.println(Arrays.toString(arr1));
    }
}