

package chat.realtime.Swing;

import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Line extends JLabel{

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getForeground());
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        
        super.paintComponent(g); 
    }

    
}
