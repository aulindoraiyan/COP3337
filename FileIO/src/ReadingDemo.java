import javax.crypto.spec.PSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingDemo {
    public static void main (String[] args){
        try {
//            FileInputStream fis = new FileInputStream("file.txt");
//            Scanner reader = new Scanner(fis);
            //you can also write it like
            Scanner reader = new Scanner(new FileInputStream("File.txt"));


            //to reade the first line
            String line = reader.nextLine();
            System.out.println(line);
            //to read up to the next space. reading word by word
            System.out.println(reader.next());

            //to read the entire file. it will read line by line

            while(reader.hasNext()){
                System.out.println(reader.nextLine());

            }
            //to read the entire file word by word
            while(reader.hasNext()){
                System.out.println(reader.hasNext());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Unable to open file");
            System.exit(0);
        }

    }
}
