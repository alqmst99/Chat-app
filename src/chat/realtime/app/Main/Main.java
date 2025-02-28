package chat.realtime.app.Main;

import chat.realtime.app.Component.Event.EventImageView;
import chat.realtime.app.Component.Event.PublicEvent;
import chat.realtime.app.Swing.ComponentResizer;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Nahuel N Pierni
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        init();
    }

    //Inizializer component redenrizable in the frame
    private void init() {

        //add icon image in the executable
        setIconImage(new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/icon.png")).getImage());

        //config resize window
        ComponentResizer cr = new ComponentResizer();
        cr.registerComponent(this);
        cr.setMinimumSize(new Dimension(900, 500));
        cr.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        cr.setSnapSize(new Dimension(10, 10));
        viewImage.setVisible(false);
        home.setVisible(true);
        initEvent();
    }

    private void initEvent() {
        PublicEvent.getInstance().addEventImageView(new EventImageView() {
            @Override
            public void viewImage(Icon image) {
              viewImage.viewImage(image);
            }
            @Override
            public void saveImage(Icon image){
                System.out.println("image save");
            }
        });
    }

    
    @SuppressWarnings("unchecked")

    //Inicialize vars pX, Py
    private int pX;
    private int pY;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Border = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        btnMinimeze = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        Body = new javax.swing.JLayeredPane();
        viewImage = new chat.realtime.app.Form.ViewImage();
        home = new chat.realtime.app.Form.Home();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Border.setBackground(new java.awt.Color(229, 229, 229));

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Title.setBackground(new java.awt.Color(229, 229, 229));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        btnMinimeze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/minimize.png"))); // NOI18N
        btnMinimeze.setBorder(null);
        btnMinimeze.setContentAreaFilled(false);
        btnMinimeze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimeze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimezeActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/realtime/app/Icon/close.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimeze, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMinimeze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Body.setLayout(new java.awt.CardLayout(1, 1));
        Body.add(viewImage, "card3");
        Body.add(home, "card2");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Body, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BorderLayout = new javax.swing.GroupLayout(Border);
        Border.setLayout(BorderLayout);
        BorderLayout.setHorizontalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        BorderLayout.setVerticalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //mouse clicked and drag window
    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - pX,
                this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_TitleMouseDragged

    //Press mouse event
    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        pX = evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void btnMinimezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimezeActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimezeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLayeredPane Body;
    private javax.swing.JPanel Border;
    private javax.swing.JPanel Title;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMinimeze;
    private chat.realtime.app.Form.Home home;
    private chat.realtime.app.Form.ViewImage viewImage;
    // End of variables declaration//GEN-END:variables
}
