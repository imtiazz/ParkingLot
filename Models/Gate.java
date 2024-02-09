package LLD_Projects.ParkingLot.Models;

public class Gate extends  BaseClass{
    private  Operator operator;
    private int number;

    private GateStatus gateStatus;
    private GateType gateType;

    public Gate(Operator operator, int number, GateStatus gateStatus, GateType gateType) {
        this.operator = operator;
        this.number = number;
        this.gateStatus = gateStatus;
        this.gateType = gateType;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public int getNumber() {
        return number;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }
}
