public class Car {
    private String color;
    private int doors;
    private double engineCapacity;

    public Car(){
        this("No Color", 0, 0.0);

    }
    public Car(Car aCar){
        this(aCar.color, aCar.doors, aCar.engineCapacity);
    }
    public Car(String color, int doors, double engineCapacity){
        this.color = color;
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
