import java.util.*;
public class pyramid
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=2*(num-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*output
 5
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
/*