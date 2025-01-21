import java.util.*;
class leftup_triangle
{
 public static void main(String args[])
 {
     Scanner obj = new Scanner(System.in);
     int num = obj.nextInt();
     for(int i=1;i<=num;i++)
     {
         for(int j=1;j<=2*(num-i)+1;j++)
         {
             System.out.print("* ");
         }

         System.out.println();
     }
 }
}

/*
6
* * * * * * * * * * * 
* * * * * * * * * 
* * * * * * * 
* * * * * 
* * * 
* 
/*