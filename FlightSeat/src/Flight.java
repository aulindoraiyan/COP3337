import java.util.Scanner;

public class Flight {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] flightSeat = new char[7][4];
        Flight fs = new Flight();

        String decision = "";



            System.out.println("You will be selecting seats for this airplane.");
            fs.printArray(flightSeat);

            System.out.println("You will input the seat selection using the row number and then the seat letter (ex - 3B) " );
            System.out.println("Please enter the seat number or Q to quit");
            String input = scan.next();

        do{
            fs.bookSeat(input, flightSeat);
            System.out.println("Please enter the seat number or Q to quit");
             input = scan.next();
        }while(!input.equals("Q"));

        System.out.println("Thank you have a great day");


    }

    public void printArray(char[][] arr){
        for( int row = 0; row < arr.length; row++){
            System.out.print(row + 1 + " ");
            for(int col = 0; col < arr[0].length; col++){
//
//                System.out.print(arr[row][col] + " ");
                char seat = arr[row][col];
                if (seat == 0) {
                    seat = (char) ('A' + col);
                System.out.print(seat + " ");
                }
                else {
                    System.out.print(seat + " ");
                }
            }
            System.out.println();
        }

    }



    public void bookSeat(String seat, char[][] arr ){
        int seatRow = Integer.parseInt(Character.toString(seat.charAt(0))) -1;
        int seatCol = seat.charAt(seat.length()-1) -'A';

        int row = arr.length;
        int col = arr[0].length;



            if (seatRow >= 0 && seatRow <= row && seatCol >= 0 && seatCol < col) {
                if (arr[seatRow][seatCol] == 'X') {
                    System.out.println("Sorry, this seat is occupied");
                } else {
                    arr[seatRow][seatCol] = 'X';
                    printArray(arr);

                }
            } else {
                System.out.println("Invalid Seat Number");
            }





    }
}