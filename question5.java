import java.util.Scanner;

public class question5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number of elements in array1");

        int n1 = in.nextInt();

        int arr1[] = new int[n1];

        System.out.println("enter number of elements in array2");

        int n2 = in.nextInt();

        int arr2[] = new int[n2];

        System.out.println("enter elements of array 1");

        for (int i = 0; i < n1; i++) {//for reading array
            arr1[i] = in.nextInt();

        }
/*
        for (int i : arr1) {

            System.out.println(i);

        }

*/

        System.out.println("enter elements of array 2");

        for (int i = 0; i < n2; i++) {//for reading array
            arr2[i] = in.nextInt();

        }

        System.out.println("common elements between two arrays");

        for (int i = 0; i <n1 ; i++) {

            for (int j = 0; j <n2 ; j++) {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]);
                }

            }

        }


    }

}
