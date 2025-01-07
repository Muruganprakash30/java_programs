public class Main
{
	public void reverse(int arr[])
	{
		int n= arr.length;
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void main(String args[])
	{
		Main obj = new Main();
		int a[] = {1,2,3,4,5};
		obj.reverse(a);
	}
}
		