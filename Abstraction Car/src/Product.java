public abstract  class Product {
    private int productID;
    private String name;
    private double price;

    public Product(){
        this(0, "No name", 0.0);
    }
    public Product(int productID, String name, double price){
        setProductID(productID);
        setName(name);
        setPrice(price);
    }
    public Product(Product other){
        setProductID(other.productID);
        setName(other.name);
        setPrice(other.price);
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();

    @Override
    public String toString() {
        return "productID=" + productID +
                ", name='" + name + '\'' +
                ", price=" + price ;
    }


}
