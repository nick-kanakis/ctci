package OOD.Q4_ParkingLot;

/**
 * Created by Nicolas on 16/12/2017.
 */
public class Car extends Vehicle {

    public Car(String licencePlate) {
        super(licencePlate);
        this.size = VehicleSize.Car;
    }
}
