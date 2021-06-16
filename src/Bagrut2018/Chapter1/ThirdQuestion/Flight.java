package Bagrut2018.Chapter1.ThirdQuestion;

public class Flight {

    protected String cName;
    protected String destination;
    protected String flightCode;
    protected Time flightTime;

    public Flight(String cName, String destination, String flightCode, Time flightTime) {
        this.cName = cName;
        this.destination = destination;
        this.flightCode = flightCode;
        this.flightTime = flightTime;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public Time getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Time flightTime) {
        this.flightTime = flightTime;
    }
}
