package abstractClass;

import enums.VehicleSizeEnum;
import impl.ParkingSpot;

import java.util.ArrayList;


public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSizeEnum size;

    public int getSpotsNeeded()
    {
        return spotsNeeded;
    }
    public VehicleSizeEnum getSize()
    {
        return size;
    }

    /* Park vehicle in this spot (among others,
       potentially) */
    public void parkingSpot(ParkingSpot s)
    {
        parkingSpots.add(s);
    }


    /* Remove vehicle from spot, and notify spot
       that it's gone */
    public abstract void clearSpots();

    ;

    /* Checks if the spot is big enough for the
       vehicle (and is available).
       This * compares the SIZE only.It does not
      check if it has enough spots. */
    public abstract boolean canFitInSpot(ParkingSpot spot);

    ;
}
