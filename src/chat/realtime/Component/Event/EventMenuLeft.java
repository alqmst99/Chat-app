package chat.realtime.Component.Event;

import chat.realtime.Main.Model.Model_User_Account;
import java.util.List;

/**
 *
 * @author Nahuel N Pierini
 * @enterprise FSTailSolutioN
 */
public interface EventMenuLeft {

    public void newUser(List<Model_User_Account> users);

    public void userConnect(int id);

    public void userDisconect(int id);

}
