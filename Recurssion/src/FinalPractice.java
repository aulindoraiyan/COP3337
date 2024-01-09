import java.util.*;
public class FinalPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        backwardCounting(1234);
//        System.out.println();
//        System.out.println("Enter the word you want to enter: ");
//        String word = scan.nextLine();
//        printReverse(word, word.length() -1 );
//        System.out.println(occurenceCount(word, 'l', 0, 0));

        /**\
         * For the book problems now
         */
        problem2(5);
        System.out.println();
        problem3(9090);
        System.out.println();
        problem4(5, 1);
        System.out.println();
        problem5(5);
        System.out.println(problem15(3));
        System.out.println(calculatePower(5, 5));
        System.out.println(factorial(5));
    }
    public static void backwardCounting(int n){
        if( n < 10){
            System.out.print(n);
        }
        else{
            System.out.print(n % 10);
            backwardCounting(n / 10);
        }
    }
    public static void printReverse(String str, int lastIndex){
        if(lastIndex ==0){
            System.out.println(str.charAt(0));
        }
        else {
            System.out.print(str.charAt(lastIndex));
            printReverse(str, lastIndex -1 );
        }
    }

    public static int occurenceCount(String str, char target, int count, int index){
        if(index > str.length()-1 ){
            return count;
        }
        if(str.charAt(index) == target){
            return occurenceCount(str, target, count + 1, index + 1 );
        }
        else{
            return occurenceCount(str, target, count, index + 1);
        }
    }
    /**
     * Will cover all the book problems now
     */
    public static void problem2(int n){
        if(n == 1){
            System.out.print("*");
        }
        else{
            System.out.print("*");
            problem2(n -1 );
        }
    }
    public static void problem3(int n){
        if (n < 10){
            System.out.print(n);
        }
        else{
            System.out.print(n % 10);
            problem3(n /10);
        }
    }
    public static void problem4(int n, int index){
        if (index == n){
            System.out.print(index);
        }

        else{
            System.out.print(index + ", ");
            problem4(n, index + 1);
        }
    }
    public static void problem5(int n){
        if(n == 1)
            System.out.println(n);
        else{
            System.out.print(n);
            problem5(n-1);
        }
    }
    public static int problem15(int n){
        int sum = 0;
        if(n ==  0){
            return sum;
        }
        else
            sum = problem15(n - 1) + (int)Math.pow(n , 2);

        return sum;
    }
    public static int calculatePower(int base, int power){
        if(power == 0){
            return 1;
        }
        else{
            return calculatePower(base, power -1) * base;
        }
    }
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else
             return factorial(n -1 ) * n;
    }


}
