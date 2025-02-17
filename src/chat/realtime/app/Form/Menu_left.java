
package chat.realtime.app.Form;

import chat.realtime.app.Component.ItemPeople;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Nahue
 */
public class Menu_left extends javax.swing.JPanel {

    /**
     * Creates new form Menu_left
     */
    public Menu_left() {
        initComponents();
        init();
        showPeople();
    }

    private void init(){
        ListMenu.setLayout(new MigLayout("fillx","0[]0","1[]1"));
    }
    
    
    private void showPeople(){
        //Test data
        for(int i=0;i<8; i++ ){
            ListMenu.add(new ItemPeople("people"+ i), "wrap");
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ListMenu = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(242, 242, 242));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Menu.setBackground(new java.awt.Color(229, 229, 229));
        Menu.setOpaque(true);
        Menu.setLayout(new javax.swing.BoxLayout(Menu, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setBackground(new java.awt.Color(229, 229, 229));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/message_selected.png"))); // NOI18N
        Menu.add(jButton1);

        jButton2.setBackground(new java.awt.Color(229, 229, 229));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/group.png"))); // NOI18N
        Menu.add(jButton2);

        jButton3.setBackground(new java.awt.Color(229, 229, 229));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/box.png"))); // NOI18N
        Menu.add(jButton3);

        javax.swing.GroupLayout ListMenuLayout = new javax.swing.GroupLayout(ListMenu);
        ListMenu.setLayout(ListMenuLayout);
        ListMenuLayout.setHorizontalGroup(
            ListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ListMenuLayout.setVerticalGroup(
            ListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu)
            .addComponent(ListMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListMenu))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ListMenu;
    private javax.swing.JLayeredPane Menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
