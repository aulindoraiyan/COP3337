import java.io.FileInputStream;
import java.util.Scanner;
import java.io.*;

public class ClassActivityTwo {
    public static void main(String[]args) {
        String longestWord = "";
        String currWord = "";
        try {

            Scanner reader = new Scanner(new FileInputStream("Random.txt"));
            while(reader.hasNext()){
                currWord = reader.next();
                if(longestWord.length() < currWord.length()){
                    longestWord = currWord;
                }

            }
            reader.close();
            System.out.println(longestWord);
        }catch(IOException e){
            System.out.println("File not found");
        }
    }

}
