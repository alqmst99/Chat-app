package chat.realtime.Main.Model;

import app.MessageType;
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

    private MessageType messageType;

    //constructor
    public Model_Recive_Message(Object json) {
        JSONObject obj = (JSONObject) json;
        try {
            //transfor recive, type mesage in value
            messageType = MessageType.toMessageType(obj.getInt("messageType"));
            fromUserId = obj.getInt("fromUserId");
            text = obj.getString("text");
        } catch (JSONException e) {
            System.err.println(e);
        }
    }

    public Model_Recive_Message(int fromUserId, String text, MessageType messageType) {
        this.fromUserId = fromUserId;
        this.text = text;
        this.messageType = messageType;
    }

    //JSONobjetc
    public JSONObject toJSONObject() {
        try {
            JSONObject json = new JSONObject();
            //upadte recive type message 
            json.put("messageType", messageType.getValue());
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

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

}
