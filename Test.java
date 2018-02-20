package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(2,10,3);
        List<Vehicle> list = new ArrayList<>();

        // init cars and trucks
        try {

            for (int i = 0; i < 40; i++) {
            final Vehicle v = i % 2 == 0 ? new Car("Car " + i) : new Truck("Truck" + i);
            list.add(v);
                Thread.sleep(1000);
                if (lot.hasSppot(v)) {
                    System.out.println(v.getPlate() + " has parking spot!");
                    lot.park(v);
                    System.out.println(v.getPlate() + " has parked at " + lot.getParkingSpot(v).getParkTimeStamp());
                } else {
                    System.out.println("There is no parking spot for " + v.getPlate());
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (Vehicle v : list) {
            double fee = lot.charge(v);
            System.out.println(v.getPlate() + " parking fee is $" + fee);
            if (lot.leave(v)) {
                System.out.println(v.getPlate() + " has left parking lot");
            }
        }
    }
}
