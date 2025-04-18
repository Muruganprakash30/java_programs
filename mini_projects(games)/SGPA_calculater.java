import java.util.*;
public class student_grade_calculater
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter how many subject did you have in this semester ");
        int subjects = obj.nextInt();
        int credit_total = 0;
        int overall_total = 0;
        for(int i=0;i<subjects;i++)
        {

            System.out.println("Enter the subject credit points");
            int credit = obj.nextInt();
            credit_total +=credit;
            obj.nextLine();
            System.out.println("enter your grade");
            String grade = obj.nextLine().toUpperCase();
            switch(grade)
            {
                case "O":
                    overall_total +=(credit*10);
                    break;
                case "A+":
                    overall_total +=(credit*9);
                    break;
                case "A":
                    overall_total +=(credit*8);
                    break;
                case "B+":
                    overall_total +=(credit*7);
                    break;
                case "B":
                    overall_total +=(credit*6);
                    break;
                case "C":
                    overall_total +=(credit*5);
                    break;
                default:
                    credit_total -=credit;
            }
        }
        System.out.printf("%.2f",(double)overall_total/credit_total);
    }
}
