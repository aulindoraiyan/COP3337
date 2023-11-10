import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class WritingDemo {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        // better way is
        PrintWriter pw = null;

        try {

//            PrintWriter pw = new PrintWriter("sample.txt");
            pw = new PrintWriter("sample.txt");
            //inputStream
            pw.println("This is my first file in java.");
            //outputStream
            pw.flush();
            pw.println("This is another line in the file");
            pw.close();
            //if we use pw.close, then we do not need to flush the data.
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot create file. ");

        }
        PrintWriter pw2 = null;
        System.out.println("Enter the file name");
        String fileName= scan.nextLine();
        System.out.println("Enter a line");
        try{
            FileOutputStream out = new FileOutputStream(fileName, true);
            // here when i am passing the argument true, it means that it should append. By deafault it is false.

            pw2= new PrintWriter(out);
            pw2.println(scan.nextLine());
            pw2.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
