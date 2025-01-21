class main
{
    public static void main(String args[])
    {
        String name = "murugan";
        for (int i=0;i<name.length();i++)
        {
            for (int j =0;j<name.length();j++)
            {
                if(i==0)
                {
                    System.out.print(name.charAt(j)+" ");
                }
                else if(i==name.length()-1)
                {
                    System.out.print(name.charAt(j)+" ");
                }
                else if(j==name.length()-1-i)
                {
                    System.out.print(name.charAt(j));
                }
               
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}