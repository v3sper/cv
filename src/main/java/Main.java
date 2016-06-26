import com.fasterxml.jackson.databind.ObjectMapper;
import models.Cv;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.Charset;

public class Main {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Main.class.getClassLoader();
        File file = new File(classLoader.getResource("cv.json").getFile());
        String s = FileUtils.readFileToString(file, Charset.forName("UTF-8"));
        Cv cv = objectMapper.readValue(s.getBytes(), Cv.class);

        Serializer serializer = new Serializer("c:\\temp\\");
        serializer.serializeToFile(cv);
    }
}
