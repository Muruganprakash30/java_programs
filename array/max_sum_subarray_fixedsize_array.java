import java.util.*;
public class Main
{

public static void main(String args[])
{
    int arr[] = {4,5,9,7,8,2,8,7,9};
    int k =3;
    int sum = 0;
    int st = 0;
    int end =k;
    for(int i=0;i<k;i++)
    {
        sum+=arr[i];
    }
    
    int max = sum;
    int s = 0;
    int l =0;
    int e = arr.length-k;
    while(s<e)
    {
        l++;
        sum = (sum - arr[s])+arr[k];
          if(sum>max)
        {
            max = sum ;
            st+=l;
            end +=l;
             l =0;
        }
       
        s++;
        k++;
      
    }
    System.out.println(max);
    for(int i=st;i<end;i++)
    {
        System.out.print(arr[i]+" ");
    }
}

}