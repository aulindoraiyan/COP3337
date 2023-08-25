public class StudentDemo {
    public static void main(String[]args){
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = new Student(123, "John", 84.5, 'A');
        System.out.println(s2);

        Student s3 = new Student(564, "Robert", 91.65, 'A');
        System.out.println(s3);

        Student s4 = new Student(s2);
        System.out.println(s1.fee);
        System.out.println(s2.fee);

         s2.fee = 35.75;

        System.out.println(s4.fee);
        s2.setName("Joe");







    }
}
