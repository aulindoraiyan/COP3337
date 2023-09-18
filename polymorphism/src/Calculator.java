public class Calculator {
    //method overloading
    public int add(int x, int y){
        return x + y;
    }
    public int add(int x, int y, int z){
        return x + y + z;
    }
    public int add(double x, double y){
        return (int)(x+y);
    }
    public double add(double x, double y, double z){
        return x + y + z;
    }
}
