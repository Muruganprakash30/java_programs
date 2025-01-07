import java.util.*;

class find_num
{
    public static void main(String args[]) {


        int arr[] = {1, 0, 3, 0, 0, 4};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }

            System.out.println(Arrays.toString(arr));



    }

}
