public class Test {
    public static int rec(int a, int b){
        if(b <= 0){
            return 1;
        }
        else
            return rec(a, b/a);
    }

    public static void main(String[] args) {
        System.out.println(rec(50, 20));
        System.out.println(fact(8));
    }

    public static int fact(int n){
        if(n <= 1){
            return n;
        }
        return fact(n-1 ) + fact(n -2);
    }

}
