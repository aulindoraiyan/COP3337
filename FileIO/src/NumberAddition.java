import java.io.*;
import java.util.Scanner;

public class NumberAddition {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name to open: ");
        String fileName = scan.nextLine();
        try{
            Scanner fileReader = new Scanner(new FileInputStream(fileName));
            int sum = 0;
            while(fileReader.hasNextInt()){

                sum += fileReader.nextInt();

            }
            PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName), true);
            fileReader.close();
            System.out.println("Sum = " + sum);
            //to write the sum in the file:
            fileWriter.println("Sum =" + sum);
            fileWriter.close();
            System.out.println("Done");



        }catch(FileNotFoundException e){
            System.out.println("Unable to open file " + fileName);
        }
    }
}
