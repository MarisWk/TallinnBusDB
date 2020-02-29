package JDBCTraining;

import java.sql.*;

public class ConnectorAndSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TallinnBusDB?serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        try {
            Connection connector = DriverManager.getConnection(url, user, pass);
            Statement statement = connector.createStatement();
            //-------------------------------------------------------------------------------------------
            ResultSet results = statement.executeQuery("SELECT * FROM drivers LIMIT 1");

            boolean nextItemOnList = results.next();
            if(nextItemOnList){
                int myDriversId = results.getInt("id");
                String myDriverName = results.getString("name");
                int myDriverAge = results.getInt("age");
                double myDriverHeight = results.getDouble("height");

                System.out.println(myDriversId +" "+ myDriverName +" "+myDriverAge +" "+myDriverHeight);

            }
            //-------------------------------------------------------------------------------------------
            //#########################SELECT ALL RESULTS FROM TABLE USING WHILE LOOP ###################
            //###########################################################################################
            ResultSet results2 = statement.executeQuery("SELECT * FROM buses");
            System.out.println("------------------------------");
            while(results2.next()){
                int mybusId = results2.getInt("id");
                String myBusNumber = results2.getString("busNumber");
                System.out.println(mybusId +" "+ myBusNumber);
            }
            //-------------------------------------------------------------------------------------------
            System.out.println("test");
            statement.close();
            connector.close();

        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
    }

