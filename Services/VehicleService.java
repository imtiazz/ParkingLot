package LLD_Projects.ParkingLot.Services;

import LLD_Projects.ParkingLot.Models.Vehicle;
import LLD_Projects.ParkingLot.Models.VehicleType;
import LLD_Projects.ParkingLot.Repository.VehicleRepository;

public class VehicleService {
    VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehiclebyNumber(String vehicleNumber){
        return null;
    }
    public Vehicle registerVehicle(String vehicleNumber, VehicleType vehicleType){
        Vehicle v=new Vehicle();
        v.setVehicleType(VehicleType.Truck);
        v.setVehicleNumber("TS07GM1073");
        return  v;
    }
}
