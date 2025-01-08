import java.util.*;
public class num
{
    public static void main(String args[])
    {
        int num = 12345678;
        int digit = (int)Math.log10(num)+1;
        int arr[] = new int[digit];
        for(int i=digit-1;i>=0;i--)
        {
            int sum = num%10;
            arr[i]=sum;
            num/=10;
        }
        for(int k:arr)
        {
            boolean flag = true;
          if(k>1)
          {
              for(int i=2;i<=Math.sqrt(k);i++)
              {
                  if(k%i==0)
                  {
                      flag = false;
                      break;
                  }
              }
              if(flag)
              {
                  System.out.print(k+" ");
              }
          }
        }
    }
}
