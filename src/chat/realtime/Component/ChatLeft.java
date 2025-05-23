package chat.realtime.Component;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author Nahue
 */
public class ChatLeft extends javax.swing.JLayeredPane {

    /**
     * Creates new form ChatLeft
     */
    public ChatLeft() {
        initComponents();
        txt.setBackground(new Color(200, 200, 200));
    }

    public void setText(String text) {
        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setTxt(text);
        }
    }

    //image chat 
    public void setImage(Icon... image) {
        txt.setImage(false, image);
    }

    //image charge blurhash
    public void setImage(String... image) {
        txt.setImage(false, image);
    }

    //File
    public void setFile(String fileName, String size) {
        txt.setFile(fileName, size);
    }

    //Emoji
    public void setEmoji(Icon icon) {
        txt.hideText();
        txt.setEmoji(false, icon);
    }

    public void setTime() {
        txt.setTime("18:00 PM");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new chat.realtime.Component.ChatItem();

        txt.setMaximumSize(new java.awt.Dimension(0, 0));

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
