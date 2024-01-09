import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
//        ArrayDeque q = new ArrayDeque();
//        q.offer(35);
//        q.offer(45);
//        q.offer(55);
//        q.offer(39);
//        System.out.println(q);
//        System.out.println("showing polled element: " + q.poll());
//        System.out.println("\n" + "Showing updated queue");
//        System.out.println(q);sou

        System.out.println("ArrayDeque");
        ArrayDeque q = new ArrayDeque();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
        System.out.println("Showing polled element: " + q.poll());
        System.out.println(q);


//        System.out.println("Now entering queue");

        /**
         * Making queue with linkedList now
         */
//        Deque q1 = new LinkedList();
//        q1.offer(35);
//        q1.offer(45);
//        q1.offer(55);
//        q1.offer(39);
//        System.out.println(q1);
//        System.out.println("showing polled element: " + q1.poll());
//        System.out.println("\n" + "Showing updated queue");
//        System.out.println(q1);
//        System.out.println(q1.peek());

         Deque linkedQ = new LinkedList();

         linkedQ.offer(5);
         linkedQ.offer(6);
         linkedQ.offer(7);
         linkedQ.offer(8);
        System.out.println("Linked Deque: " + linkedQ);
        System.out.println("Peaking at: " + linkedQ.peek());
        System.out.println(linkedQ.poll());
        System.out.println("Updated LinkedList Queue: " + linkedQ);
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue.contains("A") + " " + queue.contains("C"));

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.search("C") + " " + stack.search("A"));
    }


}
