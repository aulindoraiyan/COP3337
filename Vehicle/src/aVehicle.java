public class aVehicle {
    public static void main (String[] args){
        Vehicle aCar = new Vehicle(17, 21.5, 0.0 );

        System.out.println("Fuel In Tank = " + aCar.getFuelInTank());
        System.out.println("Total Capacity of Tank = " + aCar.getTankSize() );
        System.out.println("Fuel Efficiency of Tank = " + aCar.getEfficiency());

        aCar.availableTankCapacity();
        aCar.addPetrol(15);

        aCar.driveTo();



    }

}
