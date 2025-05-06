package chat.realtime.app.Component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class OptionButton extends JButton {

  

    public OptionButton() {
        //desactive content Area
        setContentAreaFilled(false);
        //cursor style hand
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    //method change simple or selected whas click in the icon
    @Override
    public void setSelected(boolean b) {
        super.setSelected(b);
       repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if(isSelected()){
            g.setColor(new Color(110,213,255));
            g.fillRect(0, getHeight()- 2, getWidth(), getHeight());
        }
    }
    
    
    

}
