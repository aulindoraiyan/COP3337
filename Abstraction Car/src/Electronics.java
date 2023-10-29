class Electronics extends Product{
    private int warrantyPeriod;

    public Electronics(){
        super();
        setWarrantyPeriod(warrantyPeriod);
    }

    public Electronics(int productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        setWarrantyPeriod(warrantyPeriod);
    }
    public Electronics(Electronics other){
        super(other);
        setWarrantyPeriod(other.warrantyPeriod);
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    double calculateDiscount(){
        double discountPrice = (0.9 *getPrice());
        System.out.println("Discounted price : " + discountPrice);
        return discountPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "warrantyPeriod=" + warrantyPeriod ;
    }
    public boolean equals(Electronics other){
        return (
                getPrice() == other.getPrice() && getName().equals(other.getName()) && getProductID() == other.getProductID() &&
                        getWarrantyPeriod() == other.getWarrantyPeriod()
                );
    }
}
