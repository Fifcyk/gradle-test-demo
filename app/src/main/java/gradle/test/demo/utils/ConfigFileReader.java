package gradle.test.demo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private static Properties getConfigProperty() {
        Properties props = new Properties();
        String configFilePath = "app/src/main/resources/browser.config";
        try (FileInputStream fileInputStream = new FileInputStream(configFilePath)) {
            props.load(fileInputStream);
        } catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException(String.format("Couldn't find config file: %s", configFilePath));
        } catch (IOException ioException) {
            System.err.printf("Caught IOException: %n%s", ioException.getMessage());
            System.exit(0);
        }
        return props;
    }

    public static String getProperty(String propertyKey) {
        return getConfigProperty().getProperty(propertyKey);
    }

}
