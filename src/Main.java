public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        System.out.println(car.drive());  // Output: Driving a car

        Vehicle truck = factory.createVehicle("truck");
        System.out.println(truck.drive());  // Output: Driving a truck

        Vehicle motorcycle = factory.createVehicle("motorcycle");
        System.out.println(motorcycle.drive());  // Output: Riding a motorcycle
    }
}
