package chat.realtime.app.Main.Model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Model_Login {

    private String username;
    private String Password;

    public JSONObject toJsonObject() {
        try {
            JSONObject obj = new JSONObject();
            obj.put("userName", username);
            obj.put("password", Password);
            return obj;
        } catch (JSONException e) {

            return null;
        }
    }

    //constructors
    public Model_Login() {
    }

    public Model_Login(String username, String Password) {
        this.username = username;
        this.Password = Password;
    }

    //getters & setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    //init Json 
}
