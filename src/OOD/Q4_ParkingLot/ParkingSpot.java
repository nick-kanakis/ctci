package OOD.Q4_ParkingLot;

/**
 * Created by Nicolas on 16/12/2017.
 */
public class ParkingSpot {
    private Level level;
    private VehicleSize spotSize;
    private int row;
    private int spotId;
    private Vehicle vehicle;

    public ParkingSpot(Level level, VehicleSize spotSize, int row, int spotId) {
        this.level = level;
        this.spotSize = spotSize;
        this.row = row;
        this.spotId = spotId;
    }

    public void addVehicleToSpot(Vehicle vehicle) {
        //check if spot is free
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public boolean isSpotAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return  vehicle.size.getRequiredSpace()<= spotSize.getRequiredSpace();
    }

    public Level getLevel() {
        return level;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public int getRow() {
        return row;
    }

    public int getSpotId() {
        return spotId;
    }
}
