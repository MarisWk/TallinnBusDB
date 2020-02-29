import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DriversController {
    DBHandler dbHandler = new DBHandler();
    Statement statement = dbHandler.createStatement();


    public void listAllDrivers(){
        try {
            ResultSet results = statement.executeQuery("SELECT * FROM drivers LIMIT 1");

            boolean nextItemOnList = results.next();
            if(nextItemOnList){
                int myDriversId = results.getInt("id");
                String myDriverName = results.getString("name");
                int myDriverAge = results.getInt("age");
                double myDriverHeight = results.getDouble("height");

                System.out.println(myDriversId +" "+ myDriverName +" "+myDriverAge +" "+myDriverHeight);

        }
        } catch (SQLException ex){

        }
    }

    public void createDriver(String name, String address, String phone, int age, double height){
        try{
            Statement statement = dbHandler.createStatement();
            statement.executeUpdate("INSERT INTO drivers(name,address,phone,age,height)" +
                                            "VALUES (FirstName, Address2,+3722222,22,182)");
        } catch (SQLException ex){

        }


    }
}
