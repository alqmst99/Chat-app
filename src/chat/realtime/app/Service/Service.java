package chat.realtime.app.Service;

import chat.realtime.app.Component.Event.PublicEvent;
import chat.realtime.app.Main.Model.Model_Recive_Message;
import chat.realtime.app.Main.Model.Model_User_Account;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
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

   
    private Model_User_Account user;
    
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
              client.on("list_user", new Emitter.Listener() {
                  @Override
                  public void call(Object... os) {
                      // list user
                      List<Model_User_Account> users = new ArrayList<>();
                      for(Object o : os){
                         Model_User_Account u = new Model_User_Account(o);
                         if(u.getId() != user.getId()){
                             users.add(u);
                         }
                          
                      }
                      PublicEvent.getInstance().getEventLeft().newUser(users);
                     
                  }
              });
              client.on("user_status", new Emitter.Listener() {
                  @Override
                  public void call(Object... os) {

                      int userId=(Integer) os[0] ;
                      boolean status= (boolean) os[1];
                      if(status){
                          //connect
                          PublicEvent.getInstance().getEventLeft().userConnect(userId);
                      } else{
                          //disconect
                          PublicEvent.getInstance().getEventLeft().userDisconect(userId);
                      }
                  }
              });
              client.on("recive_ms", new Emitter.Listener() {
                  @Override
                  public void call(Object... os) {
                      
                      Model_Recive_Message message = new Model_Recive_Message(os[0]);
                      PublicEvent.getInstance().getEventChat().reciveMessage(message);
                      
                  }
              });
            client.open();
     
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
        System.err.print(e);
    }
    
 public Model_User_Account getUser() {
        return user;
    }

    public void setUser(Model_User_Account user) {
        this.user = user;
    }
}
