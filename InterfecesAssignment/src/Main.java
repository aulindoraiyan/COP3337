
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(4, 3);

        showArea(c);
        showArea(r);

    }
    public static void showArea(Shape s){
        double Area = s.area();
        System.out.println("The area of the shape is " + Area );

    }
}