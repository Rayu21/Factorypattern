// VehicleFactory class
public class VehicleFactory {
    public Vehicle createVehicle(String vehicleType) {
        switch (vehicleType) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            case "motorcycle":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
