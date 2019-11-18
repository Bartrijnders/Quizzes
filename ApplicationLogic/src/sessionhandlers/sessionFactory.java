package sessionhandlers;

import session.ISession;
import session.Session;

public class sessionFactory {
    public static ISession create(){
        ISession output = new Session();
        return output;
    }
}
