public class Main {

    public static void main(String[] args) {
        DriversController driversController = new DriversController();
        BusController busController = new BusController();

        driversController.listAllDrivers();

        System.out.println("==============================");
        busController.listAllBuses();
        driversController.createDriver("TestName","TestAddress","+3722222",20,185);


    }
}
