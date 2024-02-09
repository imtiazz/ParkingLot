package LLD_Projects.ParkingLot.Models;

public class Meter extends  BaseClass{
    private Consumption consumption;

    public Meter(Consumption consumption) {
        this.consumption = consumption;
    }

    public void setConsumption(Consumption consumption) {
        this.consumption = consumption;
    }

    public Consumption getConsumption() {
        return consumption;
    }
}
