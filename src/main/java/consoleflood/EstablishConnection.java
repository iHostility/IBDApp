package consoleflood;

import java.sql.DriverManager;
import java.sql.SQLException;

class EstablishConnection {

    void run() {
        final String url = "jdbc:mysql://localhost:3306/ibdapp?autoReconnect=true&useSSL=false";
        final String user = "service";
        final String password = "1";
        try {
            Main.connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
