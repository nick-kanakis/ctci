package OOD.Q4_ParkingLot;

/**
 * Base class to support each type of Vehicle available
 */
public abstract class Vehicle {
    private String licencePlate;
    protected VehicleSize size;

    public Vehicle(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public int getRequiredSpace() {
        return size.getRequiredSpace();
    }

    public boolean canFitInSpot(ParkingSpot parkingSpot){
        return parkingSpot.canFitVehicle(this);
    }
}
