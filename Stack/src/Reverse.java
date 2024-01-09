import java.util.Scanner;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        reverse(word);

        int l = 0;

    }
    public static void reverse(String str){
//        Stack<Character> s = new Stack();
//        for(int i = 0; i < str.length(); i++){
//            char c = str.charAt(i);
//            s.push(c);
//        }
//        for(int i = 0; i < s.size(); i++){
//            System.out.print(s.pop());
//        }
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
        for(int i = 0; i < str.length(); i++){
            System.out.print(s.pop());
        }

        //since for loop e stack.size use kore jhamela hoi we use while loop
//        String reverseWord = "";
//        while(!s.empty()){
//            reverseWord = reverseWord + s.pop();
//
//        }
//        return reverseWord;
    }
//    public static boolean isPalindrome(String str){
//        String rev = reverse(str);
//        return str.equals(rev);
//    }

}
