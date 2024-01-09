public class HelloWorld {
    public static void hello(int n){
        if (n >= 1) {
            System.out.println("Hello");
            hello(n - 1); // recursively calling
        }
        else
            return;
    }
    public static void main(String[]args){
        hello(5);
    }
}
