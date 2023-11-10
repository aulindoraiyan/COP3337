public class Calculator {
    public double divide(double x, double y) throws ArithmeticException {
        if (y == 0){
            throw new ArithmeticException();
        }
        return x/ y;

    }
}
