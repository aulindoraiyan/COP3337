public class CarPractice implements  Comparable<CarPractice>{
    private String make;
    private int model;
    private int mileage;
    private double price;

    public CarPractice(String make, int model, int mileage, double price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }
    private CarPractice(){
        this("No make", 0, 0, 0.0);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "make='" + make + '\'' +
                ", model=" + model +
                ", mileage=" + mileage +
                ", price=" + price ;
    }

    @Override
//    public int compareTo(CarPractice o) {
//        if(this.price > o.price){
//            return 1;
//        } else if (this.price < o.price) {
//            return -1;
//        }
//        else
//            return 0;
//
//    }
    public int compareTo(CarPractice o){
        if(this.make.compareTo(o.make)!= 0){
            return o.make.compareTo(this.make);
        }
        return 0;

    }
}
