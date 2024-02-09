package LLD_Projects.ParkingLot.DTO;

import LLD_Projects.ParkingLot.Models.VehicleType;

public class GenerateTicketRequestDTO {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private int GateId;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setGateId(int gateId) {
        GateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getGateId() {
        return GateId;
    }
}
