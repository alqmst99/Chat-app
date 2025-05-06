package chat.realtime.app.emogi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Emogi {
    
    private static Emogi instance; //Inicialize instance 
    
    
    //inicialize intance with new Emogi object class
    public static Emogi getInsance(){
        if(instance == null){
            instance = new Emogi();
        }
        return instance;
    }
    
    
    //constructor private void 

   private Emogi() {
    }
    
    public List<ModelEmoji> getStyle1(){
        List<ModelEmoji> list = new ArrayList<>();
        
        //create bubble and charge all icon emogis
        for( int i= 1; i <= 20; i++){
            list.add(new ModelEmoji(i, new ImageIcon(getClass().getResource("/chat/realtime/app/emogi/icon/"+ i +".png"))));
        }
              return list;
    }
      public List<ModelEmoji> getStyle2(){
        List<ModelEmoji> list= new ArrayList<>();
        
        //create bubble and charge all icon emogis
        for( int i= 20; i<=40; i++){
            list.add(new ModelEmoji(i, new ImageIcon(getClass().getResource("/chat/realtime/app/emogi/icon/"+ i +".png"))));
        }
        return list;
    }
      
      public ModelEmoji getEmoji(int id){
         return new ModelEmoji(id, new ImageIcon(getClass().getResource("/chat/realtime/app/emogi/icon/"+ id +".png")));
      }
}
