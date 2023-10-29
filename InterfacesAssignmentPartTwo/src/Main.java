import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Henry", "Miller", "Tropic of Cancer");
        Author a2 = new Author("Nalo", "Hopkinson", "Brown Girl in the Ring");
        Author a3 = new Author("Frank", "Miller", "300");
        Author a4 = new Author("Deborah", "Hopkinson", "Sky Boys");
        Author a5 = new Author("George R. R.", "Martin", "Song of Ice and Fire");

        ArrayList<Author> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        for(Author a: list){
            System.out.println(a);
        }
        System.out.println();

        Collections.sort(list);

        System.out.println("*** After sorting ***");
        System.out.println();
        for(Author a: list){
            System.out.println(a);
        }
    }
}