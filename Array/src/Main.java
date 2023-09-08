import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values do u wish to enter?");
//        int choice = scan.nextInt();
//        int[] numbers = new int[choice];
        int[] numbers = new int[scan.nextInt()];

        System.out.println("Enter " + numbers.length + " values: ");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
        }

        int sum = 0, max= numbers[0], min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        // below method is for finding max and mins

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }

        }

        System.out.println("Sum of the array is: " + sum);
        System.out.println("Max value of the array is: " + max);
        System.out.println("min value of the array is: " + min);



    }
}