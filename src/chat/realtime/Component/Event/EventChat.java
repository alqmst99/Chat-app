
package chat.realtime.Component.Event;

import chat.realtime.Main.Model.Model_Recive_Message;
import chat.realtime.Main.Model.Model_Send_Message;

/**
 *
 * @author Nahuel N Pierini
 * @enterprise FSTailSolutioN
 */
public interface EventChat {

    public void sendMessage(Model_Send_Message data);
    public void reciveMessage(Model_Recive_Message data);
    
}
