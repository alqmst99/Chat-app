package chat.realtime.Swing;

import javax.swing.Icon;
import javax.swing.JProgressBar;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Progress extends JProgressBar{

    /**
     * @return the progresstype
     */
    public ProgressType getProgresstype() {
        return progresstype;
    }

    /**
     * @param progresstype the progresstype to set
     */
    public void setProgresstype(ProgressType progresstype) {
        this.progresstype = progresstype;
        repaint();
    }

    private ProgressType  progresstype= ProgressType.NONE;
    
    public Progress(){
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }
    
    public static enum ProgressType{
        NONE,
        DOWN_FILE,
        CANCEL,
        FILE
    }
}
