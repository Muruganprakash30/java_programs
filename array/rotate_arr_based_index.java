import java.util.*;
public class rotate_based_index {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));
        int index = 3;
        for (int i = 0; i < arr.length;i+=index)
        {
            int left = i;
            int right = Math.min(i+index-1,arr.length-1);
            while(left<=right)
            {
                int tem = arr[left];
                arr[left] = arr[right];
                arr[right] = tem;
                left++;
                right--;
            }

        }

        for(int k:arr)
        {
            System.out.print(k+" ");
        }
    }
}
/*
[1, 2, 3, 4, 5, 6, 7, 8]
3 2 1 6 5 4 8 7 
/*