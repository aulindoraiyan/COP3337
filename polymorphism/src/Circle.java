public class Circle extends Shape {
    private double radius;
    public Circle(){
        radius = 0.0;
    }

    public Circle(double radius){
        if (radius <= 0){
            System.out.println("Invalid radius");
        }
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public void printArea(){
        System.out.println("This is the area of the circle: " + calculateArea());
    }

}
