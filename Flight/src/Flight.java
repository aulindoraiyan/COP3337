import java.util.Locale;

public class Flight {
    private String flightNumber;
    private  String source;
    private String destination;
    private int availableSeats;

    public Flight(){
        this("", "", "", 50);
    }

public Flight(String flightNumber, String source, String destination, int seats){
    this.flightNumber = flightNumber;
    this.destination = shortAndCapital(destination);
    availableSeats = 50;
    this.source = shortAndCapital(source);
}

public Flight(Flight aFlight){
    this.flightNumber = aFlight.flightNumber;
    this.destination = aFlight.destination;
    this.source = aFlight.source;
    this.availableSeats = aFlight.availableSeats;


//    this(aFlight.flightNumber, aFlight.source, aFlight.destination, aFlight.seatsno);
}

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void reserve(int numberOfSeats){
        if(getAvailableSeats() - numberOfSeats >= 0){
            setAvailableSeats(getAvailableSeats() - numberOfSeats);
            System.out.println(getAvailableSeats() + " seats are left");

        }
        else{
            System.out.println("Not enough seat : (");
        }

    }
    public void cancel(int numberOfSeats){
        setAvailableSeats(getAvailableSeats() + numberOfSeats);
        System.out.println(numberOfSeats + "cancelled. Now available " + getAvailableSeats() + " seats" );


    }
    private String shortAndCapital(String name){
        if (name.length() < 4){
            return name.toUpperCase();
        }
        else {
            return name.substring(0, 3).toUpperCase();
        }
    }

    public String toString(){
        return "Flight Number: " + flightNumber + "\nFrom: " + source + "\nTo:" + destination+ "\nAvailable Seats: " + availableSeats;

    }
}
