package chat.realtime.app.Component;

import chat.realtime.app.Component.Event.PublicEvent;
import chat.realtime.app.Main.Model.Model_Send_Message;
import chat.realtime.app.Main.Model.Model_User_Account;
import chat.realtime.app.Service.Service;
import chat.realtime.app.Swing.JIMSendTextPane;
import chat.realtime.app.Swing.ScrollBar;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Nahue
 */
public class ChatBottom extends javax.swing.JPanel {

    private Model_User_Account user;
    
    //getters and setters

    public Model_User_Account getUser() {
        return user;
    }

    public void setUser(Model_User_Account user) {
        this.user = user;
    }
    
    
    public ChatBottom() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("fillx, filly", "0[fill]0[]2", "2[fill]2"));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane txt = new JIMSendTextPane();
        //update heigth textfield 
        txt.addKeyListener(new KeyAdapter() {
            @Override
            //this metod is autogenerated
            public void keyTyped(KeyEvent e) {

                refresh();
            }

        });
        txt.setBorder(new EmptyBorder(5 ,5, 5,5));
        scroll.setViewportView(txt);
        //Scroll bar from text field
        ScrollBar sb = new ScrollBar();
        sb.setBackground(new Color(229,229,229));
        sb.setPreferredSize(new Dimension(2, 10));
        scroll.setVerticalScrollBar(sb);
      
        add(sb);
        add(scroll, "w 100%");
        //create panel for buttom
        JPanel panel = new JPanel();
        panel.setLayout(new MigLayout("filly", "0[]0", "0[bottom]0"));
        panel.setPreferredSize(new Dimension(30, 28));
        panel.setBackground(Color.WHITE);
        //create button send message
        JButton btn = new JButton();
        btn.setBorder(null);
        btn.setContentAreaFilled(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setIcon(new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/send.png")));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText().trim();
                if (!text.equals("")) {
                    //add chat item
                    Model_Send_Message message= new Model_Send_Message(Service.getInstance().getUser().getId(), user.getId(), text);
                    send(message);
                    PublicEvent.getInstance().getEventChat().sendMessage(message);
                    txt.setText("");
                    txt.grabFocus();
                    refresh();

                } else {
                    txt.grabFocus();
                }
            }
        });
        txt.setHintText("Write Message Here ...");
        panel.add(btn);
        add(panel);

    }
    
    private void send(Model_Send_Message data){
      Service.getInstance().getClient().emit("send_to_user", data.toJSONObject());
    }

    private void refresh() {
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
