import java.util.ArrayList;
public  abstract class PracticeShoppingCart {
     private ArrayList<Product> cartItems;

     public PracticeShoppingCart(){
         cartItems = new ArrayList<>();
     }
     public void addProduct(Product items){
         cartItems.add(items);
     }
     public void removeProduct(int productId){
         Product id = null;
         if(productId == id.getProductID()){
             cartItems.remove(productId);
         }
     }
     public abstract double calculateTotalCost();
     public ArrayList<Product> getCartItems(){
         return cartItems;
     }


}
