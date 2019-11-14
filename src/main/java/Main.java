import java.io.IOException;

/**
 * Описанице, потом напишу
 */

public class Main {
    public static String HOST = "https://dev.oboz.app/";
    public static String SECRET = "f17f413f-91ba-473a-b29a-c26b90c3e93b";

    public static String CARRIER_LOGIN = "career1exp1@petrov.gg";
    public static String CARRIER_PASSWORD = "123456";

    public static String EXPEDITOR_LOGIN = "expeditor1@petrov.gg";
    public static String EXPEDITOR_PASSWORD = "123456";

    public static String VEHICLE_CLASS_UUID = "";
    public static String VEHICLE_SPECIE_UUID = "";
    public static String VEHICLE_TYPE_UUID = "";

    public static String HUMAN_CLASS_UUID = "";
    public static String HUMAN_SPECIE_UUID = "";
    public static String HUMAN_TYPE_UUID = "";

    public static void main(String[] args) throws IOException {
        HttpTools okhttp = new HttpTools();
        SystemTools tool = new SystemTools();



        /**
         * Создаем ресурс
         */
        okhttp.createResource(
                okhttp.userToken(HOST, SECRET, CARRIER_LOGIN, CARRIER_PASSWORD));

        //прост юид
        System.out.println(tool.uuidGenerator());

    }
}

