package chat.realtime.app.Form;

import chat.realtime.app.Component.ItemPeople;
import chat.realtime.app.Swing.ScrollBar;
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

    }

    private void init() {
        sp.setVerticalScrollBar(new ScrollBar());
        ListMenu.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showMessage();
    }

    private void showMessage() {
       ListMenu.removeAll();
        //Test data
        for (int i = 0; i < 20; i++) {
            ListMenu.add(new ItemPeople("people " + i), "wrap");
        }
        refreshMenuList();
    }

    private void showGroup() {
        ListMenu.removeAll();
        //Test data
        for (int i = 0; i < 10; i++) {
            ListMenu.add(new ItemPeople("group conversation " + i), "wrap");
        }
        refreshMenuList();
    }

    private void showBox() {
        ListMenu.removeAll();
        //Test data
        for (int i = 0; i < 5; i++) {
            ListMenu.add(new ItemPeople("message email number " + i), "wrap");
        }
        refreshMenuList();
    }

    private void refreshMenuList() {
        //re-charge content
        ListMenu.repaint();
        ListMenu.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JLayeredPane();
        menuMessage = new javax.swing.JButton();
        menuGroup = new javax.swing.JButton();
        menuBox = new javax.swing.JButton();
        sp = new javax.swing.JScrollPane();
        ListMenu = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(242, 242, 242));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Menu.setBackground(new java.awt.Color(224, 224, 224));
        Menu.setFocusCycleRoot(true);
        Menu.setOpaque(true);
        Menu.setLayout(new java.awt.GridLayout(1, 3));

        menuMessage.setBackground(new java.awt.Color(229, 229, 229));
        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/message.png"))); // NOI18N
        menuMessage.setSelected(true);
        menuMessage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/message_selected.png"))); // NOI18N
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        Menu.add(menuMessage);

        menuGroup.setBackground(new java.awt.Color(229, 229, 229));
        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/group.png"))); // NOI18N
        menuGroup.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/group_selected.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        Menu.add(menuGroup);

        menuBox.setBackground(new java.awt.Color(229, 229, 229));
        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/box.png"))); // NOI18N
        menuBox.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/box_selected.png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        Menu.add(menuBox);

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ListMenu.setBackground(new java.awt.Color(242, 242, 242));
        ListMenu.setOpaque(true);

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

        sp.setViewportView(ListMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed

        //change iconSimple to IconSelected
        
        if (!menuMessage.isSelected()) {
     
            menuMessage.setSelected(true);
            menuGroup.setSelected(false);
            menuBox.setSelected(false);

            //call users
            showMessage();
        }
    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed

        //change iconSimple to IconSelected
        if (!menuGroup.isSelected()) {
            menuGroup.setSelected(true);
            menuMessage.setSelected(false);
            menuBox.setSelected(false);

            showGroup();
        }

    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed

        //change iconSimple to IconSelected
        if (!menuBox.isSelected()) {
            menuBox.setSelected(true);
            menuGroup.setSelected(false);
            menuMessage.setSelected(false);

            showBox();
        }

    }//GEN-LAST:event_menuBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ListMenu;
    private javax.swing.JLayeredPane Menu;
    private javax.swing.JButton menuBox;
    private javax.swing.JButton menuGroup;
    private javax.swing.JButton menuMessage;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
