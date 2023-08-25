public class FlightDemo {
    public static void main(String[] args){
        Flight flight1 = new Flight("1234", "Miami", "Dhaka", 5);
        System.out.println(flight1);

        Flight flight2 = new Flight();
        System.out.println(flight2);

        flight1.reserve(40);
        System.out.println(flight1);

        flight1.cancel(25);
    }
}
