
//by writing extends(the class jaar sathe relationship establish korte chai), we establish a relationship between Camry and Car class.
public class Camry extends Car{

    private boolean isLuxury;

    public Camry(){
        this( true);
    }
    public Camry(String color, int seatingCapacity, double tankSize, boolean isLuxury){
        super(color, seatingCapacity, tankSize);
        setLuxury(hybrid)
    }
    public Camry( boolean isLuxury){

        setIsLuxury(isLuxury);
    }
    public Camry(Camry other){
        this( other.isLuxury);
    }



    public boolean getIsLuxury() {
        return isLuxury;
    }

    public void setIsLuxury(boolean luxury) {

        this.isLuxury = luxury;
    }

    @Override
    public String toString() {
        return "color='" + getColor() + '\'' +
                ", seatingCapacity=" + getSeatingCapacity() +
                ", tankSize=" + getTankSize() + ", isLuxury=" +  getIsLuxury();

    }

    public boolean equals(Camry other){
        return(getColor().equals(other.getColor()) && getSeatingCapacity() == other.getSeatingCapacity()
                && getTankSize() == other.getTankSize() && isLuxury == other.isLuxury);

    }
}
