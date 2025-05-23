package chat.realtime.Component;

import chat.realtime.Component.Event.PublicEvent;
import chat.realtime.Swing.PictureBox;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Nahue
 */
public class ChatImage extends javax.swing.JLayeredPane {

    /**
     * Creates new form ChatImage
     *
     * @param right
     */
    public ChatImage(boolean right) {
        initComponents();
        setLayout(new MigLayout("", "0[" + (right ? "right" : "left") + "]0", "3[]3"));
    }

    public void addImage(Icon... images) {
        for (Icon image : images) {
            PictureBox pic = new PictureBox();
            pic.setPreferredSize(getAutoSize(image, 200, 200));
            pic.setImage(image);
            addEvent(pic, image);//carge event 
            add(pic, "wrap");

        }
    }

    public void addImage(String... images) {
        for (String image : images) {
            
            ImageItem pic = new ImageItem();
            pic.setPreferredSize(new Dimension(200, 200)); //test update
            pic.setImage(image);
            add(pic, "wrap");

        }

    }

    //Init event as click over image chat
    public void addEvent(Component com, Icon image) {
        com.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        com.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    PublicEvent.getInstance().getEventImageView().viewImage(image);
                }

            }
        });
    }

    private Dimension getAutoSize(Icon image, int w, int h) {
        if (w > image.getIconWidth()) {
            w = image.getIconWidth();
        }
        if (h > image.getIconHeight()) {
            h = image.getIconHeight();
        }
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.min(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        return new Dimension(width, height);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
