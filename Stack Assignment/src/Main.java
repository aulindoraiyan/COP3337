import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the parenthesis expression: ");
        String input = scan.nextLine();
        System.out.println(parenthesisCheck(input));
    }

//    public static String parenthesisCheck(String s) {
//        Stack<Character> stack = new Stack<>();
//        if (s.length() % 2 != 0) {
//            return "Not Balanced";
//        }
//        for (char c : s.toCharArray()) {
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else if (!stack.isEmpty() && c == ')' && stack.peek() == '(') {
//                stack.pop();
//            } else if (!stack.isEmpty() && c == '}' && stack.peek() == '{') {
//                stack.pop();
//            } else if (!stack.isEmpty() && c == ']' && stack.peek() == '[') {
//                stack.pop();
//            }
//        }
//        if (stack.isEmpty()) {
//            return "Balanced";
//        } else {
//            return "Not Balanced";
//        }
//    }
    public static String parenthesisCheck(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && stack.peek() == '(' && !stack.isEmpty()){
                stack.pop();
            }
            else if(str.charAt(i) == '}' && stack.peek() == '{' && !stack.isEmpty()){
                stack.pop();
            }
            else if(str.charAt(i) == ']' && stack.peek() == '[' && !stack.isEmpty()){
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "Balanced";
        }
        else
            return "Not Balanced";
        }

    /**
     * Stack<Character> s = new Stack<>();
     * for (int i = 0; i < str.length(); i++{
     *     if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
     *         s.push(str.charAt(i));
     *     }
     *     else if(str.charAt(i) == ')' && s.peek() == ')' && !s.isEmpty()){
     *         s.pop()
     *     }     *     }
     * }
     */
}

