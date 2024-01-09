import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people are in the room? ");
        int input = scan.nextInt();
        System.out.println("If everyone shakes hands once, there will be " + taskOne(input) + " handshakes. ");
    }
    public static int taskOne(int n){
        if(n ==2){
            return 1;
        }
        if(n == 1){
            return 0;
        }

        else{
            return taskOne(n -1 ) + n-1;
        }

    }
}
