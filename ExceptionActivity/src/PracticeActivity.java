import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeActivity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double average = 0;
        double sum = 0;
        int input = 0;
        boolean done1 = false;
        while(!done1) {
            try {
                System.out.println("How many numbers do you want to average?");
                input = scan.nextInt();
                if (input < 0) {
                    throw new PracticeInvalidNumberException();
                }
                done1 = true;
            } catch (PracticeInvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            for (int i = 0; i < input; i++) {
                System.out.println("Enter number " + (i + 1));
                sum += scan.nextInt();
            }
            average = sum / input;
        }catch(InputMismatchException e){
            System.out.println("only integers are allowed");
        }
        System.out.println("Average is: " + average);


    }
}
