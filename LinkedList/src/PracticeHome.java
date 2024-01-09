import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PracticeHome {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("mango");
        list.add("orange");
        list.add("Banana");
        list.add("fruits");
        System.out.println(list);

        //adding something to 2nd Index

        list.add(2, "Dragon Fruit");
        System.out.println(list);

        //Display each item in an element in an

        System.out.println("\n" + "Displaying the items in different way");

        System.out.println("\n" + "Through loops");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n" + "Through for-each loop");
        for(String elements: list){
            System.out.println(elements);
        }

        System.out.println("\n" + "Through iterator way");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\n" + "Removing top element through remove method");
        list.remove();
        System.out.println(list);

        System.out.println("\n" + "Removing last element through removeLast method");
        list.removeLast();
        System.out.println(list);

        System.out.println("Showing index of orange: " + list.indexOf("orange"));

        list.addLast("Strawberry");
        System.out.println("\n" + "New list after adding strawberry");
        System.out.println(list);


        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("pink");
        arrList.add("purple");
        arrList.add("blue");

        System.out.println(arrList);
        LinkedList<String> linList = new LinkedList<>();
        System.out.println("\n" + "Copying all the elements from linked list and putting it in new arraylist" + linList.addAll(list) );

    }
}
