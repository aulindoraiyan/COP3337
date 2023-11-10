import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Input Numerator");
            double num = scan.nextDouble();
            System.out.println("Input Denominator");
            double denom = scan.nextDouble();
            System.out.println(calc.divide(num, denom));
            System.out.println("Division is performed");
            System.out.println("Done the Job.");
        }
        catch(DivisionByZeroException e){
            System.out.println("It's division by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Numbers only");
        }
        finally {
            System.out.println("Finally it's over");
        }

    }
}