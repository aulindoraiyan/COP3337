import java.util.Scanner;

public class Test {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 5 and 10: ");
        int num = scan.nextInt();


        try {
            if (num < 5 || num > 10)
                throw new InvalidNumberException();
            System.out.println("GoodJob");

        }
        catch(InvalidNumberException e){
            System.out.println("It's not a valid number : 0");
        }
    }
}
