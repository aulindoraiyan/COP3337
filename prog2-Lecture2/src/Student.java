
public class Student {
    public boolean toString;
    private int ID;
    private String name;
    private double percentage;
    private char grade;
    public static double fee = 50.25;

    //because of final keu value change korte parbe na
    public Student() {
        this(0,"No name yet",0.0,'z');
    }
    public Student(int ID, String name, double percentage, char grade) {
     this.ID = ID;
     this.name = name;
     this.percentage = percentage;
     this.grade = grade;
//        setID(ID);
//        setName(name);
//        setPercentage(percentage);
//        setGrade(grade);
    }
    public Student(Student otherStudent) {
     this.ID = otherStudent.ID;
     this.name = otherStudent.name;
     this.percentage = otherStudent.percentage;
     this.grade = otherStudent.grade;
//        this(otherStudent.ID,otherStudent.name,otherStudent.percentage,otherStudent.grade);
    }
    public void setID(int ID) {
        if(ID >= 0)
            this.ID = ID;
        else {
            System.out.println("Invalid ID");
            System.exit(0);
        }
    }
    public int getID() {
        return ID;
    }
    public char getGrade() {
        return grade;
    }
    public void setName(String name) {
        if(name == null) {
            System.out.println("Invalid name");
            System.exit(0);
        }
        else
            this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPercentage(double percentage) {
        if(percentage >= 0.0)
            this.percentage = percentage;
        else {
            System.out.println("Percentage cannot be negative value");
            System.exit(0);
        }
    }
    public double getPercentage() {
        return percentage;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    
    public String toString(){
        return getName() + " has ID " + getID() + " and percentage " + getPercentage() + " with grade + " + getGrade();
    }

    public boolean equals(Student other){
        if(getID() == other.getID() && getName().equals(other.getName())  && getPercentage() == other.getPercentage() && getGrade() == other.getGrade() ) {
            return true;
        }
        else {
            return false;
        }
        }
    }



