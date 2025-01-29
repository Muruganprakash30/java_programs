import java.util.*;
public class longfr {
    public static void main(String args[]) {
        int arr[] = {1,1,1,2,2,2,2,4,4,4,4,4,4,4};
        int value = 0;

        int high = 1;
        for (int i = 0; i < arr.length - 1; i++) {
           int  count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            if (count >= high) {
                value = arr[i];
                high = count;

            }

        }
        System.out.println(value + " " + high);
    }
}
/*
4 7
/*