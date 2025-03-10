
package chat.realtime.app.Component.Event;


/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class PublicEvent {

   private static PublicEvent instance;
   
   private EventImageView eventImageView;
   
   private EventChat eventChat;
   
   private EventLogin eventLogin;
   
   private EventMain eventMain;
   
   private EventMenuLeft eventLeft;
   
     private PublicEvent(){
       
   }
     
  public static PublicEvent getInstance(){
       
       if(instance== null){
           instance= new PublicEvent();
       }
       
       return instance;
   }
   
  public void addEventMain(EventMain event){
      this.eventMain= event;
  }
  public void addEventLogin(EventLogin event){
      this.eventLogin = event;
  }
  
   public void addEventImageView( EventImageView event){
       this.eventImageView = event;
   }
   
   public void addEventChat(EventChat event){
       this.eventChat= event;
   }
   
   public EventMain getEventMain(){
       return eventMain;
   }
   
   public EventLogin getEventLogin(){
       return eventLogin;
   }
   
   public  EventImageView getEventImageView(){
       return eventImageView;
   }
   
   public EventChat getEventChat(){
       return eventChat;
   }

    public EventMenuLeft getEventLeft() {
        return eventLeft;
    }

    public void addEventLeft(EventMenuLeft event) {
        this.eventLeft = event;
    }
   
 
    
}
