import java.util.Scanner;
import java.lang.String;

public class question4 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a1=0,a2=0,a3=0,a4=0,len=0,sp=0,others=0;
        float a5=0,a6=0,a7=0,a8=0,sp1=0;

        System.out.println("enter a string");

        String s1 = in.nextLine();

        len=s1.length();

        for (int i = 0; i < len; i++)
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

            

             else if (((int)(s1.charAt(i))>=33) && ((int)(s1.charAt(i))<=42))
             {
                 sp++;
             }

             else
           {
            others++;
           }
        }

        a3=a2+a1;

        System.out.println("No. of lowercase characters are : " +a1);
        System.out.println("No. of uppercase characters are : " +a2);
        System.out.println("No. of letters are : " +a3);
        System.out.println("No. of digits are : " +a4);
        System.out.println("No. of special characters are : " +sp);

        sp1=(sp*100)/len;


        a5=(a1*100)/len;

        a6=(a2 * 100)/len;
        a7=(a3 *100)/len;
        a8=(a4*100)/len;


        System.out.println("Percentage of special characters in the string are : " + sp1);

        System.out.println("Percentage of lowercase characters in the string are : " + a5);

        System.out.println("Percentage of uppercase characters in the string are : " + a6);
        System.out.println("Percentage of letters in the string are : " + a7);
        System.out.println("Percentage of digits in the string are : " + a8);

    }
}
