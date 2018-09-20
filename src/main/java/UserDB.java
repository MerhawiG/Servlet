import java.util.ArrayList;
import java.util.List;

public class UserDB {
    List<User> userDBS = new ArrayList<>();

    UserDB(){
        userDBS.add(new User("mera","123"));
        userDBS.add(new User("osan","123"));
    }

    public List<User> getUserDBS() {
        return userDBS;
    }
}
