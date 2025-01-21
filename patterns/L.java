import java.util.*;
public class L {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        for (int i = 0; i < name.length();i++)
        {
            for(int j=0;j<name.length();j++)
            {
                if(i ==0 )
                {
                   System.out.println(name.charAt(j));
                }
                if(i==name.length()-2)
                {
                    System.out.print(name.charAt(name.length()-1-j)+ " ");
                }
                
            }
        }
    }
}

