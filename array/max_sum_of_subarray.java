import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	   int arr[] = {-2,1,-3,4,-1,2,1,-5,-9};
	   int s = 0;
	   int v = 0;
	   int e = 0;
	   int sum = 0;
	   int max = Integer.MIN_VALUE;
	   for(int i=0;i<arr.length;i++)
	   {
	       sum+=arr[i];
	       if(sum>max)
	       {
	           max = sum;
	           e = i;
	           v = s;
	       }
	       else if(sum<1)
	       {
	           sum = 0;
	        
	           s = i+1;
	       }
	       
	   }
	   for(int i=v;i<=e;i++)
	   {
	       System.out.print(arr[i]+" ");
	   }
	   System.out.println("\n"+max);
	}
	}
	