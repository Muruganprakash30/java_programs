import java.util.*;
public class selection_sort
{
    public static void main(String args[])
    {
        int arr[]={1,2,8,9,7,6,5};

        for(int i=0;i<=arr.length-2;i++)
        {

            for(int j=i+1;j<=arr.length-1;j++)
            {
                int min= arr[i];

                if(min>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
[1, 2, 8, 9, 7, 6, 5]
[1, 2, 8, 9, 7, 6, 5]
[1, 2, 5, 9, 8, 7, 6]
[1, 2, 5, 6, 9, 8, 7]
[1, 2, 5, 6, 7, 9, 8]
[1, 2, 5, 6, 7, 8, 9]
[1, 2, 5, 6, 7, 8, 9]
/*