import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class BoxReader {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Box box = objectMapper.readValue(new File("box.json"), Box.class);

            System.out.println("Box created from JSON: " + box.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
