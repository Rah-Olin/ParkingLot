package ParkingLot;

public class ParkingLot {
    private Level[] levels;

    public ParkingLot(int numberOfLevels, int numberOfSpotsPerLevel) {
        levels = new Level[numberOfLevels];
        for (int i = 0; i < numberOfLevels; i++) {
            levels[i] = new Level(numberOfSpotsPerLevel);
        }
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
            if (level.hasSpot(vehicle)) {
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

}










