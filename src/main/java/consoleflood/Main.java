package consoleflood;

import java.sql.Connection;


public class Main {
    static Connection connection = null;

    public static void main(String[] args) {
        new EstablishConnection().run(); //TODO review connection code

        try {
            new Output().run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        new ShutdownConnection().run();

    }

}
