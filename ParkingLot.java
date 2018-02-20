package ParkingLot;

import java.time.LocalDateTime;

public class ParkingLot {
    private Level[] levels;
    private Ticket ticket;

    public ParkingLot(int numberOfLevels, int numberOfSpotsPerLevel, double rate) {
        levels = new Level[numberOfLevels];
        for (int i = 0; i < numberOfLevels; i++) {
            levels[i] = new Level(numberOfSpotsPerLevel);
        }
        ticket = new Ticket(rate);
    }

    public boolean hasSppot(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.hasSpot(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public boolean park(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.park(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public boolean leave(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.leave(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle) {
        for (Level level : levels) {
            ParkingSpot spot = level.getVehicleParkingSpot(vehicle);
            if (spot != null) {
                return spot;
            }
        }
        return null;
    }
    public double charge(Vehicle vehicle) {
        ParkingSpot spot = getParkingSpot(vehicle);
        if (spot != null) {
                return ticket.charge(spot);
        }
        return 0;
    }

}










