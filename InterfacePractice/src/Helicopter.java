public  abstract class Helicopter implements Vehicle{

    //Since I am defining it as Abstract, the code will run fine even if comment out the drive() method.


//    public void drive() {
//        System.out.println("The helicopter is going forward");
//    }

    @Override
    public void stop() {
        System.out.println("The helicopter is Stropping");

    }

    @Override
    public void fuelUp() {
        System.out.println("The helicopter is fueled up");

    }

    @Override
    public void reverse() {
        System.out.println("The helicopter is going reverse");
    }
    public void emergencyLanding(){
        System.out.println("The helicopter will do emergency landing");
    }
}
