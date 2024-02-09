package LLD_Projects.ParkingLot.DTO;

import LLD_Projects.ParkingLot.Models.Ticket;

public class GenerateTicketResponseDTO {
    private Ticket ticket;
    private TicketResponse ticketResponse;

    public void setTicket(Ticket ticket) {

        this.ticket = ticket;
    }

    public void setTicketResponse(TicketResponse ticketResponse) {
        this.ticketResponse = ticketResponse;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public TicketResponse getTicketResponse() {
        return ticketResponse;
    }
}
