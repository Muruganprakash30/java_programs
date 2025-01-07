class reveerse
{
    public static void main(String args[])
    {
      int num = 12345;
      String num1 = String.valueOf(num);
      for(int i=num1.length()-1;i>=0;i--)
      {
          //System.out.print(num1.charAt(i));
      }

      int n =0;
      int rev = 0;
      while(num>0)
      {
          n = num%10;
          rev = (rev*10)+n;
          num = num/10;
      }
        System.out.println(rev);

    }
    }