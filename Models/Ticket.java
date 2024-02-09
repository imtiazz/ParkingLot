package LLD_Projects.ParkingLot.Models;

import java.util.Date;

public class Ticket extends  BaseClass{
    private Date entryTime;
    private Operator operator;
    private ParkingSpot parkingSpot;
    private  Vehicle vehicle;
    private  Gate gate;

    public Date getEntryTime() {
        return entryTime;
    }

    public Operator getOperator() {
        return operator;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
