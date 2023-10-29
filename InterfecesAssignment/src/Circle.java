public class Circle implements Shape{
    double area;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this(0.0);
    }
    public Circle(Circle other){
        this(other.radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }
    public String topString(){
        return   "" + area;
    }


}
