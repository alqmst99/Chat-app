
package chat.realtime.app.Component;

import chat.realtime.app.Main.Model.Model_User_Account;
import java.awt.Color;

/**
 *
 * @author Nahuel Pierini
 */
public class ChatTitle extends javax.swing.JPanel {

    public Model_User_Account getUser() {
        return user;
    }

    public void setUser(Model_User_Account user) {
        this.user = user;
    }

  
    private Model_User_Account user;
    
    public ChatTitle() {
        initComponents();
    }
    
    public void setUserName(Model_User_Account user){
        this.user = user;
        lbName.setText(user.getUserName());
        if(user.isStatus()){
            statusActive();
        }else{
            setStatusText("Offline");
        }
        
    }
    
    public void updateUser(Model_User_Account user){
        if(this.user==user){
            lbName.setText(user.getUserName());
            statusActive();
        } else{
            setStatusText("Offline");
        }
    }
    
   private void statusActive(){
        lbStatus.setText("Active Now");
        lbStatus.setForeground(new java.awt.Color(30,163,82));
        
    }
    
    private void setStatusText(String text){
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 229));
        setPreferredSize(new java.awt.Dimension(469, 40));

        layer.setMinimumSize(new java.awt.Dimension(57, 40));
        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(67, 67, 67));
        lbName.setText("Name");
        layer.add(lbName);

        lbStatus.setForeground(new java.awt.Color(30, 163, 82));
        lbStatus.setText("Active Now");
        layer.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
