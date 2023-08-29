import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
    }
}
