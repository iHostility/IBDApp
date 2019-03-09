package consoleflood;

import java.sql.SQLException;

class ShutdownConnection {
    void run() {

        try {
            Main.connection.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            System.out.println("Can't close connection");
            e.printStackTrace();
        }
    }
}
