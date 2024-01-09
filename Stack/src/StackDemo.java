import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(45);
        s.push(50);
        s.push(20);
        s.push(19);
        s.push(23);
        System.out.println(s);

        int num = s.pop();
        System.out.println("The number that is popped: " + num);
        System.out.println(s);
    }


}
