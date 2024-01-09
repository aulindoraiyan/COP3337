import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassActivityPractice {

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = scan.nextLine();
        System.out.println("Enter a character you want to find");
        char c = scan.next().charAt(0);
        System.out.println(occurenceCount(input, c,0, input.length()-1 ));
        printReverse(input, input.length() - 1 );
    }



    public static void printReverse(String s, int lastIndex){
        if(lastIndex == 0){
            System.out.print(s.charAt(0));
        }
        else {
            System.out.print(s.charAt(lastIndex));
            printReverse(s, lastIndex - 1);
        }

    }

//    public static void occurenceCount(String s, char c, int index, int counter){
//
//        if(s.charAt(index) == c){
//            counter += 1;
//        }
//        if((index + 1) < s.length()){
//            occurenceCount(s, c, index + 1, counter);
//        }
//        else {
//            System.out.println("occurence is " + counter);
//        }
//    }

    public static int occurenceCount(String s, char target, int counter, int index){
        if(index < 0){
            return counter;
        }
        if(s.charAt(index) == target){
            counter++;
            return occurenceCount(s, target, counter, index - 1);
        }
        else {
            return occurenceCount(s, target, counter, index -1 );
        }
    }
}
