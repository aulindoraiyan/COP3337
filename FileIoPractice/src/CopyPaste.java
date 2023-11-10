import java.util.Scanner;
import java.io.*;


public class CopyPaste {

    public static void main(String[] args){
        String data = "";
        try {
            Scanner reader = new Scanner(new FileInputStream("Copy.txt"));
            PrintWriter pw = null;
            while(reader.hasNext()){
                data += reader.next() + " ";
                pw = new PrintWriter(new FileOutputStream("Paste.txt"));
                pw.println(data);

            }
            reader.close();
            pw.close();
        }catch(FileNotFoundException e){
            System.out.println("file could not be opened");
        }
    }
}
