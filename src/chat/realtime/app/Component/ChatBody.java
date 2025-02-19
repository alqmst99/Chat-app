
package chat.realtime.app.Component;

import java.awt.Color;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Nahue
 */
public class ChatBody extends javax.swing.JPanel {

    /**
     * Creates new form ChatBody
     */
    public ChatBody() {
        initComponents();
        init();
        addItemLeft("A JTextArea is a multi-line text component to display text CaretListener interface when we are trying to implement the functionality of the JTextArea component.");
            addItemRight("jajaja puto el que lee ");

    }


    private void init(){
        Body.setLayout(new MigLayout("fillx"));
        sp.setVerticalScrollBar(new JScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
    
    //add message text field 
    public void addItemLeft(String text){
        ChatLeft item= new ChatLeft();
        item.setText(text);
        
        Body.add(item,"wrap, al left, w 80%, h :: 100%");
        Body.repaint();
        Body.revalidate();
    }
    
     public void addItemRight(String text){
        ChatRight item= new ChatRight();
        item.setText(text);
        
        Body.add(item,"wrap, al right, w ::80%");
        Body.repaint();
        Body.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        Body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        sp.setViewportView(Body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
