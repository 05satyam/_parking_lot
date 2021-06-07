package impl;

import abstractClass.Vehicle;

public class BusVehicle extends Vehicle {
    @Override
    public void clearSpots() {

    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return false;
    }
}
