import java.util.*;
public class left_triangle
{
 public static void main(String args[])
 {
     Scanner obj = new Scanner(System.in);
     int num = obj.nextInt();
     for(int i=1;i<=num;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print("* ");
         }
         

         System.out.println();
     }
 }
}
/*
6
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
/*
