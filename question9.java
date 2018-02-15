import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question9 {
    public static void main(String[] args) {

        StringBuilder content = new StringBuilder();

        try (BufferedReader br  = new BufferedReader(new FileReader("/home/payal/Desktop/java/file1.txt"))){
            String line;
            while((line = br.readLine()) != null) {
                content.append(line).append('\n');
            }
        }
        catch (IOException err){
            err.printStackTrace();
        }
        System.out.println(content.toString());
    }
}