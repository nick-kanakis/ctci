package OOD.Q4_ParkingLot;

/**
 * Wrapper class for all functionalities  of the parking lot. It is the main interface with the User.
 */
public class ParkingLot {

    private Level[] levels;

    public ParkingLot(Level[] levels) {
        this.levels = levels;
    }

    public boolean park(Vehicle vehicle){
        //find available spot and return true else return false
        return false;
    }

    public boolean removeCar(int parkingSpotId){
        //search for the level of this parkingSpot and set it free
        return false;
    }
}
