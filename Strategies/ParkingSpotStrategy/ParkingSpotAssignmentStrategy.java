package LLD_Projects.ParkingLot.Strategies.ParkingSpotStrategy;

import LLD_Projects.ParkingLot.Models.Gate;
import LLD_Projects.ParkingLot.Models.ParkingSpot;
import LLD_Projects.ParkingLot.Models.VehicleType;

public interface ParkingSpotAssignmentStrategy {
    public ParkingSpot assignParkingSpot(VehicleType vehicleType, Gate gate);
}
