

package chat.realtime.Main.Model;

import app.MessageType;
import org.json.JSONObject;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Model_Send_Message {
    
    private MessageType messageType;
    private int fromUserId;
    private int toUserId;
    private String text;
    
    //constructor

    public Model_Send_Message(MessageType messageType, int fromUserId, int toUserId, String text) {
        this.messageType = messageType;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.text = text;
    }

    
    
    //JSONobjetc
    
    public JSONObject toJSONObject(){
        try {
            JSONObject json= new JSONObject();
            json.put("messageType", messageType.getValue());
            json.put("fromUserId", fromUserId);
            json.put("toUserId", toUserId);
            json.put("text", text);
            return json;
               
            
        } catch (Exception e) {
        return null;
        }
    }
    
    //getters and setters

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

   
    

}
