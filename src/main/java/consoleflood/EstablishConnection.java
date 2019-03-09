package consoleflood;

import java.sql.DriverManager;
import java.sql.SQLException;


class EstablishConnection {
    private final String driverName = "com.mysql.cj.jdbc.Driver";
    private final String connectionString = "jdbc:mysql://localhost:3306/ibdapp?useSSL=false";
    private final String login = "service";
    private final String password = "1";

    void run() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println("Can't get class. No driver found");
            e.printStackTrace();
            return;
        }

        try {
            Main.connection = DriverManager.getConnection(connectionString, login, password);
            System.out.println("Connection established!");
        } catch (SQLException e) {
            System.out.println("Can't get connection. Incorrect URL");
            e.printStackTrace();
            return;
        }
    }
}
