
import java.sql.*;

public class ConnectionAndPreparedStatementInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TallinnBusDB?serverTimezone=UTC";
        String user = "root";
        String pass = "root";

            try {
                Connection connector = DriverManager.getConnection(url, user, pass);
                Statement statement = connector.prepareStatement(
                        "SELECT name,address,phone " +
                        "FROM drivers " +
                        "WHERE drivers = ?");

                String INSERT = "INSERT drivers(name,address,phone) VALUES (?,?,?)";
                PreparedStatement pstm = connector.prepareStatement(INSERT);
                pstm.setString(1, "NameSurname");
                pstm.setString(2, "MyAddress");
                pstm.setString(3, "MyPhone");
                int ret = pstm.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




