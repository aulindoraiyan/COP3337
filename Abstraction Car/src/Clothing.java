public class Clothing extends Product{
    private String size;

    public Clothing(){
        this(0, "No name", 0.0, "No Size");
    }
    public Clothing(int productID, String name, double price, String size){
        super(productID, name, price );
        setSize(size);
    }
    public Clothing(Clothing other){
        super(other);
        setSize(other.size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public double calculateDiscount(){
        double discountPrice = (0.2*getPrice());
        System.out.println("Discount price: " + discountPrice);
        return discountPrice;
    }
    public String toString(){
        return (
                super.toString() + " Size: " + getSize()
                );
    }
    //need to make the equals method
}
