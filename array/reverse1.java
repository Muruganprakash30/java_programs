import java.util.*;
public class Main
{
	public int[] reverse(int arr[])
	{
		int n = arr.length;
		int start = 0;
		int end = n-1;
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,5};
		Main obj = new Main();
		 int[] arr = obj.reverse(a);
		 System.out.println(Arrays.toString(arr));
	}
}