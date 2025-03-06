package chat.realtime.app.Service;

import io.socket.client.IO;
import io.socket.client.Socket;
import java.net.URISyntaxException;
import javax.swing.JTextArea;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Service {

 
    
    private static Service instance;
    private Socket client;
  
    private final int PORT_NUMBER = 9999;
    private final String IP = "localhost";
    
    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }
    
    private Service() {
      
    }
    
    public void startServer() {
        try {
              client = IO.socket("http://" + IP + ":" + PORT_NUMBER);
      
            getClient().open();
     
        } catch (URISyntaxException e) {
            error(e);
        }
      
    }
    
       /**
     * @return the client
     */
    public Socket getClient() {
        return client;
    }
    
    private void error(Exception e){
        System.err.println(e);
    }
}
