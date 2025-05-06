package chat.realtime.app.Component;

import chat.realtime.app.emogi.Emogi;
import chat.realtime.app.emogi.ModelEmoji;
import chat.realtime.app.Main.Main;
import chat.realtime.app.Swing.ScrollBar;
import chat.realtime.app.Swing.WrapLayout;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class PanelMore extends javax.swing.JPanel {
    
    public PanelMore() {
        initComponents();
        init();
    } 
    
    private void init() {
           setLayout(new MigLayout("fillx"));
    
    panelHeader = new JPanel();
    panelHeader.setLayout(new BoxLayout(panelHeader, BoxLayout.LINE_AXIS));//panel box header disposition
    panelHeader.add(getButtonFile());
    panelHeader.add(getEmojiStyle1());
    panelHeader.add(getEmojiStyle2());
    add(panelHeader, "w 100%, h 30!, wrap");//use Wrap layout

    panelDetail = new JPanel();
    panelDetail.setLayout(new WrapLayout(WrapLayout.LEFT)); // WrapLayout permite emojis en líneas
    
    JScrollPane ch = new JScrollPane(panelDetail); // ← AQUÍ está el fix: panelDetail dentro del scroll
    ch.setBorder(null);
    ch.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    ch.setVerticalScrollBar(new ScrollBar());

    add(ch, "w 100%, h 100%");
    }

    //Upload Image Event
    private JButton getButtonFile() {
        
        OptionButton btn = new OptionButton();
        btn.setIcon(new ImageIcon(getClass().getResource("/chat/realtime/app/Icon/link.png")));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser ch = new JFileChooser();
                ch.showOpenDialog(Main.getFrames()[0]);
                //Update next

            }
        });
        
        return btn;
    }

    //Upload Icon Emogi Button
    private JButton getEmojiStyle1() {
        //test
        OptionButton btn = new OptionButton();
        btn.setIcon(Emogi.getInsance().getEmoji(2).toSize(25, 25).getIcon());
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelDetail.removeAll();

                //itarition of buble for, map all emogis 1-20
                for (ModelEmoji d : Emogi.getInsance().getStyle1()) {
                    
                    JButton c = new JButton();
                    c.setIcon(d.getIcon());
                    c.setName(d.getId() + "");
                    c.setBorder(new EmptyBorder(3, 3, 3, 3));
                    c.setCursor(new Cursor(Cursor.HAND_CURSOR));
                     c.setContentAreaFilled(false);
                    
                    panelDetail.add(c);
                   
                }
                
                panelDetail.repaint();
                panelDetail.revalidate();
            }
        });
        
        return btn;
    }
    
    private JButton getEmojiStyle2() {
        //test
        OptionButton btn = new OptionButton();
        btn.setIcon(Emogi.getInsance().getEmoji(21).toSize(25, 25).getIcon());
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelDetail.removeAll();

                //itarition of buble for, map all emogis 21-40
                for (ModelEmoji d : Emogi.getInsance().getStyle2()) {
                    
                    JButton c = new JButton();
                    c.setIcon(d.getIcon());
                    c.setName(d.getId() + "");
                    c.setBorder(new EmptyBorder(3, 3, 3, 3));
                    c.setCursor(new Cursor(Cursor.HAND_CURSOR));
                     c.setContentAreaFilled(false);
                    
                    panelDetail.add(c);
                   
                }
                
                panelDetail.repaint();
                panelDetail.revalidate();
            }
        });
        return btn;
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
private JPanel panelHeader;
private JPanel panelDetail;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
