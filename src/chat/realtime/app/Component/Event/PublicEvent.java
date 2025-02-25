
package chat.realtime.app.Component.Event;

import com.sun.source.tree.InstanceOfTree;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class PublicEvent {

   private static PublicEvent instance;
   
   private EventImageView eventImageView;
   
  public static PublicEvent getInstance(){
       
       if(instance== null){
           instance= new PublicEvent();
       }
       
       return instance;
   }
   
   public void addEventImageView( EventImageView evt){
       this.eventImageView = evt;
   }
   
   public  EventImageView getEventImageView(){
       return eventImageView;
   }
   
   private PublicEvent(){
       
   }
    
}
