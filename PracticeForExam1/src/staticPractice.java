public class staticPractice {
    public static void main(String[] args){
        staticPractice sp = new staticPractice();
        int a = 5;
        int b = 4;
        int c = sp.add(a, b);
        System.out.println(c);

        int d = sp.subtract(a, b);
        System.out.println(d);

    }
    public static int add(int a, int b){
        int c;
        c = a + b;
        return c;
    }
    public int subtract(int a, int b){
        int c = a - b;
        return c;
    }

}
