package chat.realtime.app.Swing;

import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Progress extends JProgressBar{

    public Progress(){
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }
}
