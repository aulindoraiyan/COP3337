import java.io.*;
import java.util.Scanner;

public class FileIo {
    public static void main(String[]args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scan.nextLine();
        File file = new File(fileName);

        if(file.isFile()){

//            file.delete();
//            System.out.println("File deleted successfully");

            //if I want to find the path:
//            System.out.println(file.getAbsolutePath());

//            System.out.println("It's a file.");
            //to check if the file exists

        } else if (file.isDirectory()) {
            System.out.println("it's a folder");
        }
        else if(file.exists()){
            System.out.println("File already exists");
        }
        else{
            try {
                file.createNewFile();
                System.out.println("File created " + file);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
            System.out.println("Enter a line: ");
            pw.println(scan.nextLine());
            pw.close();
            System.out.println("Written to the file.");
        }
        catch(FileNotFoundException e){
            
        }
    }
}
