import java.util.ArrayList;

public abstract  class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart(){
        cartItems = new ArrayList<>();
    }

    public void addProduct (Product product){
        cartItems.add(product);
    }
    public void removeProduct(int productId){
        Product id = null;

        if(productId == id.getProductID()){
            cartItems.remove(productId);
        }
    }
//    public abstract double calculateTotalCost();
    public abstract double calculateCost();


    public ArrayList<Product> getCartItems(){
        return cartItems;
    }
}
