import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.lang.String;

public class question2 {

    public static void main(String[] args) {

        int count=0,len;

        Scanner in = new Scanner(System.in);

        System.out.println("enter a string ");

        String s1 = in.nextLine();

        String[] items = s1.split(" ");

        len = items.length;

        //List<String> itemList = Arrays.asList(items);
        for (int i = 0; i <len; i++)
        {

            System.out.println(items[i]);

        }


        for (int i = 0; i < len-1; i++)
        {
            for (int j =i+1; j < len; j++)
            {
                if  ((items[i].compareTo(items[j])) == 0)
                {
                    System.out.println("duplicate word :- "+ items[i]);
                    count++;
                }
            }


        }

        System.out.println("occurance of duplicate words are: "+ count);
    }
}
