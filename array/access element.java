import java.util.*;
 class second
{
    public void mainn(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Main obj = new Main();
        int []arr = {1,2,3,4,5};
        obj.mainn(arr);

        System.out.println(Arrays.toString(arr));
    }
}