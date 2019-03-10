package consoleflood;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

class Output {
    void run() {
        try (Connection exec = Main.connection; Statement statement = exec.createStatement()) {
           statement.execute("select line from ibdapp.dictionary where phrase_id = '1';");
           //
           //
           //
           //
           //
           //
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
