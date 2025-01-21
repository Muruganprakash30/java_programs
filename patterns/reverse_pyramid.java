import java.util.*;
public class reverse_pyramid {
    public static void main(String args[]) {


        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        for (int i = 0; i < num; i++) {
            if (i > 0) {
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2 * (num - i) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
/*
5
* * * * * * * * * 
 * * * * * * * 
   * * * * * 
     * * * 
       * 
\*	   
	   
	   
	   