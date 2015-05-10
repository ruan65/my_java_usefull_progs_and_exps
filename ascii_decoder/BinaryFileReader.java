import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BinaryFileReader {


    public static void main(String[] args) {

        String content;

        try {

            String fileName = args[0];

            content = new String(Files.readAllBytes(Paths.get(args[0])));

            String[] decodes = content.split("\\W+");

            String res = "";

            for (String s : decodes) {

                res += (char) Integer.parseInt(s, fileName.startsWith("b") ? 2 : fileName.startsWith("d") ? 10 : 16);
            }
            System.out.println(res);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
