package chat.realtime.Form;

import chat.realtime.Component.ChatBody;
import chat.realtime.Component.ChatBottom;
import chat.realtime.Component.ChatTitle;
import chat.realtime.Component.Event.EventChat;
import chat.realtime.Component.Event.PublicEvent;
import chat.realtime.Main.Model.Model_Recive_Message;
import chat.realtime.Main.Model.Model_Send_Message;
import chat.realtime.Main.Model.Model_User_Account;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Nahue
 */
public class Chat extends javax.swing.JPanel {

    private ChatTitle chatTitle;
    private ChatBody chatBody;
    private ChatBottom chatBottom;

    public Chat() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[100%, fill]0[shrink 0]0"));
        chatTitle = new ChatTitle();
        chatBody = new ChatBody();
        chatBottom = new ChatBottom();
        PublicEvent.getInstance().addEventChat(new EventChat() {

            @Override
            public void sendMessage(Model_Send_Message data) {

                chatBody.addItemRight(data);

            }

            @Override
            public void reciveMessage(Model_Recive_Message data) {
                if (chatTitle.getUser().getId() == data.getFromUserId()) {
                    chatBody.addItemLeft(data);
                }

            }
        });
        add(chatTitle, "wrap");
        add(chatBody, "wrap");
        add(chatBottom, "h ::50%");

    }

    public void setUser(Model_User_Account user) {
        chatTitle.setUserName(user);
        chatBottom.setUser(user);
        chatBody.clearChat();
    }

    public void updateUser(Model_User_Account user) {
        chatTitle.updateUser(user);
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
