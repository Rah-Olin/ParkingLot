package ParkingLot;

import java.time.LocalDateTime;

class ParkingSpot {
    // check the vehicle fits the spot or not
    // boolean fit(vehicle)

    private final VehicleSize size;
    private Vehicle currentVehicle;
    private LocalDateTime parkTimeStamp;

    ParkingSpot(VehicleSize size) {
        this.size = size;
    }

    boolean fit(Vehicle vehicle) {
        return currentVehicle == null && size.getSize() == vehicle.getSize().getSize();
    }

    void park(Vehicle vehicle) {
        this.currentVehicle = vehicle;
        this.parkTimeStamp = LocalDateTime.now();
    }

    void leave(Vehicle vehicle) {
        this.currentVehicle = null;
        this.parkTimeStamp = null;
    }

    Vehicle getVehicle() {
        return this.currentVehicle;
    }

    LocalDateTime getParkTimeStamp() {
        return this.parkTimeStamp;
    }
}
