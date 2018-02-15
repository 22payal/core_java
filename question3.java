
import java.util.Scanner;
import java.lang.String;

    public class question3 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("enter a string ");

            String s1 = in.nextLine();

            System.out.println("enter the character");

            String s2 = in.nextLine();

            int charcount = s1.length() - s1.replaceAll(s2, "").length();
            System.out.println("Occurrence Of A Char In String: " + charcount);

        }
    }

