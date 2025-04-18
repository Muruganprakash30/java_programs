import java.util.*;
public class guess_number {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        long num = 123;
        long n = 0;
        while (n != num) {
            try {
                System.out.println("enter the number");
                n = obj.nextInt();
                if (n > num) {
                    System.out.println("greater");
                } else if (n < num) {
                    System.out.println("Lower");
                } else {
                    System.out.println("correct");

                }
            } catch (Exception e) {
                System.out.println("enter the valid number");
                obj.nextLine();
            }
        }
    }
}
