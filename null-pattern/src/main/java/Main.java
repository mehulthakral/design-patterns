public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("BIKE");
        getVehicleDetails(vehicle);
    }

    private static void getVehicleDetails(Vehicle vehicle) {
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
