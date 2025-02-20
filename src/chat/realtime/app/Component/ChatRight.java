
package chat.realtime.app.Component;

import java.awt.Color;

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
       txt.setTxt(text);
       txt.setTime("9:25 AM");
       txt.sendSucces();
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new chat.realtime.app.Component.ChatItem();

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
    private chat.realtime.app.Component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
