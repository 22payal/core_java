

public class question8 {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Geeks for geeks");
        buffer.reverse();
        System.out.println("reversed string "+ buffer);

        buffer.delete(4,9);
        System.out.println("changed string is "+ buffer);



    }
}
