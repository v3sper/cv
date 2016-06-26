import annotations.ToFile;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Cv;
import models.Identifiable;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;

public class Serializer {
    private ObjectMapper objectMapper;
    private String rootPath;

    public Serializer(String rootPath) {
        this.rootPath = rootPath;
        objectMapper = new ObjectMapper();
    }

    public void serializeToFile(Cv cv) throws Exception {
        serializeToFile(cv, "cv");
    }

    private void serializeToFile(List<Identifiable> objectList, String type) throws Exception {
        for (Identifiable identifiable : objectList) {
            writeToFile(identifiable, type);
            scan(identifiable);
        }
    }

    private void serializeToFile(Identifiable object, String type) throws Exception {
        writeToFile(object, type);
        scan(object);
    }

    private void scan(Identifiable object) throws Exception {
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(ToFile.class)) {
                String type = field.getAnnotation(ToFile.class).value();
                field.setAccessible(true);
                Object fieldValue = field.get(object);
                if (fieldValue instanceof Collection<?>) {
                    serializeToFile((List<Identifiable>) fieldValue, type);
                } else {
                    serializeToFile((Identifiable) fieldValue, type);
                }
            }
        }
    }

    private void writeToFile(Identifiable object, String type) throws Exception {
        String value = objectMapper.writeValueAsString(object);
        File file = new File(rootPath + "\\" + type + "\\" + object.getId());
        FileUtils.writeStringToFile(file, value, Charset.forName("UTF-8"));
    }
}
