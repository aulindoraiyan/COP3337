import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PracticeClassCode {
    public static void main(String [] args){
        PrintWriter pw = null;
        try{
             FileOutputStream pos = new FileOutputStream("makeNewFile.txt", true);
            pw = new PrintWriter(pos);
            //input Stream
            pw.println("This is the second line");
            pw.flush();

            pw.println("This is the third line");
            pw.close();
        }catch (IOException e){
            System.out.println("File not found");
        }
    }
}
