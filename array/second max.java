public class Main
{
	public int secondmax(int arr[])
	{
		int n= arr.length;
		int max = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				second = max;
				max = arr[i];
			}
			else if(arr[i]>second && arr[i]!=max)
			{
				second = arr[i];
			}
		}
		return second;
	}
	public static void main(String args[])
	{
		int a[] = {1,3,4,5,6,7,8,9,10};
		Main obj = new Main();
		System.out.println(obj.secondmax(a));
	}
}
