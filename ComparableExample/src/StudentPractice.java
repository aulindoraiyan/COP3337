public class StudentPractice implements  Comparable<StudentPractice>{
    private int id;
    private String name;
    private double gpa;
    private String grade;

    public StudentPractice(int id, String name, double gpa, String grade) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", grade='" + grade + '\'' ;
    }

//    @Override
////    public int compareTo(StudentPractice o) {
//        if(this.id > o.id){
//            return 1;
//        }
//        else if(this.id < o.id){
//            return -1;
//        }
//        else
//            return 0;
//    }
//    public int compareTo(StudentPractice o){
//        if(this.name.compareTo(o.name) != 0){
//            return o.name.compareTo(this.name);
//        }
//        else {
//            if(this.gpa > o.gpa){
//                return 1;
//            }
//            else if(this.gpa < o.gpa){
//                return -1;
//            }
//            else{
//                return 0;
//            }
//        }
//    }
public int compareTo(StudentPractice o) {
    int nameComparison = o.name.compareTo(this.name);

    if (nameComparison != 0) {
        return nameComparison;
    } else {
        if (this.gpa > o.gpa) {
            return -1;
        } else if (this.gpa < o.gpa) {
            return 1;
        } else {
            return 0;
        }
    }
}



//    @Override
//    public int compareTo(StudentPractice st) {
//        if (this.gpa > st.gpa){
//            return -1;
//        } else if (this.gpa < st.gpa) {
//            return 1;
//        }
//        else
//            return 0;
//    }

}
