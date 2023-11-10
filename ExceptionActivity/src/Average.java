import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int average = 0;
        Boolean firstDecision = false;
        Boolean secondDecision = false;
        int decisionNum = 0;
        while (!firstDecision) {
            try {

                    System.out.println("How many numbers do you want to enter: ");
                    decisionNum = scan.nextInt();

                    if (decisionNum < 0) {
                        throw new InvalidNumberException();

                    }
                    firstDecision = true;
                }catch (InvalidNumberException e) {
                System.out.println("You must enter a positive number");
            }
            }




                while(!secondDecision) {
                    try{


                    int sum = 0;

                    for (int i = 0; i < decisionNum; i++) {
                        System.out.println("Enter number " + (i + 1));
                        sum += scan.nextInt();

                    }
                    average = sum / decisionNum;
                    System.out.println();
                    secondDecision = true;
                }catch (InputMismatchException e) {
                        System.out.println("Only integers are allowed. Please try again!");
                        scan.nextLine();

                    }
                }

            System.out.println("Average is " + average);
        }
    }


