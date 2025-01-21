class mainn
{
    public static void main(String args[])
    {
        String name = "muruga";
        for(int i =0;i<name.length();i++) {
            for (int j = 0; j < name.length(); j++) {
                if (i == j) {
                    System.out.print(name.charAt(i));
                } else if (j == name.length() - 1 - i) {
                    System.out.print(name.charAt(j));
                } else if (j == name.length() - 1 - i) {
                    System.out.print(name.charAt(i));
                    break;
                } else {
                    System.out.print(" ");
                }
            }

                if (i+1 == name.length() / 2) {
                    break;
                }
                else {

                    System.out.println();
                }
            }

              
        }
    }
