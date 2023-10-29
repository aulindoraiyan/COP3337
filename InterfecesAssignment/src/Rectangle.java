public class Rectangle implements Shape{

    double area;
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        this(0.0, 0.0);
    }
    public Rectangle(Rectangle other){
        this(other.height, other.width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        area = getWidth() * getHeight();
        return area;
    }
    public String toString(){
        return "" +  area;
    }
}
