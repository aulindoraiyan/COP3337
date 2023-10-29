public class Main {
    public static void main(String[] args){
        Dog d = new Dog(2, 4);

        d.eat();
        d.speak();

        Animal dog = new Dog(2, 2);
        Animal bb; // we can store variable for interface

//        Asian a1 = new Asian("Mandarin", "black");
//        System.out.println(a1);
//        a1.legs();


        White w1 = new White("English", "brown");
        System.out.println(w1);
        w1.blood();
        w1.legs();

    }
}
