import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Описанице, потом напишу
 */

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        HttpTools okhttp = new HttpTools();
        SystemTools tool = new SystemTools();

        FileInputStream config =
                new FileInputStream("src/main/resources/config.properties");
        Properties property = new Properties();
        property.load(config);

        /**
         * Создаем ресурс
         */
        okhttp.createResource(
                okhttp.userToken(
                        property.getProperty("host"),
                        property.getProperty("secret"),
                        property.getProperty("carrier.login"),
                        property.getProperty("carrier.password")
                ),
                property.getProperty("vehicle.class.uuid"),
                property.getProperty("vehicle.specie.uuid"),
                property.getProperty("vehicle.type.uuid")
        );

        //прост юид
        System.out.println(tool.uuidGenerator());

    }
}

