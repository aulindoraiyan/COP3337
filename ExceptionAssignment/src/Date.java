import java.util.Scanner;

public class Date {
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args){
        Boolean repeat = true;
        String repeatDecision = "";

            System.out.println("Enter date to parse(MM/DD/YYYY): ");
            String inputDate = scan.nextLine();

            String[] dateParts = inputDate.split("/", 3);

            String month = dateParts[0];
            String day = dateParts[1];
            String year = dateParts[2];
            DateTrimming(month, day, year);




    }
    public static void DateTrimming(String month, String day, String year){
        //Month ke size korboo
        int monthNumber = Integer.parseInt(month);
        Boolean monthOk = false;
        while(!monthOk) {
            try {
                if ((monthNumber < 1) || monthNumber > 12) {
                    throw new MonthException();
                }
                monthOk = true;
            } catch (MonthException e) {
                System.out.println("Invalid month. Reenter a valid month: ");
                monthNumber = scan.nextInt();
            }
        }
        int dayNumber = Integer.parseInt(day);
        //day ke size korbo
        Boolean dayOkay = false;
        while(!dayOkay) {
            try {
                if (monthNumber == 1 && (dayNumber < 1 || dayNumber > 31)) {
                    throw new DayException();

                }
                if (monthNumber == 2 && (dayNumber < 1 || dayNumber > 28)) {
                    throw new DayException();

                }
                if (monthNumber == 3 && (dayNumber < 1 || dayNumber > 31)) {
                    throw new DayException();

                }
                if (monthNumber == 4 && (dayNumber < 1 || dayNumber > 30)) {
                    throw new DayException();

                }
                if (monthNumber == 5 && (dayNumber < 1 || dayNumber > 31)) {
                    throw new DayException();

                }
                if (monthNumber == 6 && (dayNumber < 1 || dayNumber > 30)) {
                    throw new DayException();

                }
                if (monthNumber == 7 && (dayNumber < 1 || dayNumber > 31)) {
                    throw new DayException();

                }
                if (monthNumber == 8 && (dayNumber < 1 || dayNumber > 31)) {
                    throw new DayException();

                }
                if (monthNumber == 9 && (dayNumber < 1 || dayNumber > 30)) {
                    throw new DayException();

                }
                if (monthNumber == 10 && (dayNumber < 1 || dayNumber > 31)) {
                    throw new DayException();

                }
                if (monthNumber == 11 && (dayNumber < 1 || dayNumber > 30)) {
                    throw new DayException();

                }
                if (monthNumber == 12 && (dayNumber < 1 || dayNumber > 31)) {
                    throw new DayException();

                }

                dayOkay = true;

            } catch (DayException e) {
                System.out.println("Invalid day. Reenter a valid day: ");
                dayNumber = scan.nextInt();

            }
        }

        //Year ke size korbo
        int yearNumber = Integer.parseInt(year);
        Boolean yearOk = false;
        while(!yearOk) {
            try {
                if (yearNumber < 1000 || yearNumber > 3000) {
                    throw new YearException();
                }
                yearOk = true;

            } catch (YearException e) {
                System.out.println("Invalid year. Reenter a valid year:");
                yearNumber = scan.nextInt();
            }
        }

//        System.out.println(month + " / " + day +  " / " + year);



        String exactDates = "";

        switch(monthNumber){
            case 1:
                exactDates = "Parsed date: " + "January " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 2:
                exactDates = "Parsed date: " + "February " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 3:
                exactDates = "Parsed date: " + "March " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 4:
                exactDates = "Parsed date: " + "April " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 5:
                exactDates = "Parsed date: " + "May " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 6:
                exactDates = "Parsed date: " + "June " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 7:
                exactDates = "Parsed date: " + "July " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 8:
                exactDates = "Parsed date: " + "August " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 9:
                exactDates = "Parsed date: " + "September " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 10:
                exactDates = "Parsed date: " + "October " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 11:
                exactDates = "Parsed date: " + "November " + dayNumber + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            case 12:
                exactDates = "Parsed date: " + "December " + day + ", " + yearNumber;
                System.out.println(exactDates);
                break;
            default:
                System.out.println("Enter correct month")
                ;
                System.exit(0);
        };

    }
}
