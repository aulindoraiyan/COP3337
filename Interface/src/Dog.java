public class  Dog  implements Animal{
    private int numEyes;
    private int numLegs;

    public Dog (int numEyes, int numLegs){
        this.numEyes = numEyes;
        this.numLegs = numLegs;
    }


    @Override
    public void speak() {
        System.out.println("Woof woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog loves meat");

    }

}
