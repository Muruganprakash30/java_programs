import java.util.*;
public class uniq_check
{
    public void uniq_ele(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = true;
            for(int j = 0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        flag = false;
                        break;
                    }

                }
            }
            if(flag)
            {
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String args[])
    {
        int[] arr={1,2,3,2,3,1,2,6,7};
        uniq_check obj =new  uniq_check();
        obj.uniq_ele(arr);

    }

}
