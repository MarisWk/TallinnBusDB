import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusController {

    DBHandler dbHandler = new DBHandler();
    Statement statement = dbHandler.createStatement();


    public void listAllBuses(){
        try {
            ResultSet results2 = statement.executeQuery("SELECT * FROM buses");
            System.out.println("------------------------------");
            while(results2.next()){
                int mybusId = results2.getInt("id");
                String myBusNumber = results2.getString("busNumber");
                System.out.println(mybusId +" "+ myBusNumber);
            }
        } catch (SQLException ex){

        }
    }
}
