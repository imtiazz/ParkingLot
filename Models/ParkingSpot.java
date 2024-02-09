package LLD_Projects.ParkingLot.Models;

public class ParkingSpot extends BaseClass{
    private VehicleType vehicleType;
    private int number;

   private ParkingSpotStatus parkingSpotStatus;
   private SpotType spotType;

    public ParkingSpot(VehicleType vehicleType, int number, ParkingSpotStatus parkingSpotStatus, SpotType spotType) {
        this.vehicleType = vehicleType;
        this.number = number;
        this.parkingSpotStatus = parkingSpotStatus;
        this.spotType = spotType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getNumber() {
        return number;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public SpotType getSpotType() {
        return spotType;
    }
}
