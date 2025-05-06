
package chat.realtime.Main.Model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Model_Register {

   //getters and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

  
    public String getPassword() {
        return password;
    }

  
    public void setPassword(String password) {
        this.password = password;
    }

    //constructors void and complete 
    public Model_Register() {
    }

    public Model_Register(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    
    
    
    private String userName;
    private String password;
    
    public JSONObject toJsonObject(){
        try {
              JSONObject json= new JSONObject();
        json.put("userName", userName);
        json.put("password", password);
        return json;
        } catch (JSONException e) {
            return null;
        }
    }
}
