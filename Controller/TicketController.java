package LLD_Projects.ParkingLot.Controller;

import LLD_Projects.ParkingLot.DTO.GenerateTicketRequestDTO;
import LLD_Projects.ParkingLot.DTO.GenerateTicketResponseDTO;
import LLD_Projects.ParkingLot.DTO.TicketResponse;
import LLD_Projects.ParkingLot.Exceptions.ParkingSpotNotAvailableException;
import LLD_Projects.ParkingLot.Models.Ticket;
import LLD_Projects.ParkingLot.Services.GateService;
import LLD_Projects.ParkingLot.Services.TicketService;
import LLD_Projects.ParkingLot.Services.VehicleService;

public class TicketController {

    /*
    * */
//    VehicleService vehicleService;
//    GateService gateService;
//
    TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }
    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO generateTicketRequestDTO)
            throws ParkingSpotNotAvailableException{
       try{
           Ticket ticket=ticketService.generateTicket(generateTicketRequestDTO.getGateId(),
                   generateTicketRequestDTO.getVehicleNumber(),generateTicketRequestDTO.getVehicleType());
           GenerateTicketResponseDTO generateTicketResponseDTO=new GenerateTicketResponseDTO();
           generateTicketResponseDTO.setTicket(ticket);
           generateTicketResponseDTO.setTicketResponse(TicketResponse.SUCCESS);
           return  generateTicketResponseDTO;


       }
       catch (ParkingSpotNotAvailableException e){
           GenerateTicketResponseDTO generateTicketResponseDTO=new GenerateTicketResponseDTO();
           generateTicketResponseDTO.setTicketResponse(TicketResponse.FAILURE);
           return  generateTicketResponseDTO;

       }
    }


}
