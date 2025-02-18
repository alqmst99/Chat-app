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
public class MenuButton extends JButton {

    //Update state selected and un selected, change Iconsimpple to IconSelected
    //Methods encapsate fields 
    /**
     * @return the iconSimple
     */
    public Icon getIconSimple() {
        return iconSimple;
    }

    /**
     * @param iconSimple the iconSimple to set
     */
    public void setIconSimple(Icon iconSimple) {
        this.iconSimple = iconSimple;
    }

    /**
     * @return the iconSelect
     */
    public Icon getIconSelect() {
        return iconSelect;
    }

    /**
     * @param iconSelect the iconSelect to set
     */
    public void setIconSelect(Icon iconSelect) {
        this.iconSelect = iconSelect;
    }

    private Icon iconSimple;
    private Icon iconSelect;

    public MenuButton() {
        //desactive content Area
        setContentAreaFilled(false);
        //cursor style hand
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    //method change simple or selected whas click in the icon
    @Override
    public void setSelected(boolean b) {
        super.setSelected(b);
        if (b) {
            setIcon(iconSelect);

        } else {
            setIcon(iconSimple);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if(isSelected()){
            g.setColor(new Color(110,213,255));
            g.fillRect(0, getHeight()-5, getWidth(), getHeight());
        }
    }
    
    
    

}
