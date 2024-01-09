import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //I will solve this question in 2 way. One using multiple function recursive methods,
        //and other using a single recurssive method.

        System.out.println("Enter the Value of n");
        int n = scan.nextInt();
        System.out.println("Enter the value of r");
        int r = scan.nextInt();
        if (n >= r) {

            System.out.println("*******Showing in First Way********");
            System.out.println("There are " + taskTwoFirstWay(n, r) + " possible combination");
        }
        else
            System.out.println("Please give right input where n > r");

        System.out.println("*******Showing in Second Way********");
        System.out.println("There are " + taskTwoSecondWay(n, r) + " possible combination");
    }



    //First Way
    public static int taskTwoFirstWay(int n, int r){
        // will take care of numerator first.
        if(r == 0 || r == n){
            return 1;
        }
        else{
            return taskTwoFirstWay(n -1 , r -1 ) + taskTwoFirstWay(n - 1, r);
        }

    }


    // 2nd way Below
    public static int taskTwoSecondWay(int n, int r){
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nMinusR = n - r;
        int nMinusRFactorial = factorial(nMinusR);
        int combination = nFactorial/(rFactorial * nMinusRFactorial);
        return combination;
    }
    public static int factorial(int n){
        if(n > 1){
            return factorial(n - 1) * n;
        }
        else
            return n ;
    }
}
