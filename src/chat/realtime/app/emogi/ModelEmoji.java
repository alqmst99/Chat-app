package chat.realtime.app.emogi;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class ModelEmoji {

    //Auto complete fields, getters and setters
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    //constructor void and complete
    

    public ModelEmoji() {
    }

    public ModelEmoji(int id, Icon icon) {
        this.id = id;
        this.icon = icon;
    }
    
    

    private int id;
    
    private Icon icon;
    
    
    //Model Emogi Size Options
    public ModelEmoji toSize(int x, int y){
        return new ModelEmoji(id, new ImageIcon(((ImageIcon)icon).getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH)));
    }
}
