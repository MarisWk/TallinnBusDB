import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;

public class ConnectionAndPreparedStatementUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TallinnBusDB?serverTimezone=UTC";
        String user = "root";
        String pass = "root";

        try {
            Connection connector = DriverManager.getConnection(url, user, pass);


            String UPDATE = "UPDATE drivers " +
                    "SET name = ? " +
                    "WHERE id = ?";
            PreparedStatement pstm = connector.prepareStatement(UPDATE);
            pstm.setString(1, "NameSurname2");
            pstm.setInt(2, 89);
            int ret = pstm.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




