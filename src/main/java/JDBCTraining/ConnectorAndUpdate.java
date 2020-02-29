package JDBCTraining;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectorAndUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TallinnBusDB?serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        try {
            Connection connector = DriverManager.getConnection(url, user, pass);
            Statement statement = connector.createStatement();
            int newDriverId = 2;
            int busId = 1;
            int result = statement.executeUpdate("UPDATE buses SET driverID = " + newDriverId + " WHERE id =" + busId);
            if (result == 1) {
                System.out.println("yipee!. driver changed successfully");
            } else {
                System.out.println("Yikes!!!!!!!!!!. Something is not right");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}