import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class Yaml {
    InputStream inputStream = new FileInputStream(new File("output.yml"));

    Yaml yaml = new Yaml();
    Map<String, Object> data = yaml.load(inputStream);

    public Yaml() throws FileNotFoundException {
    }

    private Map<String, Object> load(InputStream inputStream) {
        return null;
    }


}
