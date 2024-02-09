package LLD_Projects.ParkingLot.Models;

import java.util.List;

public class ParkingLot extends BaseClass {

    private List<ParkingFloors> parkingFloorsList;
    private List<Gate> gateList;
    private String address;

    public ParkingLot(List<ParkingFloors> parkingFloorsList, List<Gate> gateList, String address) {
        this.parkingFloorsList = parkingFloorsList;
        this.gateList = gateList;
        this.address = address;
    }

    public void setParkingFloorsList(List<ParkingFloors> parkingFloorsList) {
        this.parkingFloorsList = parkingFloorsList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloors> getParkingFloorsList() {
        return parkingFloorsList;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public String getAddress() {
        return address;
    }
}
