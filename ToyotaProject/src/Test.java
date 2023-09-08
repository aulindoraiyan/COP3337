public class Test {
    public static  void main (String[]args){
        Camry car = new Camry();
        car.setColor("Blue");
        car.setSeatingCapacity(5);

        Prius P = new Prius();
//        Camry car = new Car("Silver", 5, 18, true); // we cannot do this because it does not have a parametized constructor.

        System.out.println(car);

//        Camry car2 = new Camry("Red", 5, 17.6, true);
//        System.out.println(car2);
    }
}
