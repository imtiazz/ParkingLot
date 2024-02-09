package LLD_Projects.ParkingLot.Models;

public class Vehicle extends  BaseClass {
    private  String vehicleNumber;
    private VehicleType vehicleType;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
