import java.util.Scanner;
import java.io.*;

public class FileTransfer {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = null;
//       try{
//           Boolean loop = true;
//           while(loop) {
//               pw = new PrintWriter(new FileOutputStream("FileTransferSource", False));
//
//               System.out.println("Enter lines for the files:");
//               pw.println(scan.nextLine());
//               System.out.println("Do you want to add new lines?");
//
//               String decision = scan.nextLine();
//               if (decision.equalsIgnoreCase("No")) {
//                   loop = false;
//               }
//               pw.close();
//           }
//       }catch(FileNotFoundException e){
//           System.out.println("File was not found");
//       }

       // now I will transwfer the files into a new file.
        String data = "";
        PrintWriter pw2 = null;
        try{

            Scanner scanning = new Scanner(new FileInputStream("FileTransferSource"));
            pw2 = new PrintWriter(new FileOutputStream("Target.txt"));
            while(scanning.hasNext()){
                data += scanning.next() ;


            }
            scanning.close();

            pw2.println(data + " ");
            pw2.close();

        }catch(FileNotFoundException e){
            System.out.println("There is a problem");
        }

    }
}
