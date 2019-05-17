package User;

import java.util.HashMap;
import java.util.Map;

public class UserDB {

    Map<String, String> userDB = new HashMap<>();

    public void get(String username, String password){
        userDB.put(username, password);
    }

}
