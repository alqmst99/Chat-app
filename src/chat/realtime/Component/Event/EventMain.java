package chat.realtime.Component.Event;

import chat.realtime.Main.Model.Model_User_Account;

/**
 *
 * @author Nahuel N Pierini
 * @enterprise FSTailSolutioN
 */
public interface EventMain {

    public void showLoading(boolean show);
    
    public void initChat();
    
    public void selectUser(Model_User_Account user);
    
    public void updateUser(Model_User_Account user);
}
