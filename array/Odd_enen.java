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
            if(k%2==0)
            {
                System.out.printf("%d-Even\n",k);
            }
            else {
                System.out.printf("%d-Odd\n",k);
            }
        }
    }
}
