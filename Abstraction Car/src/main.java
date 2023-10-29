public class main {
    public static void main(String[] args){
        Electronics e1 = new Electronics(2, "legion", 985, 1);
        Clothing c1 = new Clothing(45, "Hoodie", 35, "Medium");
        Clothing cl = new Clothing();

        userCart cart = new userCart();

        cart.addProduct(e1);
        cart.addProduct(c1);

        double totalCost = cart.calculateTotalCost();
        System.out.println("You bought stuffs worth $ " + totalCost);
    }
}
