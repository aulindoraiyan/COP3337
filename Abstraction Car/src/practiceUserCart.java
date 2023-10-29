public class practiceUserCart extends PracticeShoppingCart{


    @Override
    public double calculateTotalCost() {
        double totalCost = 0;
        for(Product product : getCartItems()){
            totalCost += product.getPrice() - product.calculateDiscount();
        }
        return totalCost;
    }
}
