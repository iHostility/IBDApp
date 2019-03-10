package consoleflood;

import java.sql.*;

class Output {
    void run() throws Exception {
        try (Connection exec = Main.connection; Statement statement = exec.createStatement()) {

            String query = "select * from ibdapp.dictionary";
            int a = 10;
            int b = 5000;
            int delay = a + (int) (Math.random() * b);

            PreparedStatement prepStat = exec.prepareStatement(query);
            ResultSet resSet = prepStat.executeQuery();
            int i = 20;
            while (resSet.next()) {
                System.out.println(resSet.getString("line"));
                Thread.sleep(delay);
                i--;
                if (i == 0) break;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
