import java.util.*;
public class Main
{
    int[]  fun(int arr1[])
{
    int n = arr1.length;
    int odd = 0;
    for(int i=0;i<n;i++)
    {
        if(arr1[i]%2 !=0)
        {
            odd++;
        }
    }
    int array[] =new int[odd];
    int even =0;
    for(int i=0;i<arr1.length;i++)
    {
        if(arr1[i]%2!=0)
        {
            array[even] = arr1[i];
            even++;
        }
    }
    return array;
}
public static void main(String args[]) {
    Main obj = new Main();
    int a[] = {3,2,4,7,10,6,5};
  int[] result = obj.fun(a);
  System.out.println(Arrays.toString(result));
}

}