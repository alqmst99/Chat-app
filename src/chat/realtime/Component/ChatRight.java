
package chat.realtime.Component;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author Nahue
 */
public class ChatRight extends javax.swing.JLayeredPane {

    /**
     * Creates new form ChatLeft
     */
    public ChatRight() {
        initComponents();
        txt.setBackground(new Color(150,200,200));
    }

     public void setText(String text){
      if(text.equals("")){
          txt.hideText();
      }else{
          txt.setTxt(text);
      }
      txt.seen();
   }
   
 
   public void setImage(Icon... image){
       txt.setImage(true, image);
   }
   
   //chat charge blur hash
     public void setImage(String... image){
       txt.setImage(true, image);
   }
     
     //File
         public void setFile(String fileName, String size){
        txt.setFile(fileName, size);
    }
         
   //Emoji
         public void setEmoji(Icon icon){
             txt.hideText();
             txt.setEmoji(true, icon);
         } 
   
   public void setTime(){
       txt.setTime("18:00 PM");
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new chat.realtime.Component.ChatItem();

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat.realtime.Component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
