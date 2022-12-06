package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class TestConfig {

    static FileInputStream fs;
    static Properties prop = new Properties();

    public static String readConfig(String fileName, String key) {
        try {
            fs = new FileInputStream(fileName);
            prop.load(fs);

        } catch (Exception ex) {
            ex.getMessage();
        }
        return prop.getProperty(key);
    }
}
