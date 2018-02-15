import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.lang.String;

public class question2 {

    public static void main(String[] args) {

        int count=1,len;

        Scanner in = new Scanner(System.in);

        System.out.println("enter a string ");

        String s1 = in.nextLine();

        String[] items = s1.split(" ");

        len = items.length;

        for (int i = 0; i <len; i++)
        {

            System.out.println(items[i]);

        }


        for (int i = 0; i < len-1; i++)
        {
            for (int j =i+1; j < len; j++) {
                if ((items[i].compareTo(items[j])) == 0) {
                    count++;
                }
            }

                if(count>1)
                {
                    System.out.println("duplicate word "+ items[i]+" has occured"+count +"times");
                }

                count=1;


        }

      //  System.out.println("occurance of duplicate words are: "+ count);
    }
}
