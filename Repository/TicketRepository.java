package LLD_Projects.ParkingLot.Repository;

import LLD_Projects.ParkingLot.Models.Ticket;

import java.util.HashMap;
import java.util.Locale;

public class TicketRepository {
    private HashMap<Long,Ticket> ticketHashMap=new HashMap<>();
    private long seqId=0L;

    public Ticket saveTicket(Ticket ticket){
        seqId+=1;
        ticket.setId(seqId);
        ticketHashMap.put(seqId,ticket);
        return ticket;
    }
}
