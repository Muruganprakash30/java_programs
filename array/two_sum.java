import java.util.*;
public class two_sum{
    public int[] twosum(int[] arr, int target) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return null;

    }

    public static void main(String args[]) {


        int arr[] = {1, 0, 9, 8, 7, 6, 0, 0, 3};
        int total = 9;
        two_sum obj = new two_sum();
        int a[] = obj.twosum(arr, total);
        System.out.println(Arrays.toString(a));
    }
}


