import java.util.Scanner;
import java.io.*;
public class FileIoPractice {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to play with");
        String fileName = scan.nextLine();


        File aFile = new File(fileName);
        if(aFile.isFile()){
            System.out.println("it's a file!");
        }
        if(aFile.exists()){
            System.out.println("The file exists.");
            System.out.println(aFile.getAbsolutePath());
        }
        else{
            try{
                PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
            }catch(FileNotFoundException e){
                System.out.println("File could not be created.");
            }
        }
//        aFile.delete();

    }


}
