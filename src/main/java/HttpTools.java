import okhttp3.*;
import org.json.JSONObject;
import java.io.IOException;

public class HttpTools {

    /**
     * Получение токена
     */
    public String userToken(String host, String secret, String login, String password) throws IOException {
        String token;

        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("client_id", "oboz2-backend")
                .add("username", login)
                .add("password", password)
                .add("grant_type", "password")
                .add("client_secret", secret)
                .build();

        Request request = new Request.Builder()
                .url(host + "auth/realms/oboz2/protocol/openid-connect/token")
                .post(formBody)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();
        String result = response.body().string();
        response.close();

        JSONObject json = new JSONObject(result);
        System.out.println(result);
        token = (String) json.get("access_token");

        return  token;
    }


    /**
     * Создаем фуру
     */
     public void createResource(String token, String classUuid, String speciesUuid, String typeUuid){
         JsonBuilder json = new JsonBuilder();
         String body = json.resourceJson(classUuid,speciesUuid, typeUuid);

         OkHttpClient client = new OkHttpClient();

     }

}