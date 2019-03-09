package consoleflood;

import java.sql.Connection;

/**
 * General console flood for work activity imitation
 * made by iHostility
 * Voloshin Denis
 *
 */

public class Main
{
    static Connection connection = null;

    public static void main( String[] args )
    {
        EstablishConnection startConnection = new EstablishConnection();
        startConnection.run();

        //TODO add to do some stuff here
        System.out.println("RRRRREEEEEEEEE");

        ShutdownConnection closeConnection = new ShutdownConnection();
        closeConnection.run();

    }
}
