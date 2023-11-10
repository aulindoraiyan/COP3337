import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = keyboard.nextInt();
        System.out.println("Enter start number");
        int start = keyboard.nextInt();
        System.out.println("Enter ending number");
        int end = keyboard.nextInt();

        PrintWriter writer  = null;

        try{
            writer = new PrintWriter(new FileOutputStream("Tables.txt", true));
            for(int i = start; i <= end; i++){
                writer.println(num + " x " + i + " = " + (num * i));
            }
            writer.close();
            System.out.println("Done");
        }catch(FileNotFoundException e){
            System.out.println("Unable to open the file");
            System.exit(0);
        }

    }
}