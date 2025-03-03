
package chat.realtime.app.Form;

import chat.realtime.app.Component.ChatBody;
import chat.realtime.app.Component.ChatBottom;
import chat.realtime.app.Component.ChatTitle;
import chat.realtime.app.Component.Event.EventChat;
import chat.realtime.app.Component.Event.PublicEvent;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Nahue
 */
public class Chat extends javax.swing.JPanel {

  
    public Chat() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx", "0[fill]0","0[]0[100%, bottom]0[shrink 0]0"));
        ChatTitle chatTitle= new ChatTitle();
        ChatBody  chatBody= new ChatBody();
        ChatBottom chatBottom = new ChatBottom();
        PublicEvent.getInstance().addEventChat(new EventChat() {
            @Override
            public void senMessage(String txt) {
            chatBody.addItemRight(txt);
            }
        });
        add(chatTitle, "wrap");
        add(chatBody, "wrap");
        add(chatBottom,"h ::50%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
