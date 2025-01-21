import java.util.*;
public class bubble
{
    public static void main(String args[])
    {
        int arr[] = {1,2,4,1,2,3,5};
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
			System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*(output)  

[1, 2, 4, 1, 2, 3, 5]
[1, 1, 4, 2, 2, 3, 5]
[1, 1, 2, 4, 2, 3, 5]
[1, 1, 2, 2, 4, 3, 5]
[1, 1, 2, 2, 3, 4, 5]
[1, 1, 2, 2, 3, 4, 5]

/*