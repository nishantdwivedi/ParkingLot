import java.util.Random;

public class ParkingLot {

    int parkingLotNumber;
    ParkingStatus status;
    Vehicle vehicle;

    public ParkingLot(int parkingLotNumber) {
        this.parkingLotNumber = new Random().nextInt(1000);
        this.status = ParkingStatus.FREE;
    }


    public boolean park(Vehicle vehicle) throws Exception{
        boolean parkingStatus = false;
        if(status.equals(ParkingStatus.NOT_IN_SERVICE) || status.equals(ParkingStatus.OCCUPIED)){

            parkingStatus = false;
        }
        else{
            this.vehicle = vehicle;
            status = ParkingStatus.OCCUPIED;
            parkingStatus = true;
        }

        return parkingStatus;
    }

    public void freeTheLot(){
        this.status = ParkingStatus.FREE;
        this.vehicle = null;
    }

    public int getParkingLotNumber() {
        return parkingLotNumber;
    }

    public ParkingStatus getStatus() {
        return status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


}
