import java.util.Random;

public class Vehicle {

    int vehicleId;
    String numberPlate;
    String name;

    public Vehicle( String numberPlate, String name) {
        this.vehicleId = new Random().nextInt(1000);
        this.numberPlate = numberPlate;
        this.name = name;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getName() {
        return name;
    }
}
