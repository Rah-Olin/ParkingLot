package ParkingLot;

class ParkingSpot {
    // check the vehicle fits the spot or not
    // boolean fit(vehicle)

    private final VehicleSize size;
    private Vehicle currentVehicle;

    ParkingSpot(VehicleSize size) {
        this.size = size;
    }

    boolean fit(Vehicle vehicle) {
        return currentVehicle == null && size.getSize() == vehicle.getSize();
    }

    void park(Vehicle vehicle) {
        this.currentVehicle = vehicle;
    }

    void leave(Vehicle vehicle) {
        this.currentVehicle = null;
    }

    Vehicle getVehicle() {
        return this.currentVehicle;
    }
}
