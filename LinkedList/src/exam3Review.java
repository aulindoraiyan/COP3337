import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class exam3Review {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add("A");
//        list.add("B");
//        list.add("A");
//        list.add(null);
//        System.out.println(list);


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(0, 4);
        list.remove(1);
        System.out.println(list);



    }
}
