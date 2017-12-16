package OOD.Q4_ParkingLot;

/**
 * Created by Nicolas on 16/12/2017.
 */
public class Bus extends Vehicle{

    public Bus(String licencePlate) {
        super(licencePlate);
        this.size = VehicleSize.Bus;
    }
}
