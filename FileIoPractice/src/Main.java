import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = null;
        String data = "";
        try{
            pw = new PrintWriter("source.txt");
            System.out.println("Enter a line to transfer");
            pw.println(scan.nextLine());
            System.out.println("Enter another line to transfer");
            pw.println(scan.nextLine());
            pw.close();
            Scanner reader = new Scanner(new FileInputStream("source.txt"));
            PrintWriter pw2 = null;
            while(reader.hasNext()){
                 data += reader.nextLine();
                pw2 = new PrintWriter(new FileOutputStream("Target.txt", false));
                pw2.println(data);

            }
            pw2.close();


        }catch(FileNotFoundException e){
            System.out.println("File cannot be opened. ");
        }
    }
}