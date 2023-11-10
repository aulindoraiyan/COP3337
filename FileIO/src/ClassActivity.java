import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.io.*;


public class ClassActivity {
    public static void main (String[] args) {

        String data = "";
        try {
            Scanner reader = new Scanner(new FileInputStream("Source.txt"));
            while (reader.hasNextLine()) {
                data += reader.nextLine();
            }
            reader.close();
            PrintWriter fw = new PrintWriter(new FileOutputStream("Target.txt", false));
            fw.println(data);
            fw.close();
        }catch(IOException e){
            System.out.println("Cannot open file. ");
        }
    }


}
