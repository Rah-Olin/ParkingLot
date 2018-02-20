package ParkingLot;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Ticket {
    private double rate;

    Ticket (double rate) {
        this.rate = rate;
    }

    double charge(ParkingSpot spot) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime parkTimeStamp = spot.getParkTimeStamp();
        LocalDateTime tempDateTime = LocalDateTime.from(parkTimeStamp);
        long seconds = tempDateTime.until( currentDateTime, ChronoUnit.SECONDS);
        return rate * seconds;
    }
}
