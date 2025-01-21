public class pattern {
    public static void main(String args[])
    {
        String name = "vignesh";
        for (int i=0;i<name.length();i++)
        {
            for(int j=0;j<name.length();j++)
            {
                if(name.charAt(i)==name.charAt(j) || j == name.length()-i-1)
                {
                    System.out.print(name.charAt(i));
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
