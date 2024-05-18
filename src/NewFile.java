import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFile {

    public static void main(String[] args)  {
        try {
            String location = "C:\\Users\\DELL\\Desktop\\Tasks\\src\\filelocation2";
            Path path = Paths.get(location);

            BufferedWriter writer = Files.newBufferedWriter(path);

            writer.write("Happy Married Life, Bolaji");
            writer.close();

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
