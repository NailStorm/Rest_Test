import java.util.UUID;

public class SystemTools {

    public String uuidGenerator(){
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        return randomUUIDString;
    }
}
