
public class Main {

    public static double calculateVolume(Shape shape2d, double height){
        return shape2d.calculateArea() * height;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 9));
        System.out.println(calc.add(6.5, 2.4, 5.6));

        Circle c = new Circle(2.9);
        c.calculateArea();

        c.printArea();
        Square sq = new Square();
        System.out.println(sq.calculateArea());

        System.out.println("Volume of circle = " + calculateVolume(c, 1.9));
        System.out.println(("Volume of cube = " + calculateVolume(sq, 1.6)));
    }
}