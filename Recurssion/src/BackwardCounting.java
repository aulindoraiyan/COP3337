public class BackwardCounting {
    public static void backwardCounting(int n){
        if(n > 0){
            System.out.println(n);
            backwardCounting(n -1); // recursively calling
        }

    }

    public static void main(String [] args){

        backwardCounting(7);
    }
}
