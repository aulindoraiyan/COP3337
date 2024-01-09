import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class main {
    public static void main(String[]args){
        Student s1 = new Student(251, "Robert", "B", 81.25);
        Student s2 = new Student(156, "Aulindo", "A", 98.0);
        Student s3 = new Student(166, "Emily", "C", 54.6);
        Student s4 = new Student(169, "Carlos", "A", 92);


        StudentPractice sp1 = new StudentPractice(137, "Raiyan", 4.0, "A");
        StudentPractice sp2 = new StudentPractice(138, "Fiona", 3.7, "B");
        StudentPractice sp3 = new StudentPractice(139, "Fodrogo", 3.4, "C");
        StudentPractice sp4 = new StudentPractice(13, "Daiyan", 2.0, "F");
        StudentPractice sp5 = new StudentPractice(140, "Beta", 3.4, "D");



//        ArrayList<StudentPractice> studentList = new ArrayList<>();
//
//        studentList.add(sp1);
//        studentList.add(sp2);
//        studentList.add(sp3);
//        studentList.add(sp4);
//        studentList.add(sp5);
//
//        Collections.sort(studentList);
//
//        for(StudentPractice o: studentList){
//            System.out.println(o);
//        }




        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list);

            Student[] std = new Student[4];
            std[0] = s1;
            std[1] = s2;
            std[2] = s3;
            std[3] = s4;

            Arrays.sort(std);


        for(Student i: list){
            System.out.println(i);
        }


    }
}
