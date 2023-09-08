public class Prius {

    private String color;
    private int seatingCapacity;
    private double tankSize;
    private boolean isHybrid;

    public Prius(){
        this("No color yet", 0, 0.0, true);
    }
    public Prius(String color, int seatingCapacity, double tankSize, boolean isHybrid){
        setColor(color);
        setSeatingCapacity(seatingCapacity);
        setTankSize(tankSize);
        setIsHybrid(isHybrid);
    }
    public Prius(Prius other){
        this(other.color, other.seatingCapacity, other.tankSize, other.isHybrid);
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

    public boolean getIsHybrid() {
        return isHybrid;
    }

    public void setIsHybrid(boolean hybrid) {

        this.isHybrid = hybrid;
    }

    @Override
    public String toString() {
        return "color='" + getColor() + '\'' +
                ", seatingCapacity=" + getSeatingCapacity() +
                ", tankSize=" + getTankSize() +
                ", isHybrid=" +  getIsHybrid();

    }

    public boolean equals(Prius other){
        return(getColor().equals(other.getColor()) && getSeatingCapacity() == other.getSeatingCapacity()
                && getTankSize() == other.getTankSize() && isHybrid== other.isHybrid);

    }
}
