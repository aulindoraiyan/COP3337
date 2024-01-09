public class Student implements Comparable<Student>{
    private int ID;
    private String name;
    private String grade;
    private double marks;

    public Student(){
        this(0, "No Name", "F", 0.0);
    }
    public Student(int ID, String name, String grade, double marks){
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }
    //include the setters and getters

    public String toString(){
        return name + " has ID " + ID +  ", grade " + grade + ", and marks " + marks;
    }
    //this method will sort students based on their ID's

//    public int compareTo(Student s) {
//        if (this.ID > s.ID) {
//            return 1;
//        } else if (this.ID < s.ID) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//    public int compareTo(Student s){
//        if(this.ID > s.ID){
//            return -1;
//        }
//        else if(this.ID < s.ID){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }

    //this method will sort based on marks
//    public int compareTo(Student s){
//        if(this.marks > s.marks){
//            return 1; // if I want to reverse where I want to print the greatest value at top, type "return -1" here
//        }
//        else if(this.marks < s.marks){
//            return -1; // if I want to reverse where I want top print the greatest value at top, type "return -1" here
//        }
//        else{
//            return 0;
//
//        }
//    }
//    public int compareTo(Student s){
//        if(this.marks > s.marks){
//            return -1;
//        }
//        else if(this.marks < s.marks){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
//    public int compareTo(Student s){
//        if(this.grade.compareTo(s.grade) != 0){
//            return s.grade.compareTo(this.grade);
//        }
//        return 0;
//    }
//    public int compareTo(Student s){
//        if (this.name.compareTo(s.name) != 0){
//            return this.name.compareTo(s.name);
//        }
//        return 0;
//    }

    //recursion is something that calls it's own method and body
    //this method will compare the students based on their name. which means jaar name e a or name age, jar name er first e z, or name last e
//    public int compareTo(Student s){
//        if(this.name.compareTo(s.name) != 0)
//            return this.name.compareTo(s.name);
//        return 0;
//    }

    //this method will compare the students based on their Grade. which means jaar name e a or name age, jar name er first e z, or name last e
    public int compareTo(Student s){
        if(this.grade.compareTo(s.grade) != 0) {
            return this.grade.compareTo(s.grade);
//            return 0;
        }
        else {
            if (this.marks > s.marks) {
                return -1;
            } else if (this.marks < s.marks) {
                return 1;
            } else {
                return 0;
            }
        }
//
    }


}
