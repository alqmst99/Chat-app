

package chat.realtime.app.Main.Model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Model_Recive_Message {
    
    private int fromUserId;
  
    private String text;
    
    //constructor

    public Model_Recive_Message(Object json) {
        JSONObject obj= (JSONObject) json;
        try {
            fromUserId= obj.getInt("fromUserId");
            text= obj.getString("text");
        } catch (JSONException e) {
     System.err.println(e);
        }
    }

    public Model_Recive_Message(int fromUserId, String text) {
        this.fromUserId = fromUserId;
        this.text = text;
    }

  
    
    //JSONobjetc
    
    public JSONObject toJSONObject(){
        try {
            JSONObject json= new JSONObject();
            json.put("fromUserId", fromUserId);
            json.put("text", text);
            return json;
               
            
        } catch (Exception e) {
        return null;
        }
    }
    
    //getters and setters

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

  
    

}
