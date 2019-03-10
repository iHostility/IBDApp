package consoleflood;

import java.sql.*;

class Output {
    void run() throws Exception {
        try (Connection exec = Main.connection; Statement statement = exec.createStatement()) {

            String query = "select * from ibdapp.dictionary";
            int a = 10;
            int b = 5000;

            PreparedStatement prepStat = exec.prepareStatement(query);
            ResultSet resSet = prepStat.executeQuery();

            while (resSet.next()) {
                int delay = a + (int) (Math.random() * b);
                System.out.println(resSet.getString("line"));
                Thread.sleep(delay);
             }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
