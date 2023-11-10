import java.util.Scanner;
public class Addition {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try {
            System.out.println("Enter first number");
            num1 = scan.nextInt();

            System.out.println("Enter second number");
            num2 = scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Please enter numbers only");
        }

        System.out.println("Total = " + (num1 + num2));
    }
}
