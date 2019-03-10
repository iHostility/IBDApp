package consoleflood;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


class EstablishConnection {

    void run() {
        final String url = "jdbc:mysql://localhost:3306/ibdapp?useSSL=false";
        final String login = "service";
        final String password = "1";

        Driver driver;
        try {
            driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            System.out.println("Can't get class. No driver found");
            e.printStackTrace();
            return;
        }

        try {
            Main.connection = DriverManager.getConnection(url, login, password);
            System.out.println("Connection established!");
        } catch (SQLException e) {
            System.out.println("Can't get connection. Incorrect URL");
            e.printStackTrace();
        }
    }
}
