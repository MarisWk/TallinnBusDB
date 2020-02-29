import java.sql.*;

public class ConnectionAndPreparedStatementDelete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TallinnBusDB?serverTimezone=UTC";
        String user = "root";
        String pass = "root";

        try {
            Connection connector = DriverManager.getConnection(url, user, pass);

            String DELETE = "DELETE " +
                    "FROM drivers " +
                    "WHERE id = ?";
            PreparedStatement pstm = connector.prepareStatement(DELETE);
            pstm.setInt(1,121);
            int ret = pstm.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




