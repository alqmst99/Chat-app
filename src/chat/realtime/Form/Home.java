package chat.realtime.Form;

/**
 *
 * @author Nahue
 */
import chat.realtime.Main.Model.Model_User_Account;
import net.miginfocom.swing.MigLayout;

public class Home extends javax.swing.JLayeredPane {

    /**
     * Creates new form Home
     */
    private  Chat chat;
    
    public Home() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("debug, fillx, filly", "0[200]5[fill, 100%]5[200!]0", "0[fill]0"));
        this.add(new Menu_left());
       chat= new Chat();
        
        this.add(chat);
        this.add(new Menu_Rigth());
        chat.setVisible(false);
    }
    
    public void setUser(Model_User_Account user){
        
        chat.setUser(user);
         chat.setVisible(true);
    }
     public void updateUser(Model_User_Account user){
         chat.updateUser(user);
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
