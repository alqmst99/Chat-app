package chat.realtime.app.Form;

/**
 *
 * @author Nahue
 */
import net.miginfocom.swing.MigLayout;

public class Home extends javax.swing.JLayeredPane {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("debug, fillx, filly", "0[200]5[fill, 100%]5[200!]0", "0[fill]0"));
        this.add(new Menu_left());
        this.add(new Chat());
        this.add(new Menu_Rigth());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
