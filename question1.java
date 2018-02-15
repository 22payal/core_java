import java.util.Scanner;
import java.lang.String;

public class question1 {

    public static void main(String[] args) {

        int count=0,len;

        Scanner in = new Scanner(System.in);

        System.out.println("enter a string ");

        String s1 = in.nextLine();

        System.out.println("enter a  sub string you want to replace");

        String s2 = in.nextLine();

        System.out.println("enter a  sub string you want to replace it with");

        String s3 = in.nextLine();

        String s4 = s1.replace(s2,s3);

        System.out.println("Changed string is : " + s4);
    }
}
