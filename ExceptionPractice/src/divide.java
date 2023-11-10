import java.util.InputMismatchException;
import java.util.Scanner;

public class divide {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        while(!done) {
            try {
                System.out.println("Enter numerator");
                int num1 = scan.nextInt();

                System.out.println("enter denominator");
                int num2 = scan.nextInt();


                System.out.println("quotient = " + (num1 / num2));
                done = true;

            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed. ");
            } catch (InputMismatchException e) {
                System.out.println("Enter numbers only");
            } catch (Exception e) {
                System.out.println();
            }
        }
    }
}
