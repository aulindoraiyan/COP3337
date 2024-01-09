import java.util.ArrayList;
import java.util.LinkedList;

public class UnderstandingStack {
    public static void main(String[] args) {
        LinkedList<Integer> pushlink = new LinkedList<>();
        LinkedList<Integer> addlink = new LinkedList<>();
        LinkedList<Integer> offerlink = new LinkedList<>();
        for(int i = 5; i > 0; i--){
            pushlink.push(i);
            addlink.add(i);
            offerlink.offer(i);

        }
        System.out.println("Push: "+  pushlink);
//        System.out.println("add: "+  addlink);
        System.out.println("offer: "+  offerlink);
        pushlink.pop();
        System.out.println(pushlink);
        offerlink.poll();
        System.out.println(offerlink);
    }

}
