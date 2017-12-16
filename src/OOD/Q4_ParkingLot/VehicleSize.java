package OOD.Q4_ParkingLot;

/**
 * Defines the available vehicle size and the required free spots to park each vehicle
 */
public enum VehicleSize {
    Motorcycle(1), Car(2), Bus(5);
    private int spaceRequired;

    VehicleSize(int spaceRequired) {
        this.spaceRequired = spaceRequired;
    }

    public int getRequiredSpace() {
        return spaceRequired;
    }
}
