
package chat.realtime.app.Component;

import java.awt.Color;

/**
 *
 * @author Nahuel Pierini
 */
public class ChatTitle extends javax.swing.JPanel {

    /**
     * Creates new form ChatTitle
     */
    public ChatTitle() {
        initComponents();
    }
    
    public void setUserName(String userName){
        lbName.setText(userName);
        
    }
    
    public void statusActive(){
        lbStatus.setText("Active Now");
        lbStatus.setForeground(new java.awt.Color(30,163,82));
        
    }
    
    public void setStatusText(String text){
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
