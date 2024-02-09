package LLD_Projects.ParkingLot.Models;

import java.util.List;

public class ParkingFloors extends  BaseClass{
    private List<ParkingSpot> parkingSpotList;
    private  int floorNumber;

    public ParkingFloors(List<ParkingSpot> parkingSpotList, int floorNumber) {
        this.parkingSpotList = parkingSpotList;
        this.floorNumber = floorNumber;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
