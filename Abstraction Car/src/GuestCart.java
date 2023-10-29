public class GuestCart extends ShoppingCart{
    public double calculateTotalCost(){
        double totalCost = 0;
        for(Product product : getCartItems()){
            totalCost += product.getPrice() - product.calculateDiscount();
        }
        return totalCost;

    }
}
