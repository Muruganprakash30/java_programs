import java.util.*;
public class Produnct_excp_current {



            public int[] multi_arr(int[] arr)
            {
                int res[]=new int[arr.length];

                for(int i=0;i<arr.length;i++)
                {
                    int sum = 1;
                    for(int j=0;j<arr.length;j++)
                    {
                        if (j != i)
                        {
                            sum = sum * arr[j];

                        }
                    }
                    res[i] = sum;


                }

                return res;
            }
            public static void main(String args[])
            {
                int[] arr = {1,2,3,4};
                Produnct_excp_current obj = new Produnct_excp_current();
                int a[] = obj.multi_arr(arr);
                System.out.println(Arrays.toString(a));
            }



}
