import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the file name");
        //The name of the file with sentence is: Source.txt
        String fileName = scan.nextLine();


        //Setting the name of the temporary file.
        String name1 = "temp";
        int number = 1;
        String tempName = name1 + number;
        File aFile = new File(tempName);

        //Checking if the temporary file exists. If it exists it will create a new file otherwise it will create a new file.
        if (aFile.exists()) {
            number++;
            tempName = name1 + number;

            aFile = new File(tempName);
            System.out.println("A temporary file already exists. So, a new temporary file is created named: " + aFile);


        }
        else {
            try {
                aFile.createNewFile();
                System.out.println("There was no previous temporary file, so a new file is created named " + aFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Copying data from source file to the temporary file.
        PrintWriter pw = null;
        Scanner reader = null;
        String data = "";
        try{
            System.out.println("Entered the try block to copy data from " + fileName + " to " + tempName);
            reader = new Scanner(new FileInputStream(fileName));
            pw = new PrintWriter(new FileOutputStream(tempName));
            while(reader.hasNext()){
                String word = reader.next();


                if (word.endsWith(".")) {

                    pw.println(word.substring(0, word.length() - 1));
                    pw.println();
                } else {

                    pw.print(word + " ");
                }
            }

            pw.close();
            reader.close();


        }catch(FileNotFoundException e){
            System.out.println("File cannot be opened");
        }

        //Copying the content of the temporary file back to the source file
        Scanner reader2 = null;
        PrintWriter pw2 = null;
        try{
            System.out.println("Entered the try block to copy data from " + tempName + " to " + fileName);
            reader2 = new Scanner(new FileInputStream(tempName));
            pw2 = new PrintWriter(new FileOutputStream(fileName));
            while(reader2.hasNextLine()){


                String line = reader2.nextLine();
                pw2.println(line);

            }

            pw2.close();
            reader2.close();


        }catch(FileNotFoundException e){
            System.out.println("File cannot be opened");
        }


        //deleting the temporary file as per instruction. 
        aFile.delete();
        System.out.println("The "  + tempName + " file is deleted.");
        System.out.println("End of program : ) ");






    }
}