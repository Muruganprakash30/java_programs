import java.util.*;
public class Main
{
	public Boolean palindrome(String name)
	{
		int n = name.length();
		int start =0;
		int end = n-1;
		char arr[] = name.toCharArray();
		while(start <end)
		{   if( arr[start] != arr[end])
			{
				return false;
			}
			else
			{
				start++;
				end--;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		Main obj1 = new Main();
		System.out.println(obj1.palindrome(name));
	}
}

  			
	     
			
		