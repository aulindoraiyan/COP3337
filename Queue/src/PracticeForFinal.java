import java.util.*;
public class PracticeForFinal {
    public static void main(String[] args) {
        // for arraydeque now
        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        q1.offer(5);
        q1.offer(55);
        q1.offer(78);

//        System.out.println(q1);
//        System.out.println(q1.poll());
//        System.out.println(q1.peek());

        Deque<Integer> q2 = new LinkedList<>();

        q2.offer(47);
        q2.offer(23);
        q2.offer(432);
        q2.offer(43);
//        System.out.println(q2);
//        System.out.println(q2.poll());
//        System.out.println(q2.peek());

        Stack s = new Stack();
        s.push(5);
        s.push(32);
        s.push(78);
        s.push(90);
        System.out.println(s);
        System.out.println(s.search(5));

        Stack s1 = new Stack();
        s1.push("AS");
        s1.push("bas");
        s1.push("Las");
        s1.push("has");
        s1.push("mas");

        for(int i = 0; i < s1.size(); i++){
            s1.pop();
            System.out.println(s1.peek());
        }
    }
}
