public class ApplicationRunner {

    public static void main(String args[]){
        int parkingCap = 5;
        Location location = new Location(23.677,456.55);
        ParkingBuilding parkingBuilding = new ParkingBuilding(location,parkingCap);

        Vehicle vehicle1 = new Vehicle("DL1CK2345","Honda City");
        Vehicle vehicle2 = new Vehicle("DL1CK2346","Honda City");
        Vehicle vehicle3 = new Vehicle("DL1CK2347","Honda City");
        Vehicle vehicle4 = new Vehicle("DL1CK2348","Honda City");
        Vehicle vehicle5 = new Vehicle("DL1CK2349","Honda City");
        Vehicle vehicle6 = new Vehicle("DL1CK2310","Honda City");
        Vehicle vehicle7 = new Vehicle("DL1CK2311","Honda City");
        // CheckIn
        // Count of free Lot
        System.out.println("Count is: "+ parkingBuilding.getAvailableParkingLotCount());
        try {
            ParkingLot parkingLot1 = parkingBuilding.vehicleCheckIn(vehicle1);
            System.out.println("Your vehicle "+ vehicle1.numberPlate+ " is parked in: "+ parkingLot1.parkingLotNumber);
            ParkingLot parkingLot12 = parkingBuilding.vehicleCheckIn(vehicle1);
            System.out.println("Your vehicle "+ vehicle1.numberPlate+ " is parked in: "+ parkingLot12.parkingLotNumber);
            ParkingLot parkingLot13 = parkingBuilding.vehicleCheckIn(vehicle2);
            System.out.println("Your vehicle "+ vehicle2.numberPlate+ " is parked in: "+ parkingLot13.parkingLotNumber);
            ParkingLot parkingLot14 = parkingBuilding.vehicleCheckIn(vehicle3);
            System.out.println("Your vehicle "+ vehicle3.numberPlate+ " is parked in: "+ parkingLot14.parkingLotNumber);
            ParkingLot parkingLot15 = parkingBuilding.vehicleCheckIn(vehicle4);
            System.out.println("Your vehicle "+ vehicle4.numberPlate+ " is parked in: "+ parkingLot15.parkingLotNumber);
            ParkingLot parkingLot16 = parkingBuilding.vehicleCheckIn(vehicle5);
            System.out.println("Your vehicle "+ vehicle5.numberPlate+ " is parked in: "+ parkingLot16.parkingLotNumber);
            ParkingLot parkingLot17 = parkingBuilding.vehicleCheckIn(vehicle6);
            System.out.println("Your vehicle "+ vehicle6.numberPlate+ " is parked in: "+ parkingLot17.parkingLotNumber);

            ParkingLot parkingLot18 = parkingBuilding.vehicleCheckIn(vehicle7);
            System.out.println("Your vehicle "+ vehicle7.numberPlate+ " is parked in: "+ parkingLot18.parkingLotNumber);


            System.out.println("Your vehicle "+ vehicle1.numberPlate+ " is parked in: "+ parkingLot1.parkingLotNumber);
            ParkingLot parkingLot2 = parkingBuilding.vehicleCheckIn(vehicle2);
            System.out.println("Your vehicle "+ vehicle2.numberPlate+ " is parked in: "+ parkingLot2.parkingLotNumber);


            ParkingLot parkingLot3 = parkingBuilding.vehicleCheckOut(vehicle2);
            System.out.println("Your vehicle "+ vehicle2.numberPlate+ " is checkout from the: "+ parkingLot3.parkingLotNumber);

            System.out.println("Count is: "+ parkingBuilding.getAvailableParkingLotCount());


            ParkingLot parkingLot5 = parkingBuilding.vehicleCheckIn(vehicle1);
            System.out.println("Your vehicle "+ vehicle1.numberPlate+ " is parked in: "+ parkingLot5.parkingLotNumber);

            ParkingLot parkingLot4 = parkingBuilding.vehicleCheckOut(vehicle2);
            System.out.println("Your vehicle "+ vehicle2.numberPlate+ " is checkout from the: "+ parkingLot4.parkingLotNumber);




        }
        catch(Exception ex){
            System.out.println(ex.getMessage());

        }
    }
}
