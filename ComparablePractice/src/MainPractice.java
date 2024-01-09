import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        CarPractice c1 = new CarPractice("Toyota", 2009, 15600, 5000);
        CarPractice c2 = new CarPractice("BMW", 2019, 15600, 5200);
        CarPractice c3 = new CarPractice("Nissan", 2015, 18600, 6000);

        ArrayList<CarPractice> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Collections.sort(list);
        System.out.println(list);
    }
}
