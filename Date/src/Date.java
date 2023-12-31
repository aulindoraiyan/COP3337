public class Date {
        String month;
        int day;
        int year;

        public Date(){
            this.month = "January";
            this.day = 1;
            this.year = 1000;

        }
        public Date(String month, int day, int year){
            setDate(month, day, year);

        }
        public Date(int month, int day, int year){
            setDate(month, day, year);
        }
        public Date(int year){
            setDate(1, 1, year);
        }
        public Date(Date aDate){
            this.month = aDate.month;
            this.day = aDate.day;
            this.year = aDate.year;
        }
        public String monthString(int month){
            switch(month){
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return "Error";

            }
        }

        public void setDate(int month, int day, int year){

            if(dateOk( month,  day,  year) == true){
                this.month = monthString(month);
                this.day = day;
                this.year = year;
            }
            else{
                System.out.println("Fatal error");
                System.exit(0);
            }


        }
        public void setDate(String month, int day, int year){
            if(dateOk( month,  day,  year) == true){
                this.month = month;
                this.day = day;
                this.year = year;
            }
            else{
                System.out.println("Fatal error");
                System.exit(0);
            }
        }

        public void setMonth(String month){
            if(monthOk(month)){
                this.month = month;
            }
            else{
                System.out.println("Invalid month");
            }
        }

        public void setMonth(int month){
            if(month > 0 && month < 13 ){
                this.month= monthString(month);
            }
            else{
                System.out.println("Invalid month");
            }
        }
        public void setDay(int day){
            if(day>= 1 && day < 32 ){
                this.day= day;
            }
            else{
                System.out.println("Invalid day");
            }
        }
        public String getMonth(){
            return month;
        }
        public int getDay(){
            return  day;
        }
        public int getYear(){
            return year;
        }
        public void setYear(int year){
            if(year >= 1000 && year <= 9999){
                this.year = year;
            }
            else{
                System.out.println("Invalid year");
            }
        }

        public boolean dateOk(String month, int day, int year){
            if (monthOk(month) && (day > 0 && day < 32) && (year >=1000 && year < 10000))
                return true;
            else
                return false;
        }
        public boolean dateOk(int month, int day, int year){
            if((month  >= 1 && month <= 12) && (day > 0 && day < 32) && (year >=1000 && year < 10000))
                return true;
            else
                return false;
        }


        public boolean monthOk(String month){
            if(month.equals("January")|| month.equals("February")||month.equals("March")||month.equals("April")||month.equals("May")||
                    month.equals("June")||month.equals("July")|| month.equals("August")||month.equals("September")||
                    month.equals("October")||month.equals("November")||month.equals("December")){
                return true;
            }
            else
                return false;
        }

        public String toString(){
            return (month+ " " + day + " " + year);
        }
        public boolean equals(Date otherDate){
            return (month.equals(otherDate.month) && day == otherDate.day && year == otherDate.year);
        }
    }

