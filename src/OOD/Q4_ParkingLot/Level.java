package OOD.Q4_ParkingLot;

/**
 * Each level of the parking lot is an Object that handles the parking/capacity of the parking at this level
 */
public class Level {
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots;

    public Level(int floor, ParkingSpot[] spots, int availableSpots) {
        this.floor = floor;
        this.spots = spots;
        this.availableSpots = availableSpots;
    }

    public int getFloor() {
        return floor;
    }

    public ParkingSpot[] getSpots() {
        return spots;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }


    public boolean parkVehicle(Vehicle vehicle){
        //check if there is an available spot and if the size of it is enough for the vehicle.
        return false;
    }

    public void removeVehicle(ParkingSpot spot){
        //remove car from parking spot
    }
}
