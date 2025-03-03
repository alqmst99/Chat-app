
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
   
     private PublicEvent(){
       
   }
     
  public static PublicEvent getInstance(){
       
       if(instance== null){
           instance= new PublicEvent();
       }
       
       return instance;
   }
   
   public void addEventImageView( EventImageView evt){
       this.eventImageView = evt;
   }
   
   public void addEventChat(EventChat event){
       this.eventChat= event;
   }
   
   public  EventImageView getEventImageView(){
       return eventImageView;
   }
   
   public EventChat getEventChat(){
       return eventChat;
   }
   
 
    
}
