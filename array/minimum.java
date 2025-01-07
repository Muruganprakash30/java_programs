public class Main
{
	public int minimum(int[] a)
	{
		int n = a.length;
		int min = a[0];
		for(int i = 1;i<n;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String args[])
	{
		int arr[] = {9,8,7,6,5,1,2,3,1};
		Main obj = new Main();
		int result = obj.minimum(arr);
		System.out.println(result);
	}
}
	