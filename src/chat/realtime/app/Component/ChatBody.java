package chat.realtime.app.Component;

import chat.realtime.app.Swing.ScrollBar;
import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
        addItemLeft("A JTextArea is a multi-line text component to display text CaretListener interface when we are trying to implement the functionality of the JTextArea component.", "pepito");
        addItemRight("jajaja puto el que lee ");
        addDate("25/12/1800");
        addItemLeft("A JTextArea is a  to implement the functionality of the JTextArea component.", "pepito");
        addItemRight("A JTextArea is a multi-line text component to display text CaretListener interface when we are trying to implement the functionality of the JTextArea component. ");
        addDate("1/1/1900");
        String img[] = {"URMj,K-:?G9G_JIon}WqD~ITRPs,otV@RQoy"};
        addItemLeft("solemne", "pepito", img);

        addItemLeft("trying to implement the functionality of the JTextArea component.", "pepito", new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/dog.jpg")), new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/pic.jpg")));
        addItemRight("jajaja puto el que lee ");
        addDate("Today");
        addItemLeft("", "Ro", new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/pic.jpg")));
        addItemRight("jajaja puto el que lee ", new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/pic.jpg")));
        addItemRight("jajaja puto el que lee ", new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/cat.png")));
        addItemFile("aca esta el archivo importante que te dije", "Ro", "casabianca.xmp", "129 MB");
        addItemFileRight("","carpeta.mpx", "78 MB");
        addItemFileLeft("the next archive content virus, plase analize the type attack is","fotos.mpx", "178 MB");
    
    }

    private void init() {
        Body.setLayout(new MigLayout("fillx"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }

    //add message text field 
    public void addItemLeft(String text, String user, Icon... image) {
        ChatLeftWhitProfile item = new ChatLeftWhitProfile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        Body.add(item, "wrap, al left, w 100::80%");//w 100:80% ajust size in the content 
        Body.repaint();
        Body.revalidate();
    }

    //add message text field 
    public void addItemLeft(String text, String user, String[] image) {
        ChatLeftWhitProfile item = new ChatLeftWhitProfile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        Body.add(item, "wrap, al left, w 100::80%");//w 100:80% ajust size in the content 
        Body.repaint();
        Body.revalidate();
    }

        //add File
    public void addItemFile(String text, String user, String fileName, String size) {
        ChatLeftWhitProfile item = new ChatLeftWhitProfile();
        item.setText(text);
        item.setFile(fileName, size);
        item.setTime();
        item.setUserProfile(user);
        Body.add(item, "wrap, al left, w 100::80%");//w 100:80% ajust size in the content 
        Body.repaint();
        Body.revalidate();
    }
    
    
    public void addItemRight(String text, Icon... image) {
        ChatRight item = new ChatRight();
        item.setText(text);
        item.setImage(image);
       item.setTime();
        Body.add(item, "wrap, al right, w 100::80%");
        Body.repaint();
        Body.revalidate();
        scrollToBottom();
    }
    
      //File upload chat rigth
        public void addItemFileRight(String text, String fileName, String size) {
        ChatRight item = new ChatRight();
       item.setText(text);
        item.setFile(fileName, size);
        Body.add(item, "wrap, al right, w 100::80%");
        Body.repaint();
        Body.revalidate();
    }
        
        //File upload chat left
                public void addItemFileLeft(String text, String fileName, String size) {
        ChatLeft item = new ChatLeft();
       item.setText(text);
        item.setFile(fileName, size);
        Body.add(item, "wrap, al left, w 100::80%");
        Body.repaint();
        Body.revalidate();
    }

    public void addDate(String date) {
        ChatDate item = new ChatDate();
        item.setDate(date);
        Body.add(item, "wrap,al center ");
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
 //Fill to the end Scrollbar after send message
    private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
