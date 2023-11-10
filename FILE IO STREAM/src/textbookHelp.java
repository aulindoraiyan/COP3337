import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class textbookHelp {
    public static void main (String[] args){
        PrintWriter pw = null;
        try{
            FileOutputStream fos  = new FileOutputStream("sam.txt", true);
            pw = new PrintWriter(fos);
            pw.println("This is the second line in sam file");
            pw.flush();

        }catch (IOException e){
            System.out.println("File not founds");
        }

    }
}
