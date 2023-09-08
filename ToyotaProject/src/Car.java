//This is base class/ parent class

public class Car {
    private String color;
    private int seatingCapacity;
    private double tankSize;

    public Car(){
        this("No color yet", 0, 0.0 );
    }
    public Car(String color, int seatingCapacity, double tankSize){
        setColor(color);
        setSeatingCapacity(seatingCapacity);
        setTankSize(tankSize);

    }
    public Car(Car other){
        this(other.color, other.seatingCapacity, other.tankSize);
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if (color == null){
            System.out.println("Cannot set null color");
            System.exit(0);
        }
        this.color = color;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        if(seatingCapacity < 0 || seatingCapacity > 7){
            System.out.println("Invalid seating capacity");
            System.exit(0);
        }
        this.seatingCapacity = seatingCapacity;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        if (tankSize < 0 || tankSize > 20){
            System.out.println("Invalid Tank Size");
            System.exit(0);
        }
        this.tankSize = tankSize;
    }
    public String toString() {
        return "color='" + getColor() + '\'' +
                ", seatingCapacity=" + getSeatingCapacity() +
                ", tankSize=" + getTankSize() ;

    }

    public boolean equals(Car other){
        return(getColor().equals(other.getColor()) && getSeatingCapacity() == other.getSeatingCapacity()
                && getTankSize() == other.getTankSize() );

    }
}
