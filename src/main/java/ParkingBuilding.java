import java.util.*;

public class ParkingBuilding {
    int buildingId;
    Location location;
    int numberOfParkingLot;
    List<ParkingLot>parkingLots;
    Map<String,ParkingLot> parkingMap;

    public ParkingBuilding(Location location, int numberOfParkingLot) {
        this.buildingId = new Random().nextInt(1000);
        this.location = location;
        this.numberOfParkingLot = numberOfParkingLot;
        this.parkingLots = new ArrayList<ParkingLot>();
        for(int i=0;i<numberOfParkingLot;i++){
            this.parkingLots.add(new ParkingLot(i));
        }
        this.parkingMap = new HashMap<String, ParkingLot>();
    }

    public ParkingLot getFreeSpotToPark(Vehicle vehicle) throws Exception{
        for(ParkingLot parkingLot: parkingLots){
            if(parkingLot.status.equals(ParkingStatus.FREE)){
                parkingLot.park(vehicle);
                parkingMap.put(vehicle.numberPlate,parkingLot);
                return parkingLot;
            }
        }
        throw new Exception("Parking Building is Full!!");
    }

    public ParkingLot searchVehicleInParkingLot(Vehicle vehicle) throws Exception{
        ParkingLot parkingLot = null;
        if(parkingMap.containsKey(vehicle.numberPlate)){
            parkingLot = parkingMap.get(vehicle.numberPlate);
            return parkingLot;
        }
        throw new Exception("Vehicle :"+ vehicle.numberPlate + "is not present in parking!!");
    }

    public int getAvailableParkingLotCount(){
        int freeCount =0;
        for(ParkingLot parkingLot: parkingLots){
            if(parkingLot.status.equals(ParkingStatus.FREE)){
                freeCount++;
            }
        }
        return freeCount;
    }

    public ParkingLot vehicleCheckIn(Vehicle vehicle) throws Exception{
        ParkingLot parkingLot = null;
        try {
            if (getAvailableParkingLotCount() > 0) {
                parkingLot = getFreeSpotToPark(vehicle);
            }

        }
        catch(Exception ex){
            System.out.println("Exception is"+ ex.getMessage());
        }
        return parkingLot;
    }

    public ParkingLot vehicleCheckOut(Vehicle vehicle) throws Exception{
        ParkingLot parkingLot = null;
        if(searchVehicleInParkingLot(vehicle) != null){
            parkingLot = searchVehicleInParkingLot(vehicle);
            parkingMap.remove(vehicle.numberPlate);
            parkingLot.freeTheLot();
        }

        return parkingLot;
    }






}
