public class count {
    public static void main(String args[])
    {
        int num =1234454;
        int count = 0;
        while(num>0)
        {
            num = num/10;
            count ++;
        }
        System.out.println(count);

    }
}
