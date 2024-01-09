// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        if(n <= 1){
            return n;
        }
        return fact(n - 1) + fact(n - 2);
    }
}