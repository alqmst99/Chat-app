
package chat.realtime.app.Swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class ScrollBar extends JScrollBar{
    
    //create new Scroll Bar, dimantion, color, and displacement increment
public ScrollBar(){
     setUI(new ModernScrollBarUI());
     setPreferredSize(new Dimension(5, 5));
     setBackground(new Color(242,242,242));
     setUnitIncrement(20);
}
}
