
package chat.realtime.app.Component;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author Nahue
 */
public class ChatLeftWhitProfile extends javax.swing.JLayeredPane {

    /**
     * Creates new form ChatLeft
     */
    public ChatLeftWhitProfile() {
        initComponents();
        txt.setBackground(new Color(200,200,200));
    }
    
    public void setUserProfile(String user){
        txt.setUserProfile(user);
    }
    
    //load image user 
      public void setImageProfile(Icon image){
          IaImage.setImage(image);
      }
    
   public void setText(String text){
      if(text.equals("")){
          txt.hideText();
      }else{
          txt.setTxt(text);
      }
   }
   
 
   public void setImage(Icon... image){
       txt.setImage(false, image);
   }
    public void setImage(String... image){
       txt.setImage(false, image);
   }
   
   public void setTime(){
       txt.setTime("18:00 PM");
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        IaImage = new chat.realtime.app.Swing.ImageAvatar();
        txt = new chat.realtime.app.Component.ChatItem();

        setMinimumSize(new java.awt.Dimension(58, 31));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        IaImage.setBorderSize(0);
        IaImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/icon.png"))); // NOI18N
        IaImage.setMaximumSize(new java.awt.Dimension(31, 31));
        IaImage.setMinimumSize(new java.awt.Dimension(31, 31));

        jLayeredPane1.setLayer(IaImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(IaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(IaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jLayeredPane1);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat.realtime.app.Swing.ImageAvatar IaImage;
    private javax.swing.JLayeredPane jLayeredPane1;
    private chat.realtime.app.Component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
