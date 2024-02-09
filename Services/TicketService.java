package LLD_Projects.ParkingLot.Services;

import LLD_Projects.ParkingLot.Exceptions.ParkingSpotNotAvailableException;
import LLD_Projects.ParkingLot.Models.*;
import LLD_Projects.ParkingLot.Repository.TicketRepository;
import LLD_Projects.ParkingLot.Strategies.ParkingSpotStrategy.ParkingSpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    GateService gateService;
    VehicleService vehicleService;
    TicketRepository ticketRepository;
    ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;

    public TicketService(GateService gateService, VehicleService vehicleService,
                         TicketRepository ticketRepository,ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy) {
        this.gateService = gateService;
        this.vehicleService = vehicleService;
        this.ticketRepository = ticketRepository;
        this.parkingSpotAssignmentStrategy=parkingSpotAssignmentStrategy;
    }

    public Ticket generateTicket(int gateId, String vehicleNumber, VehicleType vehicleType)
            throws ParkingSpotNotAvailableException {
       Vehicle vehicle =vehicleService.getVehiclebyNumber(vehicleNumber);
       if (vehicle==null){
          vehicle=vehicleService.registerVehicle(vehicleNumber,vehicleType);
       }
        Gate gate=gateService.getGateById(gateId);
        ParkingSpot parkingSpot=parkingSpotAssignmentStrategy.assignParkingSpot(vehicleType,gate);
        if (parkingSpot==null)
            throw new ParkingSpotNotAvailableException("Parking spot not available");

        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());
        ticket.setParkingSpot(parkingSpot);
        ticket.setVehicle(vehicle);
        Ticket savedTicket=ticketRepository.saveTicket(ticket);
        return  savedTicket;

    }

}
