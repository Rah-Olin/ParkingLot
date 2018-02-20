package ParkingLot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Level {
    // tracking parking spot
    // hasSpot(Vehicle)

    private final List<ParkingSpot> spots;

    Level(int nuberOfSpots) {
        List<ParkingSpot> list = new ArrayList<ParkingSpot>();
        // assume there are half large parking spots
        // and haft compact
        for (int i = 0; i < nuberOfSpots; i++) {
            if (i % 2 == 0) {
                list.add(new ParkingSpot(VehicleSize.Compact));
            } else {
                list.add(new ParkingSpot(VehicleSize.Large));
            }
        }
        spots = Collections.unmodifiableList(list);
    }

    boolean hasSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.fit(vehicle)) {
                return true;
            }
        }
        return false;
    }

    boolean park(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.fit(vehicle)) {
                spot.park(vehicle);
                return true;
            }
        }
        return false;
    }

    boolean leave(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.getVehicle() == vehicle) {
                spot.leave(vehicle);
                return true;
            }
        }
        return false;
    }

    ParkingSpot getVehicleParkingSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.getVehicle() == vehicle) {
                return spot;
            }
        }
        return null;
    }
}
