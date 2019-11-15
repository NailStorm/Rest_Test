import java.util.Random;

public class JsonBuilder {

    public String resourceJson (String classUuid, String speciesUuid, String typeUuid){

        Random r = new Random();
        int i = r.nextInt(899 - 0) + 100;

        String body = "{\"country_code\":\"rus\"," +
                "\"class_uuid\":\""+ classUuid +"\"," +
                "\"species_uuid\":\""+ speciesUuid +"\"," +
                "\"type_uuid\":\""+ typeUuid +"\"," +
                "\"title\":\"о"+ i +"оо"+ i +"\"," +
                "\"is_active\":true}";

        return body;
    }
}
