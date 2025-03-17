
package chat.realtime.app.Component;

import chat.realtime.app.Component.Event.PublicEvent;
import chat.realtime.app.Main.Model.Model_User_Account;
import chat.realtime.app.Swing.ActiveStatus;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Nahue
 */
public class ItemPeople extends javax.swing.JPanel {

    public ActiveStatus getActiveStatus() {
        return activeStatus;
    }
    
    
    private boolean mouseOver;
    private Model_User_Account user;
    
    public final Model_User_Account getUser() {
        return user;
    }
    
    public ItemPeople(Model_User_Account user) {
        this.user= user;
        initComponents();
        lbName.setText(user.getUserName());
        activeStatus.setActive(user.isStatus());
        init();
    }

    public void updateStatus (){
        activeStatus.setActive(user.isStatus());
    }
    
    private void init(){
        //mouse over a people component effect, change background color when hover mouse in the component Swing
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me){
                setBackground(new Color(230,230,230));
                mouseOver= true;
            }
            
            @Override
            public void mouseExited(MouseEvent me){
                setBackground(new Color(242,242,242));
                mouseOver= false;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                if(mouseOver){
                    PublicEvent.getInstance().getEventMain().selectUser(user);
                }
                
            }
            
            
            
            
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new chat.realtime.app.Swing.ImageAvatar();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        activeStatus = new chat.realtime.app.Swing.ActiveStatus();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(200, 50));

        imageAvatar1.setBorderSize(0);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/profile.png"))); // NOI18N

        lbName.setBackground(new java.awt.Color(0, 0, 0));
        lbName.setForeground(new java.awt.Color(0, 0, 0));
        lbName.setText("Name");

        lbStatus.setBackground(new java.awt.Color(0, 0, 0));
        lbStatus.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(117, 117, 117));
        lbStatus.setText("Name");

        activeStatus.setActive(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activeStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat.realtime.app.Swing.ActiveStatus activeStatus;
    private chat.realtime.app.Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
