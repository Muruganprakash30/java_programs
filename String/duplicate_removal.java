public class duplicate_removal
{
    public static String remove(String name)
    {
        String name1 ="";
        for(int i=0;i<name.length();i++)
        {
            String s = String.valueOf(name.charAt(i));
            if(!name1.contains(s))
            {
                name1+=name.charAt(i);
            }
        }
        return name1;
    }
    public static void main(String args[])
    {
        System.out.println(remove("hello"));
    }
}
/*
helo
/*