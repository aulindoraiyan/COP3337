public class BookExercise {
    public static void main(String[] args){
        /**
         * Page no. 694
         */
        problem2(5);
//        problem3(123456789);
        problem4(9, 1);
        problem5(5);
//        System.out.println(problem15(3));

    }


    public static void problem2(int n){
        if(n==0){
            System.out.println();
        }
        else {
            System.out.print("*");
            problem2(n - 1);
        }
    }
//    public static void problem3(int n){
//        if (n < 10){
//            System.out.print(n);
//            return;
//        }
//        System.out.print(n%10);
//        problem3(n /10);
//    }
//    public static void problem3(int n){
//        if(n == 0){
//            System.out.println();
//        }
//        else {
//            System.out.print(n % 10);
//            problem3(n / 10);
//        }
//    }
//    public static void problem4(int n, int currCount){
//
//        if (currCount == n){
//            System.out.print(currCount + ".");
//        }
//        else if(currCount < n){
//            System.out.print(currCount + ", ");
//            problem4(n, currCount + 1);
//
//        }
//    }
    public static void problem4(int n,  int currIndex){
        if (currIndex >= n){
            System.out.println(currIndex+  ".");
        }else{
            System.out.print(currIndex + ", ");
            currIndex++;
            problem4(5, currIndex);
        }
    }
//    public static void problem5(int n){
//        if (n > 0){
//            System.out.print(n);
//            problem5(n -1);
//        }
//    }
    public static void problem5(int n){
        if(n == 1){
            System.out.print(1 + ".");
        }
        else {
            System.out.print(n + ", ");
            problem5(n - 1);
        }
    }
    public static int problem15(int n ){
        if (n == 1){
            return 1;
        }
        return (int) (problem15(n - 1) + Math.pow(n, 2));

    }


}
