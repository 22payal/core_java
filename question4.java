import java.util.Scanner;
import java.lang.String;

public class question4 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a1=0,a2=0,a3=0,a4=0;

        System.out.println("enter a string");

        String s1 = in.nextLine();

        for (int i = 0; i < s1.length(); i++)
        {

             if(Character.isLowerCase(s1.charAt(i)))
            {
                a1++;
            }
            else if(Character.isUpperCase(s1.charAt(i)))
            {
               a2++;
            }

             else if(Character.isDigit(s1.charAt(i)))
             {
                 a4++;
             }
        }

        a3=a2+a1;

        System.out.println("No. of lowercase characters are : " +a1);
        System.out.println("No. of uppercase characters are : " +a2);
        System.out.println("No. of letters are : " +a3);
        System.out.println("No. of digits are : " +a4);
    }
}
