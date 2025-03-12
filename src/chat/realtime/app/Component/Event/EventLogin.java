package chat.realtime.app.Component.Event;

import chat.realtime.app.Main.Model.Model_Login;
import chat.realtime.app.Main.Model.Model_Register;

/**
 *
 * @author Nahuel N Pierini
 * @enterprise FSTailSolutioN
 */
public interface EventLogin {

    //action sigup user or register new user
    public void login(Model_Login data);

    public void register(Model_Register data, EventMessage message);

    //go to register or back to login
    public void goRegister();

    public void goLogin();

}
