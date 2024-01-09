import java.util.ArrayList;
import java.util.Collections;

public class ArrayListYoutube {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<Boolean> list3 = new ArrayList<>();

        //addElements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get Elements
        int element = list.get(0);
        System.out.println(element);

        //add Element in Between
        list.add(1, 5);
        System.out.println(list);

        //Set Element
        list.set(1, 10);
        System.out.println(list);

        //Delete Element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        //ascending order
        Collections.sort(list);
        System.out.println(list);
     }
}
