package app.entities;

public class Status {
    private String valumeStatus;

    public Status(){
    }

    public Status(String valumeStatus) {
        this.valumeStatus = valumeStatus;
    }

    public String getValumeStatus() {
        return valumeStatus;
    }

    public void setValumeStatus(String valumeStatus) {
        this.valumeStatus = valumeStatus;
    }
}
