package ParkingLot;

public class Truck extends Vehicle {
    private final String plate;

    public Truck(String plate) {
        this.plate = plate;
    }

    @Override
    public String getPlate() {
        return this.plate;
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.Large;
    }
}
