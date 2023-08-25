public class Vehicle {
    private int tankSize;
    private double efficiency;
    private double fuelInTank;

    public Vehicle(){
        tankSize = 0;
        efficiency = 0.0;
        fuelInTank = 0.0;

    }
    public  Vehicle(int tankSize, double efficiency, double fuelInTank){
        this.tankSize = tankSize;
        this.efficiency = efficiency;
        this.fuelInTank = fuelInTank;
    }

    public Vehicle(Vehicle aVehicle){
        this(aVehicle.tankSize, aVehicle.efficiency, aVehicle.fuelInTank);
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    public void setFuelInTank(double fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    public double availableTankCapacity(){
        double remaining;
//        setFuelInTank((double)getTankSize() -getFuelInTank());
        remaining = (double)getTankSize() -getFuelInTank();
        System.out.println("Available Capacity of Tank = " + remaining);
        return remaining;

    }
    public void addPetrol(double morePetrol){
        double remaining = (double)getTankSize() -getFuelInTank();


        if (remaining < morePetrol){
            System.out.println("Error! Add less petrol. Not enough space");
        }
        else {
            setFuelInTank(getFuelInTank() + morePetrol);
            System.out.println("Adding " + morePetrol + " gallons fuel to the tank.");
            System.out.println("Fuel in tank = " + getFuelInTank() );

        }
    }

    public double driveTo(){
        double distance = getEfficiency() * getFuelInTank();

        System.out.println("You can travel " + distance + " miles with available fuel.");
        return distance;
    }




}

