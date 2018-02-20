package ParkingLot;

public class Car extends Vehicle {
    private String plate;
    public Car(String plate) {
        this.plate = plate;
    }

    @Override
    public String getPlate() {
        return this.plate;
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.Compact;
    }
}
