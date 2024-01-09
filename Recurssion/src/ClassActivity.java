import java.util.Scanner;

public class ClassActivity {
    //Vertical Number
    public static void classActivity(int n){
        if (n <= 10){
            System.out.println(n);
        }
        else{
            int tempNum = n % 10;
            System.out.println(tempNum);
            classActivity(n / 10);
        }

    }
    // A method jeta String ke reverse korbe. For example Hello input dile olleh dekhabe
    public static void printReverse(String s, int index){


        if(index == 0){
            System.out.println("\n" + "Done");
        }
        else {
            System.out.print(s.charAt(index -1 ));
            printReverse(s, index - 1);
        }

        //professor's solution

//        if(index < s.length()){
//            printReverse(s, index + 1);
//            System.out.println(s.charAt(index));
//        }



    }
//    public static void occurenceCount(String s, char c, int index, int counter){
//        if(s.charAt(index) == c){
//            counter += 1;
//        }
//        if((index + 1) < s.length()){
//            occurenceCount(s, c, index + 1, counter);
//        }
//        else {
//            System.out.println("occurence is " + counter);
//        }
//
//        //professor's solution
//        if(index < s.length()){
//            if(s.charAt(index) == c){
//                counter++;
//
//            }
//            occurenceCount(s, c, index + 1, counter);
//        }
//        else
//            System.out.println(counter);
//
//    }
    public static void main (String[] args){

        //vertical printing
//        classActivity(5167);
        System.out.println("Enter a String");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        printReverse(input, input.length() );
//        System.out.println("What character do u want to find?");
//        char inputChar = scan.next().charAt(0);
//        occurenceCount(input, inputChar, input.length(), 0);
    }
}
